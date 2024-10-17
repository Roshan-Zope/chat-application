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
}
