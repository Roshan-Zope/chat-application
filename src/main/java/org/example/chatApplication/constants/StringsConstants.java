package org.example.chatApplication.constants;

/**
 * The StringsConstants class defines constant string values that are used throughout the application.
 * These constants store keys for email configuration properties and file names.
 */
public class StringsConstants {
    // Path to the email configuration properties file
    public static final String EMAIL_PROPERTIES = "email.properties";

    // Constants for email configuration keys in the properties file
    public static final String SPRING_MAIL_HOST = "spring.mail.host";         // Key for the SMTP server host
    public static final String SPRING_MAIL_PORT = "spring.mail.port";         // Key for the SMTP server port
    public static final String SPRING_MAIL_USERNAME = "spring.mail.username"; // Key for the email account username
    public static final String SPRING_MAIL_PASSWORD = "spring.mail.password"; // Key for the email account password

    // Constants for database connection
    public static final String DATABASE_URL = "jdbc:postgresql://localhost/chatApplication"; // Url for the postgresql localhost server
    public static final String DATABASE_USERNAME = "postgres";                               // Username for the postgresql server
    public static final String DATABASE_PASSWORD = "Ro$h@n456";                              // Password for the postgresql server

    // Constants for User table schema
    public static final String DATABASE_USER_TABLE = "user";                          // Table name (user)
    public static final String DATABASE_USER_TABLE_UID_COLUMN = "uid";                // Column name (uid)
    public static final String DATABASE_USER_TABLE_USERNAME_COLUMN = "username";      // Column name (username)
    public static final String DATABASE_USER_TABLE_EMAIL_COLUMN = "email";            // Column name (email)
    public static final String DATABASE_USER_TABLE_PASSWORD_COLUMN = "password";      // Column name (password)
    public static final String DATABASE_USER_TABLE_CREATED_AT_COLUMN = "created_at";  // Column name (created_at)

    // Constants for Sessions table schema
    public static final String DATABASE_SESSIONS_TABLE = "sessions";                       // Table name (sessions)
    public static final String DATABASE_SESSIONS_TABLE_SESSION_ID_COLUMN = "session_id";   // Column name (session_id)
    public static final String DATABASE_SESSIONS_TABLE_USER_ID_COLUMN = "user_id";         // Column name (user_id)
    public static final String DATABASE_SESSIONS_TABLE_SESSION_TOKEN_COLUMN = "email";     // Column name (session_token)
    public static final String DATABASE_SESSIONS_TABLE_EXPIRES_AT_COLUMN = "password";     // Column name (expires_at)
    public static final String DATABASE_SESSIONS_TABLE_CREATED_AT_COLUMN = "created_at";   // Column name (created_at)
    public static final String DATABASE_SESSIONS_TABLE_LAST_ACTIVE_COLUMN = "last_active"; // Column name (last_active)

    // Constants for database Query
    public static final String GET_USER_BY_USERNAME_QUERY = "select * from user where username = ?"; // Query for retrieving user by username
}
