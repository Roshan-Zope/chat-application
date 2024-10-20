package org.example.chatApplication.database;

import java.io.*;

public class SessionStorage {
    private static final String SESSION_FILE = "session.txt";

    // Store session token in a local file
    public static void saveSessionToken(String sessionToken) {
        String userHome = System.getProperty("user.home");
        // Create a file object for the session.txt file
        File sessionFile = new File(userHome, SESSION_FILE);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sessionFile))) {
            writer.write(sessionToken);
        } catch (IOException e) {
            System.out.println("Failed to save session token: " + e.getMessage());
        }
    }

    // Load session token from the local file
    public static String loadSessionToken() {
        File file = new File(System.getProperty("user.home"), SESSION_FILE);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Failed to load session token: " + e.getMessage());
        }
        return null;
    }

    // Clear session token from the local file (on logout)
    public static void clearSessionToken() {

        File file = new File(System.getProperty("user.home"), SESSION_FILE);
        if (file.exists()) {
            file.delete();
        }
    }
}
