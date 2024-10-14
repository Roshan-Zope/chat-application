package org.example.chatApplication;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import org.example.chatApplication.view.LoginForm;
import org.example.chatApplication.view.SignupForm;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App() {
        init();
    }

    private void init() {
        setSize(900, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String[] args ) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new App();
            frame.setContentPane(SignupForm.getMainPanel());
            frame.setTitle("Login Page");
        });
    }
}