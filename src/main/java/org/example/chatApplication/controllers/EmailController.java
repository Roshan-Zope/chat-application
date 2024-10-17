package org.example.chatApplication.controllers;

import org.example.chatApplication.models.EmailModel;
import org.example.chatApplication.services.EmailService;

/**
 * The EmailController class acts as a controller to handle email-related actions.
 * It utilizes the EmailService to send emails by creating an EmailModel and passing it to the service.
 */
public class EmailController {
    private final EmailService emailService = new EmailService();  // EmailService instance to send emails

    /**
     * Sends an email using the provided recipient address, subject, and body.
     *
     * @param to      The recipient's email address.
     * @param subject The subject of the email.
     * @param body    The content of the email body (can include HTML).
     */
    public void sendEmail(String to, String subject, String body) {
        // Create a new EmailModel and set the recipient, subject, and body
        EmailModel emailModel = new EmailModel();
        emailModel.setTo(to);
        emailModel.setSubject(subject);
        emailModel.setBody(body);

        // Use the EmailService to send the email
        emailService.sendMail(emailModel);
    }
}

