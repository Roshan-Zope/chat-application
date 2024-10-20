/*
 * Created by JFormDesigner on Mon Oct 14 17:39:57 GMT+05:30 2024
 */

package org.example.chatApplication.view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author shelt
 */
public class HomeForm extends JPanel {
    public HomeForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Snehal Shelte
        panel1 = new JPanel();
        label1 = new JLabel();
        usernameLbl = new JLabel();
        profileImage = new JLabel();
        contactLbl = new JLabel();
        searchBarTF = new JTextField();
        contactImage = new JLabel();
        panel2 = new JPanel();
        searchBarTF3 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button6 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        textArea2 = new JTextArea();
        panel3 = new JPanel();
        searchBarTF2 = new JTextField();
        userProfileImage = new JLabel();
        button2 = new JButton();
        button7 = new JButton();
        button5 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
        0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
        .BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.
        red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
        beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException();}});

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

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(contactImage))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(profileImage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(usernameLbl, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(contactLbl)
                                        .addGap(72, 72, 72))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchBarTF, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLbl, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(profileImage, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBarTF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(contactLbl)
                            .addComponent(contactImage))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1)
                        .addContainerGap(340, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(Color.white);

            //---- searchBarTF3 ----
            searchBarTF3.setBorder(new LineBorder(Color.black, 5, true));

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

                //---- textArea1 ----
                textArea1.setText("Tu mere se pyaar karta hai ki nhi?");
                textArea1.setEditable(false);
                textArea1.setLineWrap(true);
                textArea1.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
                scrollPane1.setViewportView(textArea1);
            }

            //---- textArea2 ----
            textArea2.setText("Ha, karta hu..");
            textArea2.setEditable(false);
            textArea2.setLineWrap(true);
            textArea2.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(searchBarTF3, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(0, 184, Short.MAX_VALUE)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 198, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(searchBarTF3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 36, Short.MAX_VALUE))
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
                        .addContainerGap(39, Short.MAX_VALUE))
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
                        .addContainerGap(256, Short.MAX_VALUE))
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
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //---- button5 ----
        button5.setText("C");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public static JPanel getMainPanel() {
        return new HomeForm();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Snehal Shelte
    private JPanel panel1;
    private JLabel label1;
    private JLabel usernameLbl;
    private JLabel profileImage;
    private JLabel contactLbl;
    private JTextField searchBarTF;
    private JLabel contactImage;
    private JPanel panel2;
    private JTextField searchBarTF3;
    private JLabel label4;
    private JLabel label5;
    private JButton button3;
    private JButton button4;
    private JButton button6;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel panel3;
    private JTextField searchBarTF2;
    private JLabel userProfileImage;
    private JButton button2;
    private JButton button7;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
