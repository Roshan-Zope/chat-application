package org.example.chatApplication.utilities;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * The Navigator class is responsible for managing screen transitions in the chat application.
 * It uses a CardLayout to switch between different screens (JPanels) based on their assigned names.
 */
public class Navigator {
    private JPanel mainPanel;  // The main panel that holds all screens and uses CardLayout
    private CardLayout cardLayout;  // Layout manager for handling screen switching
    private HashMap<String, JPanel> screens;  // A map to store screens with their corresponding names

    /**
     * Constructor to initialize the main panel with CardLayout and set up the screen map.
     */
    public Navigator() {
        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        screens = new HashMap<>();

        // Set the layout of the main panel to CardLayout
        mainPanel.setLayout(cardLayout);
    }

    /**
     * Adds a new screen (JPanel) to the navigator using the provided name.
     * This allows the screen to be referenced by name later for display.
     *
     * @param name  The name to identify the screen (usually stored as a constant)
     * @param panel The JPanel representing the screen to be added
     */
    public void addScreen(String name, JPanel panel) {
        screens.put(name, panel);  // Store the panel with the corresponding name
        mainPanel.add(panel, name);  // Add the panel to the main panel with CardLayout
    }

    /**
     * Displays the screen associated with the provided name by showing the corresponding JPanel.
     * If the screen is not found, an error message is printed to the console.
     *
     * @param name The name of the screen to be displayed (must have been added earlier)
     */
    public void showScreen(String name) {
        if (screens.containsKey(name)) {
            // Show the screen with the corresponding name
            cardLayout.show(mainPanel, name);
        } else {
            // Print an error message if the screen is not found
            System.out.println("Screen " + name + " not found!");
        }
    }

    /**
     * Returns the main panel managed by the navigator.
     * This is used to integrate the navigator into the application's main frame.
     *
     * @return The main JPanel that holds all the screens
     */
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
