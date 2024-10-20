package org.example.chatApplication.controllers;

import org.example.chatApplication.models.EmailModel;
import org.example.chatApplication.services.EmailService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The EmailController class acts as a controller to handle email-related actions.
 * It utilizes the EmailService to send emails by creating an EmailModel and passing it to the service.
 */
public class EmailController {
    private static final EmailService emailService = new EmailService();  // EmailService instance to send emails
    private static final ExecutorService executorService = Executors.newCachedThreadPool();

    public static void sendEmailAsync(String to, String subject, String body) {
        executorService.submit(() -> {
            try {
                sendEmail(to, subject, body);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }

    /**
     * Sends an email using the provided recipient address, subject, and body.
     *
     * @param to      The recipient's email address.
     * @param subject The subject of the email.
     * @param body    The content of the email body (can include HTML).
     */
    private static void sendEmail(String to, String subject, String body) {
        // Create a new EmailModel and set the recipient, subject, and body
        EmailModel emailModel = new EmailModel();
        emailModel.setTo(to);
        emailModel.setSubject(subject);
        emailModel.setBody(body);

        // Use the EmailService to send the email
        emailService.sendMail(emailModel);
    }
}

