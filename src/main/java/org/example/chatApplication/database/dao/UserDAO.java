package org.example.chatApplication.database.dao;

import org.example.chatApplication.constants.StringsConstants;
import org.example.chatApplication.database.DatabaseConnection;
import org.example.chatApplication.models.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public User getUserByUsername(String username) {
        try (
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement query = connection.prepareStatement(StringsConstants.GET_USER_BY_USERNAME_QUERY)
        ) {
            query.setString(1, username);
            ResultSet resultSet = query.executeQuery();

            if (resultSet.next()) {
                return new User(
                    resultSet.getInt(StringsConstants.DATABASE_USER_TABLE_UID_COLUMN),
                    resultSet.getString(StringsConstants.DATABASE_USER_TABLE_USERNAME_COLUMN),
                    resultSet.getString(StringsConstants.DATABASE_USER_TABLE_EMAIL_COLUMN),
                    resultSet.getString(StringsConstants.DATABASE_USER_TABLE_PASSWORD_COLUMN)
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void saveUser(User user) {
        try (
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement query = connection.prepareStatement(StringsConstants.SAVE_USER_QUERY)
        ) {
           query.setString(1, user.getUsername());
           query.setString(2, user.getEmail());
           query.setString(3, user.getPassword());
           query.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
