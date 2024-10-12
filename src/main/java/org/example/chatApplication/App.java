package org.example.chatApplication;

import org.example.chatApplication.view.LoginForm;

import javax.swing.*;

public class App {
    public static void main( String[] args ) {
        SwingUtilities.invokeLater(() -> {
            LoginForm form = new LoginForm();
            JFrame frame = new JFrame();
            frame.add(form.getMainPanel());
            frame.setSize(900, 500);
            frame.setVisible(true);
        });
    }
}