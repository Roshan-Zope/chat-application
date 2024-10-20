package org.example.chatApplication.database.dao;

import org.example.chatApplication.constants.StringsConstants;
import org.example.chatApplication.database.DatabaseConnection;
import org.example.chatApplication.models.Session;

import java.sql.*;
import java.util.Optional;

public class SessionDAO {

    // Create a new session in the database
    public void createSession(int userId, String sessionToken) throws SQLException {

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(StringsConstants.CREATE_SESSION_QUERY)) {
            ps.setInt(1, userId);
            ps.setString(2, sessionToken);
            ps.setString(3, sessionToken);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " in sessionDAO");
        }
    }

    // Retrieve a session by session token
    public Optional<Session> getSessionByToken(String sessionToken) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(StringsConstants.GET_SESSION_BY_SESSION_TOKEN_QUERY)) {

            ps.setString(1, sessionToken);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Session session = new Session(
                        rs.getInt(StringsConstants.DATABASE_SESSIONS_TABLE_USER_ID_COLUMN),
                        rs.getString(StringsConstants.DATABASE_SESSIONS_TABLE_SESSION_TOKEN_COLUMN),
                        rs.getTimestamp(StringsConstants.DATABASE_SESSIONS_TABLE_CREATED_AT_COLUMN),
                        rs.getTimestamp(StringsConstants.DATABASE_SESSIONS_TABLE_LAST_ACTIVE_COLUMN)
                );
                session.setId(rs.getInt(StringsConstants.DATABASE_SESSIONS_TABLE_SESSION_ID_COLUMN));
                return Optional.of(session);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving session: " + e.getMessage());
        }

        return Optional.empty();
    }

    // Update the last activity of a session
    public void updateLastActivity(String sessionToken, Timestamp lastActivity) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(StringsConstants.UPDATE_SESSION_LAST_ACTIVITY_QUERY)) {

            ps.setTimestamp(1, lastActivity);
            ps.setString(2, sessionToken);
            ps.executeUpdate();
        }
    }

    // Invalidate session by session token (delete from the table)
    public void invalidateSession(String sessionToken) throws SQLException {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(StringsConstants.DELETE_SESSION_BY_SESSION_TOKEN_QUERY)) {

            ps.setString(1, sessionToken);
            ps.executeUpdate();
        }
    }
}
