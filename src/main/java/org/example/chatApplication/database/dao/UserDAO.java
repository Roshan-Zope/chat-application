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

            }
        } catch (SQLException e) {

        }
    }
}
