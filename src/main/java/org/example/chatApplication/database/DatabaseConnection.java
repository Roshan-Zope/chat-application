package org.example.chatApplication.database;

import org.example.chatApplication.constants.StringsConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                StringsConstants.DATABASE_URL,
                StringsConstants.DATABASE_USERNAME,
                StringsConstants.DATABASE_PASSWORD
        );
    }
}
