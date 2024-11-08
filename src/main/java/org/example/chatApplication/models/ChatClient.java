package org.example.chatApplication.models;

import org.example.chatApplication.view.HomeForm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.function.Consumer;

public class ChatClient {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private HomeForm clientHome;

    public ChatClient(String address, int port) {
        try {
            socket = new Socket(address, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            clientHome = new HomeForm("Client");

            clientHome.getSendButton().addActionListener(e -> sendMessage());

            // Receive messages from server and display on the client's GUI
            new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        clientHome.getMessageArea().append("\n\n" +message + "\n");
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
        String message = clientHome.getInputField().getText();
        if (!message.isEmpty()) {
            out.println(message);
            clientHome.getInputField().setText("");
        }
    }

    public static void main(String[] args) {
        new ChatClient("127.0.0.1", 2000); // Adjust IP as needed
    }
}
