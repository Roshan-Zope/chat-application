package org.example.chatApplication.services;

import org.example.chatApplication.database.DatabaseConnection;
import org.example.chatApplication.database.dao.SessionDAO;
import org.example.chatApplication.models.Session;

import java.sql.*;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

public class SessionService {

    public void createSession(int userId, String sessionToken) {
        String sql = "INSERT INTO sessions (user_id, session_token, created_at, expires_at) VALUES (?, ?, CURRENT_TIMESTAMP) ON CONFLICT (user_id) DO UPDATE SET session_token = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, userId);
            pstmt.setString(2, sessionToken);
            pstmt.setString(3, sessionToken);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Invalidate a session
    public void invalidateSession(String sessionToken) {
        String sql = "DELETE FROM sessions WHERE session_token = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, sessionToken);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Validate a session (check if session exists and not expired)
    public boolean validateSession(String sessionToken) {
        String sql = "SELECT * FROM sessions WHERE session_token = ? AND expires_at > CURRENT_TIMESTAMP";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, sessionToken);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
