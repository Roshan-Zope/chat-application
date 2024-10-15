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

public class App extends JFrame {
    private static Navigator navigator;

    public App() { init(); }

    private void init() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        FlatMacDarkLaf.setup();

        navigator = new Navigator();
        add(navigator.getMainPanel());

        JPanel loginScreen = new LoginForm().getMainPanel();   // Existing login screen class
        JPanel signupScreen = SignupForm.getMainPanel(); // Existing signup screen class

        // Add screens to the navigator using constants
        navigator.addScreen(ScreenConstants.LOGIN, loginScreen);
        navigator.addScreen(ScreenConstants.SIGNUP, signupScreen);

        // Show the login screen initially using constants
        navigator.showScreen(ScreenConstants.LOGIN);

        setTitle("Login Page");
        setLocationRelativeTo(null);
        setSize(900, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String[] args ) {
        SwingUtilities.invokeLater(App::new);
    }
}