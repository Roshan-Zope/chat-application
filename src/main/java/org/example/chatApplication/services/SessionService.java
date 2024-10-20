package org.example.chatApplication.services;

import org.example.chatApplication.database.DatabaseConnection;
import org.example.chatApplication.database.dao.SessionDAO;
import org.example.chatApplication.models.Session;

import java.sql.*;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class SessionService {

    private final SessionDAO sessionDAO = new SessionDAO();

    public void createSession(int userId, String sessionToken) {
        try {
            sessionDAO.createSession(userId, sessionToken);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Invalidate a session
    public void invalidateSession(String sessionToken) {
        try {
             sessionDAO.invalidateSession(sessionToken);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Validate a session (check if session exists and not expired)
    public boolean validateSession(String sessionToken) {
        Optional<Session> session = sessionDAO.getSessionByToken(sessionToken);
        return session.isPresent();
    }
}
