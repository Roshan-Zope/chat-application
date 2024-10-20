package org.example.chatApplication.services;

import org.example.chatApplication.controllers.EmailController;
import org.example.chatApplication.database.SessionStorage;
import org.example.chatApplication.database.dao.SessionDAO;
import org.example.chatApplication.database.dao.UserDAO;
import org.example.chatApplication.models.Session;
import org.example.chatApplication.models.entities.User;
import org.example.chatApplication.utilities.OTPGenerator;

import java.util.Optional;

public class AuthService {
    private UserDAO userDAO = new UserDAO();
    private SessionService sessionService = new SessionService();
    private SessionDAO sessionDAO = new SessionDAO();

    public boolean login(String username, String password) {
        User user = userDAO.getUserByUsername(username);
        if (user != null) {
            return user.getPassword().trim().equals(password.trim());
        }
        return false;
    }

    public int getUserId(String username) {
        User user = userDAO.getUserByUsername(username);
        if (user != null) {
            return user.getUid();
        }
        return -1;
    }

    public boolean signUp(String username, String email, String password, boolean validateOtp) {
        User existingUser = userDAO.getUserByUsername(username);

        // Check if username already exists
        if (existingUser != null) {
            System.out.println("Sign-up failed: Username already exists.");
            return false;
        }

        // Create a new user and save to the database
        User newUser = new User(username, email, password);
        userDAO.saveUser(newUser);
        if (validateOtp) {
            System.out.println("Sign-up successful for user: " + username);
            return true;
        }
        return false;
    }

    public void logout() {
        Optional<Session> session = sessionDAO.getSessionByToken(SessionStorage.loadSessionToken());
        // Invalidate the session for the user
        if (session.isPresent()) {
            sessionService.invalidateSession(String.valueOf(session.get().getUserId()));
            SessionStorage.clearSessionToken();
            System.out.println("User logged out and session invalidated.");
        } else {
            System.out.println("Log out Failed...");
        }
    }
}
