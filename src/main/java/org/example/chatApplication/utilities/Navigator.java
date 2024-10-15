package org.example.chatApplication.utilities;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Navigator {
    private JPanel mainPanel;  // Main panel with CardLayout
    private CardLayout cardLayout;  // CardLayout for switching screens
    private HashMap<String, JPanel> screens;  // Map to store screens by name

    public Navigator() {
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        screens = new HashMap<>();

        mainPanel.setLayout(cardLayout);
    }

    // Add a screen using constants
    public void addScreen(String name, JPanel panel) {
        screens.put(name, panel);
        mainPanel.add(panel, name);
    }

    // Show a screen using constants
    public void showScreen(String name) {
        if (screens.containsKey(name)) {
            cardLayout.show(mainPanel, name);
        } else {
            System.out.println("Screen " + name + " not found!");
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
