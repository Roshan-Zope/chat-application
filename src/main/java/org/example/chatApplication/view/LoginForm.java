/*
 * Created by JFormDesigner on Thu Oct 10 16:23:23 IST 2024
 */

package org.example.chatApplication.view;

import java.awt.*;
import javax.swing.*;
//import org.jdesktop.layout.GroupLayout;
//import org.jdesktop.layout.LayoutStyle;

/**
 * @author shelt
 */
public class LoginForm extends JPanel {
    public LoginForm() {
        initComponents();
    }

    public JPanel getMainPanel() {
        return panel2;
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Snehal Shelte
        panel1 = new JPanel();
        panel2 = new JPanel();
        LoginLbl = new JLabel();
        usernameLbl = new JLabel();
        usernameTF = new JTextField();
        passwordLbl = new JLabel();
        passwordPF = new JPasswordField();
        forgotPasswordBtn = new JButton();
        signupLink = new JButton();
        loginBtn = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
        javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax
        .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
        .awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt
        .Color.red), getBorder())); addPropertyChangeListener(new java.beans.
        PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062order".
        equals(e.getPropertyName()))throw new RuntimeException();}});

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(360, 500));
            panel1.setBackground(new Color(0x00000000, true));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 360, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 538, Short.MAX_VALUE)
            );
        }

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(540, 500));
            panel2.setBackground(new Color(0x0d92f4));

            //---- LoginLbl ----
            LoginLbl.setText("Login");
            LoginLbl.setHorizontalAlignment(SwingConstants.CENTER);
            LoginLbl.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
            LoginLbl.setForeground(Color.white);

            //---- usernameLbl ----
            usernameLbl.setHorizontalAlignment(SwingConstants.CENTER);
            usernameLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
            usernameLbl.setText("Username");
            usernameLbl.setForeground(Color.white);

            //---- passwordLbl ----
            passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
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

            //---- loginBtn ----
            loginBtn.setText("Login");
            loginBtn.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 22));
            loginBtn.setBackground(Color.white);
            loginBtn.setBorderPainted(false);
            loginBtn.setOpaque(false);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 213, Short.MAX_VALUE)
                        .addComponent(LoginLbl, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(usernameLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(forgotPasswordBtn))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(signupLink))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(84, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(LoginLbl, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(usernameLbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(passwordLbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(forgotPasswordBtn)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupLink)
                        .addGap(30, 30, 30)
                        .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Snehal Shelte
    private JPanel panel1;
    private JPanel panel2;
    private JLabel LoginLbl;
    private JLabel usernameLbl;
    private JTextField usernameTF;
    private JLabel passwordLbl;
    private JPasswordField passwordPF;
    private JButton forgotPasswordBtn;
    private JButton signupLink;
    private JButton loginBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
