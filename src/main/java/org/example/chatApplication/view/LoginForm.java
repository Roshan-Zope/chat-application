/*
 * Created by JFormDesigner on Thu Oct 10 16:23:23 IST 2024
 */

package org.example.chatApplication.view;

import org.checkerframework.checker.units.qual.A;
import org.example.chatApplication.constants.ScreenConstants;
import org.example.chatApplication.controllers.AuthController;
import org.example.chatApplication.utilities.Navigator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author shelt
 */
public class LoginForm extends JPanel {
    private AuthController authController;
    private Navigator navigator;

    public LoginForm() {
        initComponents();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void onLogin(ActionEvent e) {
        String username = usernameTF.getText().trim();
        String password = String.valueOf(passwordPF.getPassword()).trim();

        System.out.println(username + " " + password);

        if (authController.login(username, password)) {
            System.out.println("Login successful");
            navigator.showScreen(ScreenConstants.HOME);
        } else {
            System.out.println("login failed");
        }
    }

    private void onSignupLink(ActionEvent e) {
        navigator.showScreen(ScreenConstants.SIGNUP);
    }

    private void initComponents() {
        authController = new AuthController();
        navigator = Navigator.getInstance();

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
        mainPanel = new JPanel();
        leftPanel = new JPanel();
        loginImage = new JLabel();
        rightPanel = new JPanel();
        loginLbl = new JLabel();
        usernameLbl = new JLabel();
        usernameTF = new JTextField();
        passwordLbl = new JLabel();
        passwordPF = new JPasswordField();
        forgotPasswordBtn = new JButton();
        signupLink = new JButton();
        loginBtn = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
        javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
        . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
        .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans.
        PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
        equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

        //======== mainPanel ========
        {
            mainPanel.setPreferredSize(new Dimension(900, 500));
            mainPanel.setVerifyInputWhenFocusTarget(false);
            mainPanel.setOpaque(false);
            mainPanel.setMinimumSize(new Dimension(900, 500));
            mainPanel.setMaximumSize(new Dimension(900, 500));

            //======== leftPanel ========
            {
                leftPanel.setPreferredSize(new Dimension(360, 500));
                leftPanel.setBackground(new Color(0x00000000, true));
                leftPanel.setMinimumSize(new Dimension(360, 500));

                //---- loginImage ----
                loginImage.setHorizontalAlignment(SwingConstants.CENTER);
                loginImage.setIcon(new ImageIcon(getClass().getResource("/Images/file.png")));

                GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
                leftPanel.setLayout(leftPanelLayout);
                leftPanelLayout.setHorizontalGroup(
                    leftPanelLayout.createParallelGroup()
                        .addComponent(loginImage, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                );
                leftPanelLayout.setVerticalGroup(
                    leftPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(loginImage, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE))
                );
            }

            //======== rightPanel ========
            {
                rightPanel.setPreferredSize(new Dimension(540, 500));
                rightPanel.setBackground(new Color(0x0d7dd3));
                rightPanel.setMinimumSize(new Dimension(540, 500));

                //---- loginLbl ----
                loginLbl.setText("Login");
                loginLbl.setHorizontalAlignment(SwingConstants.CENTER);
                loginLbl.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
                loginLbl.setForeground(Color.white);

                //---- usernameLbl ----
                usernameLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                usernameLbl.setText("Username");
                usernameLbl.setForeground(Color.white);

                //---- passwordLbl ----
                passwordLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                passwordLbl.setText("Password");
                passwordLbl.setForeground(Color.white);

                //---- forgotPasswordBtn ----
                forgotPasswordBtn.setText("Forgot Password?");
                forgotPasswordBtn.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
                forgotPasswordBtn.setBackground(Color.white);
                forgotPasswordBtn.setOpaque(false);
                forgotPasswordBtn.setBorderPainted(false);
                forgotPasswordBtn.setDisplayedMnemonicIndex(0);
                forgotPasswordBtn.setContentAreaFilled(false);
                forgotPasswordBtn.setForeground(Color.white);

                //---- signupLink ----
                signupLink.setText("Don't have an account? Sign up here");
                signupLink.setBackground(new Color(0x0d92f4));
                signupLink.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
                signupLink.setContentAreaFilled(false);
                signupLink.setBorderPainted(false);
                signupLink.setForeground(Color.white);
                signupLink.addActionListener(e -> onSignupLink(e));

                //---- loginBtn ----
                loginBtn.setText("Login");
                loginBtn.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 22));
                loginBtn.setBackground(Color.white);
                loginBtn.setOpaque(false);
                loginBtn.addActionListener(e -> onLogin(e));

                GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
                rightPanel.setLayout(rightPanelLayout);
                rightPanelLayout.setHorizontalGroup(
                    rightPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(rightPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                    .addComponent(loginLbl, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                    .addGap(182, 182, 182))
                                .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                    .addComponent(forgotPasswordBtn)
                                    .addGap(176, 176, 176))))
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                            .addGap(0, 96, Short.MAX_VALUE)
                            .addGroup(rightPanelLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                    .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                    .addGap(138, 138, 138))
                                .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                    .addGroup(rightPanelLayout.createParallelGroup()
                                        .addComponent(usernameLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(signupLink))
                                        .addComponent(passwordLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                                    .addGap(84, 84, 84))))
                );
                rightPanelLayout.setVerticalGroup(
                    rightPanelLayout.createParallelGroup()
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(loginLbl, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(usernameLbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(passwordLbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(forgotPasswordBtn)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(signupLink)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(46, Short.MAX_VALUE))
                );
            }

            GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JLabel loginImage;
    private JPanel rightPanel;
    private JLabel loginLbl;
    private JLabel usernameLbl;
    private JTextField usernameTF;
    private JLabel passwordLbl;
    private JPasswordField passwordPF;
    private JButton forgotPasswordBtn;
    private JButton signupLink;
    private JButton loginBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
