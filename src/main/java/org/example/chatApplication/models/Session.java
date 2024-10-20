package org.example.chatApplication.models;

import java.sql.Timestamp;

public class Session {
    private int id;
    private int userId;
    private String sessionToken;
    private Timestamp createdAt;
    private Timestamp lastActivity;

    // Constructor for a session object
    public Session(int userId, String sessionToken, Timestamp createdAt, Timestamp lastActivity) {
        this.userId = userId;
        this.sessionToken = sessionToken;
        this.createdAt = createdAt;
        this.lastActivity = lastActivity;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Timestamp lastActivity) {
        this.lastActivity = lastActivity;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", userId=" + userId +
                ", sessionToken='" + sessionToken + '\'' +
                ", createdAt=" + createdAt +
                ", lastActivity=" + lastActivity +
                '}';
    }
}
