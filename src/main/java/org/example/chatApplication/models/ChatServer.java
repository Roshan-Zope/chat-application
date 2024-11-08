package org.example.chatApplication.models;

import org.example.chatApplication.view.HomeForm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    private HomeForm serverHome;

    public ChatServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            serverHome = new HomeForm("Server");
//            serverHome.getMessageArea().append("Server started on port " + port + "\n");

            // Accept client connection
            clientSocket = serverSocket.accept();
//            serverHome.getMessageArea().append("Client connected.\n");

            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Handle sending messages from the server UI
            serverHome.getSendButton().addActionListener(e -> sendMessage());

            // Receive messages from client and display on the server's GUI
            new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        serverHome.getMessageArea().append("\n\nClient1: " + message + "\n");
                        // Echo back to client
                        out.println("Client1: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        String message = serverHome.getInputField().getText();
        if (!message.isEmpty()) {
            out.println("Client2: " + message);
            serverHome.getMessageArea().append("\n\nClient2: " + message + "\n");
            serverHome.getInputField().setText("");
        }
    }

    public static void main(String[] args) {
        new ChatServer(2000);
    }
}
