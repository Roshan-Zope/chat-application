/*
 * Created by JFormDesigner on Mon Oct 14 17:39:57 GMT+05:30 2024
 */

package org.example.chatApplication.view;

import org.checkerframework.checker.units.qual.C;
import org.example.chatApplication.constants.ScreenConstants;
import org.example.chatApplication.controllers.AuthController;
import org.example.chatApplication.models.ChatClient;
import org.example.chatApplication.utilities.Navigator;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author shelt
 */
public class HomeForm extends JPanel {
    private static Navigator navigator;
    private AuthController authController;
    
    public HomeForm(String title) {
        initComponents();
        JFrame frame = new JFrame();
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setTitle(title);
        frame.setVisible(true);
    }

    public JTextArea getMessageArea() {
        return textArea2;
    }

    public JTextField getInputField() {
        return inputTF;
    }

    public JButton getSendButton() {
        return sendBtn;
    }

    private void onLogout(ActionEvent e) {
        authController.logout();
        navigator.showScreen(ScreenConstants.LOGIN);
    }

    private void initComponents() {
        authController = new AuthController();
        navigator = Navigator.getInstance();
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
        panel1 = new JPanel();
        label1 = new JLabel();
        usernameLbl = new JLabel();
        profileImage = new JLabel();
        contactLbl = new JLabel();
        searchBarTF = new JTextField();
        contactImage = new JLabel();
        logoutBtn = new JButton();
        panel2 = new JPanel();
        inputTF = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button6 = new JButton();
        scrollPane1 = new JScrollPane();
        panel4 = new JPanel();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        sendBtn = new JButton();
        panel3 = new JPanel();
        searchBarTF2 = new JTextField();
        userProfileImage = new JLabel();
        button2 = new JButton();
        button7 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(260, 500));
            panel1.setBackground(new Color(0xeeeeee));

            //---- usernameLbl ----
            usernameLbl.setText("Snehal Shelte");
            usernameLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
            usernameLbl.setBorder(new MatteBorder(0, 0, 2, 0, Color.black));

            //---- profileImage ----
            profileImage.setIcon(new ImageIcon(getClass().getResource("/Images/person_16dp.png")));

            //---- contactLbl ----
            contactLbl.setText("Roshan Zope");
            contactLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));

            //---- contactImage ----
            contactImage.setText("image");

            //---- logoutBtn ----
            logoutBtn.setIcon(new ImageIcon(getClass().getResource("/Images/logout.png")));
            logoutBtn.setBackground(Color.white);
            logoutBtn.addActionListener(e -> onLogout(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(contactImage))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(profileImage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(usernameLbl, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                .addComponent(contactLbl)
                                                .addGap(72, 72, 72))))
                                    .addComponent(searchBarTF, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(logoutBtn, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                        .addGap(248, 248, 248))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(label1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logoutBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(profileImage, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBarTF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(contactLbl)
                                    .addComponent(contactImage))))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(Color.white);

            //---- inputTF ----
            inputTF.setBorder(new LineBorder(Color.black, 5, true));

            //---- label4 ----
            label4.setText("text");
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label5 ----
            label5.setText("Roshan Zope");
            label5.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));

            //---- button3 ----
            button3.setText("C");

            //---- button4 ----
            button4.setText("VC");

            //---- button6 ----
            button6.setText("M");

            //======== scrollPane1 ========
            {

                //======== panel4 ========
                {

                    //======== scrollPane2 ========
                    {

                        //---- textArea2 ----
                        textArea2.setText("Hello");
                        textArea2.setEditable(false);
                        scrollPane2.setViewportView(textArea2);
                    }

                    GroupLayout panel4Layout = new GroupLayout(panel4);
                    panel4.setLayout(panel4Layout);
                    panel4Layout.setHorizontalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                    );
                    panel4Layout.setVerticalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))
                    );
                }
                scrollPane1.setViewportView(panel4);
            }

            //---- sendBtn ----
            sendBtn.setText("send");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(scrollPane1, GroupLayout.Alignment.LEADING)
                                    .addGroup(GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                        .addComponent(inputTF)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sendBtn)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollPane1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTF, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendBtn))
                        .addGap(21, 21, 21))
            );
        }

        //======== panel3 ========
        {
            panel3.setBackground(new Color(0xeeeeee));

            //---- userProfileImage ----
            userProfileImage.setText("image");
            userProfileImage.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button2 ----
            button2.setText("text");

            //---- button7 ----
            button7.setText("text");

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(searchBarTF2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(userProfileImage, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(searchBarTF2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(userProfileImage, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2)
                            .addComponent(button7))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public static JPanel getMainPanel() {
        return new HomeForm("");
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Roshan Rajendra Zope
    private JPanel panel1;
    private JLabel label1;
    private JLabel usernameLbl;
    private JLabel profileImage;
    private JLabel contactLbl;
    private JTextField searchBarTF;
    private JLabel contactImage;
    private JButton logoutBtn;
    private JPanel panel2;
    private JTextField inputTF;
    private JLabel label4;
    private JLabel label5;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JScrollPane scrollPane1;
    private JPanel panel4;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JButton sendBtn;
    private JPanel panel3;
    private JTextField searchBarTF2;
    private JLabel userProfileImage;
    private JButton button2;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
