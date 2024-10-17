package org.example.chatApplication.models.entities;

/**
 * The User class represents the user entity in the chat application.
 * It holds essential information about a user, such as their unique ID (uid), username, email, and password.
 */
public class User {
    private String uid;       // Unique identifier for the user (e.g., a UUID)
    private String username;  // The username of the user
    private String email;     // The user's email address
    private String password;  // The user's password (should be stored securely in a real application)

    /**
     * Constructor to initialize a new User with the provided uid, username, email, and password.
     *
     * @param uid      The unique identifier for the user.
     * @param username The username chosen by the user.
     * @param email    The user's email address.
     * @param password The user's password.
     */
    public User(String uid, String username, String email, String password) {
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /**
     * Gets the username of the user.
     *
     * @return The username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username for the user.
     *
     * @param username The new username to be set for the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the email address of the user.
     *
     * @return The user's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address for the user.
     *
     * @param email The new email address to be set for the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the user.
     *
     * @return The user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for the user.
     *
     * @param password The new password to be set for the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the unique identifier (uid) of the user.
     *
     * @return The user's unique identifier (uid).
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the unique identifier (uid) for the user.
     *
     * @param uid The new uid to be set for the user.
     */
    public void setUid(String uid) {
        this.uid = uid;
    }
}
