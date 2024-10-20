package org.example.chatApplication.database.dao;

import org.example.chatApplication.database.DatabaseConnection;
import org.example.chatApplication.models.Session;

import java.sql.*;
import java.util.Optional;

public class SessionDAO {

    // Create a new session in the database
    public void createSession(Session session) throws SQLException {
        String sql = "INSERT INTO sessions (user_id, session_token, created_at, last_activity) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, session.getUserId());
            pstmt.setString(2, session.getSessionToken());
            pstmt.setTimestamp(3, session.getCreatedAt());
            pstmt.setTimestamp(4, session.getLastActivity());

            pstmt.executeUpdate();
        }
    }

    // Retrieve a session by session token
    public Optional<Session> getSessionByToken(String sessionToken) {
        String sql = "SELECT * FROM sessions WHERE session_token = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, sessionToken);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Session session = new Session(
                        rs.getInt("user_id"),
                        rs.getString("session_token"),
                        rs.getTimestamp("created_at"),
                        rs.getTimestamp("last_activity")
                );
                session.setId(rs.getInt("id"));
                return Optional.of(session);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving session: " + e.getMessage());
        }

        return Optional.empty();
    }

    // Update the last activity of a session
    public void updateLastActivity(String sessionToken, Timestamp lastActivity) throws SQLException {
        String sql = "UPDATE sessions SET last_activity = ? WHERE session_token = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setTimestamp(1, lastActivity);
            pstmt.setString(2, sessionToken);
            pstmt.executeUpdate();
        }
    }

    // Invalidate session by session token (delete from the table)
    public void invalidateSession(String sessionToken) throws SQLException {
        String sql = "DELETE FROM sessions WHERE session_token = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, sessionToken);
            pstmt.executeUpdate();
        }
    }

    // Invalidate all sessions for a user (during logout)
    public void invalidateSessionByUserId(int userId) throws SQLException {
        String sql = "DELETE FROM sessions WHERE user_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, userId);
            pstmt.executeUpdate();
        }
    }
}
