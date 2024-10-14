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
        return mainPanel;
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Snehal Shelte
        mainPanel = new JPanel();
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        LoginLbl = new JLabel();
        emailLbl = new JLabel();
        emailTF = new JTextField();
        passwordLbl = new JLabel();
        passwordPF = new JPasswordField();
        forgotPasswordBtn = new JButton();
        signupLink = new JButton();
        loginBtn = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
        border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER
        ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font
        . BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener(
        new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r"
        .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

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

                GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
                leftPanel.setLayout(leftPanelLayout);
                leftPanelLayout.setHorizontalGroup(
                    leftPanelLayout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                leftPanelLayout.setVerticalGroup(
                    leftPanelLayout.createParallelGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                );
            }

            //======== rightPanel ========
            {
                rightPanel.setPreferredSize(new Dimension(540, 500));
                rightPanel.setBackground(new Color(0x0d92f4));
                rightPanel.setMinimumSize(new Dimension(540, 500));

                //---- LoginLbl ----
                LoginLbl.setText("Login");
                LoginLbl.setHorizontalAlignment(SwingConstants.CENTER);
                LoginLbl.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
                LoginLbl.setForeground(Color.white);

                //---- emailLbl ----
                emailLbl.setFont(new Font("JetBrains Mono", Font.PLAIN, 18));
                emailLbl.setText("Email");
                emailLbl.setForeground(Color.white);

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

                //---- loginBtn ----
                loginBtn.setText("Login");
                loginBtn.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 22));
                loginBtn.setBackground(Color.white);
                loginBtn.setBorderPainted(false);
                loginBtn.setOpaque(false);

                GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
                rightPanel.setLayout(rightPanelLayout);
                rightPanelLayout.setHorizontalGroup(
                    rightPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(LoginLbl, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                            .addGap(163, 163, 163))
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addGroup(rightPanelLayout.createParallelGroup()
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(rightPanelLayout.createParallelGroup()
                                        .addComponent(passwordLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLbl, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addGap(169, 169, 169)
                                    .addComponent(forgotPasswordBtn))
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(signupLink))
                                .addGroup(rightPanelLayout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(144, Short.MAX_VALUE))
                );
                rightPanelLayout.setVerticalGroup(
                    rightPanelLayout.createParallelGroup()
                        .addGroup(rightPanelLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(LoginLbl, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(emailLbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emailTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(passwordLbl, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(forgotPasswordBtn)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(signupLink)
                            .addGap(30, 30, 30)
                            .addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup()
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup()
                            .addComponent(leftPanel, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
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
                .addComponent(mainPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Snehal Shelte
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JLabel LoginLbl;
    private JLabel emailLbl;
    private JTextField emailTF;
    private JLabel passwordLbl;
    private JPasswordField passwordPF;
    private JButton forgotPasswordBtn;
    private JButton signupLink;
    private JButton loginBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
