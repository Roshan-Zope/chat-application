/*
 * Created by JFormDesigner on Sun Oct 13 01:08:49 IST 2024
 */

package org.example.chatApplication.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author rosha
 */
public class SignupForm extends JPanel {
    public SignupForm() {
        initComponents();
    }

    public static JPanel getMainPanel() {
        return new SignupForm();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
        mainPanel = new JPanel();
        rightPanel = new JPanel();
        signupLbl = new JLabel();
        emailLbl = new JLabel();
        emailTF = new JTextField();
        passwordLbl = new JLabel();
        passwordPF = new JPasswordField();
        confirmPasswordLbl = new JLabel();
        confirmPasswordPF = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        usernameLbl = new JLabel();
        usernameTF = new JTextField();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;

        //======== rightPanel ========
        {
            rightPanel.setBackground(new Color(0x0d92f4));

            //---- signupLbl ----
            signupLbl.setText("Sign Up");
            signupLbl.setHorizontalAlignment(SwingConstants.CENTER);
            signupLbl.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
            signupLbl.setPreferredSize(new Dimension(100, 100));

            //---- emailLbl ----
            emailLbl.setText("Email");
            emailLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

            //---- passwordLbl ----
            passwordLbl.setText("Password");
            passwordLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

            //---- confirmPasswordLbl ----
            confirmPasswordLbl.setText("Confirm Password");
            confirmPasswordLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

            //---- button1 ----
            button1.setText("Already have an account? Login here...");
            button1.setContentAreaFilled(false);
            button1.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 13));
            button1.setBorderPainted(false);

            //---- button2 ----
            button2.setText("Sign up");
            button2.setContentAreaFilled(false);
            button2.setFont(new Font("JetBrains Mono", Font.BOLD, 13));
            button2.setBorderPainted(false);

            //---- usernameLbl ----
            usernameLbl.setText("Username");
            usernameLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));

            GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
            rightPanel.setLayout(rightPanelLayout);
            rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup()
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(signupLbl, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(button2))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(button1))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(confirmPasswordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(rightPanelLayout.createParallelGroup()
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(confirmPasswordLbl))
                                        .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(passwordPF, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                            .addComponent(passwordLbl))
                                        .addComponent(emailLbl)
                                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLbl)
                                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(258, Short.MAX_VALUE))
            );
            rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(signupLbl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameLbl)
                        .addGap(10, 10, 10)
                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmPasswordLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmPasswordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1)
                        .addGap(18, 18, 18)
                        .addComponent(button2)
                        .addContainerGap(78, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
    private JPanel mainPanel;
    private JPanel rightPanel;
    private JLabel signupLbl;
    private JLabel emailLbl;
    private JTextField emailTF;
    private JLabel passwordLbl;
    private JPasswordField passwordPF;
    private JLabel confirmPasswordLbl;
    private JPasswordField confirmPasswordPF;
    private JButton button1;
    private JButton button2;
    private JLabel usernameLbl;
    private JTextField usernameTF;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
