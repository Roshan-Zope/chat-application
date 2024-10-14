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
        leftPanel = new JPanel();
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

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );

        //======== leftPanel ========
        {

            GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
            leftPanel.setLayout(leftPanelLayout);
            leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup()
                    .addGap(0, 360, Short.MAX_VALUE)
            );
            leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup()
                    .addGap(0, 500, Short.MAX_VALUE)
            );
        }

        //======== rightPanel ========
        {
            rightPanel.setBackground(new Color(0x0d92f4));

            //---- signupLbl ----
            signupLbl.setText("Sign Up");
            signupLbl.setHorizontalAlignment(SwingConstants.CENTER);
            signupLbl.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));

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
            button1.setText("Already have an accoubnt? Login here...");
            button1.setContentAreaFilled(false);
            button1.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 13));

            //---- button2 ----
            button2.setText("Sign up");
            button2.setContentAreaFilled(false);
            button2.setFont(new Font("JetBrains Mono", Font.BOLD, 13));

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
                                .addGap(78, 78, 78)
                                .addComponent(confirmPasswordLbl))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(rightPanelLayout.createParallelGroup()
                                    .addComponent(confirmPasswordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordPF, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                        .addComponent(emailTF)
                                        .addComponent(passwordLbl)
                                        .addComponent(emailLbl))
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(button1))))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(button2)))
                        .addContainerGap(258, Short.MAX_VALUE))
            );
            rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(signupLbl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(emailLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmPasswordLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmPasswordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2)
                        .addContainerGap(28, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(leftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
    private JPanel mainPanel;
    private JPanel leftPanel;
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
