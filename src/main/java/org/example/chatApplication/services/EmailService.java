package org.example.chatApplication.services;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.example.chatApplication.constants.StringsConstants;
import org.example.chatApplication.models.EmailModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The EmailService class is responsible for sending HTML emails using the Apache Commons Email library.
 * It reads the SMTP server configuration from a properties file and uses these settings to send emails.
 */
public class EmailService {
    private String smtpServer;  // SMTP server address (e.g., smtp.gmail.com)
    private int smtpPort;  // SMTP server port (e.g., 587)
    private String username;  // Username for SMTP authentication (typically the email address)
    private String password;  // Password or app-specific password for SMTP authentication

    /**
     * Constructor for EmailService that loads the SMTP configuration from a properties file.
     * It initializes the SMTP server, port, username, and password required for sending emails.
     */
    public EmailService() {
        Properties properties = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(StringsConstants.EMAIL_PROPERTIES)) {
            properties.load(inputStream);  // Load properties from the specified file
        } catch (IOException e) {
            e.printStackTrace();
            return;  // Exit if properties cannot be loaded
        }
        // Initialize SMTP server configurations using values from the properties file
        smtpServer = properties.getProperty(StringsConstants.SPRING_MAIL_HOST);
        smtpPort = Integer.valueOf(properties.getProperty(StringsConstants.SPRING_MAIL_PORT));
        username = properties.getProperty(StringsConstants.SPRING_MAIL_USERNAME);
        password = properties.getProperty(StringsConstants.SPRING_MAIL_PASSWORD);
    }

    /**
     * Sends an HTML email using the given EmailModel.
     * The method configures the email server settings and sends an email with the subject and body defined in the model.
     *
     * @param emailModel The model containing the email recipient, subject, and body.
     */
    public void sendMail(EmailModel emailModel) {
        HtmlEmail htmlEmail = new HtmlEmail();
        // Set SMTP server configurations
        htmlEmail.setHostName(smtpServer);
        htmlEmail.setSmtpPort(smtpPort);
        htmlEmail.setAuthenticator(new DefaultAuthenticator(username, password));  // SMTP authentication
        htmlEmail.setStartTLSEnabled(true);  // Enable TLS for secure email transmission
        try {
            // Set the email sender
            htmlEmail.setFrom(username);
            // Add the recipient email address
            htmlEmail.addTo(emailModel.getTo());
            // Set the email subject
            htmlEmail.setSubject(emailModel.getSubject());
            // Set the email body in HTML format
            htmlEmail.setHtmlMsg("<html><body>" + emailModel.getBody() + "</body></html>");
            // Send the email
            htmlEmail.send();
        } catch (EmailException e) {
            e.printStackTrace();  // Log and handle email sending exceptions
        }
    }
}
