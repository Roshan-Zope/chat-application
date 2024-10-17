package org.example.chatApplication;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import org.example.chatApplication.utilities.Navigator;
import org.example.chatApplication.view.LoginForm;
import org.example.chatApplication.view.SignupForm;
import org.example.chatApplication.constants.ScreenConstants;
import javax.swing.*;
import java.awt.*;

/**
 * The main application class that extends JFrame to create the window for the chat application.
 * This class initializes the UI theme, sets up the navigation system, and displays the login screen initially.
 */
public class App extends JFrame {
    private static Navigator navigator; // The navigator to handle screen transitions

    /**
     * Constructor to initialize the application by calling the init() method.
     */
    public App() { init(); }

    /**
     * Initializes the application's UI components, applies the FlatLaf theme, sets up the navigator,
     * and adds the login and signup screens to the navigator.
     */
    private void init() {
        // Install Roboto font for the UI
        FlatRobotoFont.install();
        // Register custom default sources for FlatLaf themes
        FlatLaf.registerCustomDefaultsSource("themes");
        // Set the default font for the UI
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        try {
            // Set FlatLaf light theme as the look and feel for the application
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        // Optionally, use FlatMacDarkLaf theme by uncommenting the following line
        // FlatMacDarkLaf.setup();

        // Initialize the navigator for handling screen transitions
        navigator = new Navigator();
        add(navigator.getMainPanel()); // Add the main panel to the JFrame

        // Initialize the login and signup screens
        JPanel loginScreen = new LoginForm().getMainPanel();   // Existing login screen class
        JPanel signupScreen = SignupForm.getMainPanel(); // Existing signup screen class

        // Add the login and signup screens to the navigator using constants
        navigator.addScreen(ScreenConstants.LOGIN, loginScreen);
        navigator.addScreen(ScreenConstants.SIGNUP, signupScreen);

        // Show the login screen initially using the screen constant
        navigator.showScreen(ScreenConstants.LOGIN);

        // Set the window title and basic configurations
        setTitle("Login Page");
        setLocationRelativeTo(null); // Center the window on the screen
        setSize(900, 500); // Set the size of the window
        setVisible(true); // Make the window visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
    }

    /**
     * The main method to run the application.
     * It invokes the App constructor in the Swing event dispatch thread.
     *
     * @param args command line arguments
     */
    public static void main( String[] args ) {
        SwingUtilities.invokeLater(App::new); // Launch the application on the event dispatch thread
    }
}
