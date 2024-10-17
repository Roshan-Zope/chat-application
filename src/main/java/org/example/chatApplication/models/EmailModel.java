package org.example.chatApplication.models;

/**
 * The EmailModel class represents the structure of an email message.
 * It contains the recipient's email address, the subject of the email, and the body of the message.
 * This model is used to pass email data to the EmailService for sending emails.
 */
public class EmailModel {
    private String to;      // The recipient's email address
    private String subject; // The subject of the email
    private String body;    // The body content of the email (can include HTML)

    /**
     * Gets the recipient's email address.
     *
     * @return The recipient's email address.
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the recipient's email address.
     *
     * @param to The email address to send the email to.
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Gets the subject of the email.
     *
     * @return The subject of the email.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject of the email.
     *
     * @param subject The subject to be used in the email.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Gets the body content of the email.
     *
     * @return The body of the email.
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the body content of the email.
     *
     * @param body The content or message to be included in the email body (can be plain text or HTML).
     */
    public void setBody(String body) {
        this.body = body;
    }
}
