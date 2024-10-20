package org.example.chatApplication.controllers;

import org.example.chatApplication.database.SessionStorage;
import org.example.chatApplication.services.AuthService;

import java.util.UUID;

public class AuthController {
    private AuthService authService = new AuthService();
    private SessionController sessionController = new SessionController();

    public boolean login(String username, String password) {

        System.out.println(username + " " + password);
        boolean loginSuccess = authService.login(username, password);

        if (loginSuccess) {
            String sessionToken = UUID.randomUUID().toString();
            SessionStorage.saveSessionToken(sessionToken);
            sessionController.createSession(authService.getUserId(username), sessionToken);
            return true;
        }
        return false;
    }

    public boolean signUp(String username, String email, String password, boolean validateOtp) {
        return authService.signUp(username, email, password, validateOtp);
    }
    
    public void logout() {
        authService.logout();
    }
}
