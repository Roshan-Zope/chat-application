package org.example.chatApplication.controllers;


import org.example.chatApplication.services.SessionService;

public class SessionController {

    private SessionService sessionService = new SessionService();

    // Create a session for a user
    public void createSession(int userId, String sessionToken) {
        sessionService.createSession(userId, sessionToken);
    }

    // Invalidate a session by session token
    public void invalidateSession(String sessionToken) {
        sessionService.invalidateSession(sessionToken);
    }

    // Validate a session
    public boolean validateSession(String sessionToken) {
        return sessionService.validateSession(sessionToken);
    }

    public void logout(String sessionToken) {
        if (sessionToken != null) {
            sessionService.invalidateSession(sessionToken);
        }
    }
}
