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
        loginLinkBtn = new JButton();
        button2 = new JButton();
        usernameLbl = new JLabel();
        usernameTF = new JTextField();
        signupBtn = new JButton();
        leftPanel = new JPanel();
        signupImage = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );

        //======== rightPanel ========
        {
            rightPanel.setBackground(new Color(0x0d7dd3));

            //---- signupLbl ----
            signupLbl.setText("Sign Up");
            signupLbl.setHorizontalAlignment(SwingConstants.CENTER);
            signupLbl.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
            signupLbl.setPreferredSize(new Dimension(100, 100));
            signupLbl.setForeground(Color.white);

            //---- emailLbl ----
            emailLbl.setText("Email");
            emailLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
            emailLbl.setForeground(Color.white);

            //---- passwordLbl ----
            passwordLbl.setText("Password");
            passwordLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
            passwordLbl.setForeground(Color.white);

            //---- confirmPasswordLbl ----
            confirmPasswordLbl.setText("Confirm Password");
            confirmPasswordLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
            confirmPasswordLbl.setForeground(Color.white);

            //---- loginLinkBtn ----
            loginLinkBtn.setText("Already have an account? Login here...");
            loginLinkBtn.setContentAreaFilled(false);
            loginLinkBtn.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 13));
            loginLinkBtn.setBorderPainted(false);
            loginLinkBtn.setForeground(Color.white);

            //---- button2 ----
            button2.setText("Sign up");
            button2.setContentAreaFilled(false);
            button2.setFont(new Font("JetBrains Mono", Font.BOLD, 13));
            button2.setBorderPainted(false);
            button2.setForeground(Color.white);

            //---- usernameLbl ----
            usernameLbl.setText("Username");
            usernameLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
            usernameLbl.setForeground(Color.white);

            //---- signupBtn ----
            signupBtn.setText("Sign Up");
            signupBtn.setBackground(Color.white);

            GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
            rightPanel.setLayout(rightPanelLayout);
            rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup()
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(rightPanelLayout.createParallelGroup()
                                    .addComponent(usernameLbl)
                                    .addComponent(passwordLbl)
                                    .addComponent(emailLbl)
                                    .addComponent(confirmPasswordLbl)
                                    .addComponent(confirmPasswordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(signupLbl, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(loginLinkBtn))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addGroup(rightPanelLayout.createParallelGroup()
                                    .addComponent(signupBtn, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2))))
                        .addContainerGap(110, Short.MAX_VALUE))
            );
            rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(signupLbl, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(usernameLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmPasswordLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmPasswordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginLinkBtn)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupBtn, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(button2)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== leftPanel ========
        {

            //---- signupImage ----
            signupImage.setHorizontalAlignment(SwingConstants.CENTER);
            signupImage.setIcon(new ImageIcon(getClass().getResource("/Images/file1.png")));

            GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
            leftPanel.setLayout(leftPanelLayout);
            leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup()
                    .addComponent(signupImage, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            );
            leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup()
                    .addComponent(signupImage, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 0, Short.MAX_VALUE))
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
    private JButton loginLinkBtn;
    private JButton button2;
    private JLabel usernameLbl;
    private JTextField usernameTF;
    private JButton signupBtn;
    private JPanel leftPanel;
    private JLabel signupImage;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
