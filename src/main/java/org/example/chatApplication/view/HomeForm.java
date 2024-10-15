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
        leftPanel = new JPanel();
        label1 = new JLabel();
        usernameLbl = new JLabel();
        label2 = new JLabel();
        firstChatLbl = new JLabel();
        searchBarTF = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        middlePanel = new JPanel();
        label5 = new JLabel();
        firstChatLbl2 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        bottomPanel = new JPanel();
        searchBarTF2 = new JTextField();
        rightPanel = new JPanel();
        searchBarTF3 = new JTextField();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(900, 500));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
        javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax
        .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
        .awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt
        .Color.red), getBorder())); addPropertyChangeListener(new java.beans.
        PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".
        equals(e.getPropertyName()))throw new RuntimeException();}});

        //======== leftPanel ========
        {
            leftPanel.setPreferredSize(new Dimension(260, 500));
            leftPanel.setBackground(new Color(0xeeeeee));

            //---- usernameLbl ----
            usernameLbl.setText("Snehal Shelte");
            usernameLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
            usernameLbl.setBorder(new MatteBorder(0, 0, 2, 0, Color.black));

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/Images/person_16dp.png")));

            //---- firstChatLbl ----
            firstChatLbl.setText("Roshan Zope");
            firstChatLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));

            //---- label3 ----
            label3.setText("text");

            //---- label4 ----
            label4.setText("text");

            GroupLayout leftPanelLayout = new GroupLayout(leftPanel);
            leftPanel.setLayout(leftPanelLayout);
            leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup()
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGroup(leftPanelLayout.createParallelGroup()
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(label3)))
                                .addGap(12, 12, 12)
                                .addGroup(leftPanelLayout.createParallelGroup()
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addComponent(usernameLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label4)
                                        .addGap(12, 12, 12))
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addComponent(firstChatLbl)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchBarTF, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
            );
            leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup()
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(usernameLbl)
                                    .addComponent(label4))
                                .addGap(26, 26, 26))
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(searchBarTF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(leftPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(firstChatLbl)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1)
                        .addContainerGap(331, Short.MAX_VALUE))
            );
        }

        //======== middlePanel ========
        {

            //---- label5 ----
            label5.setText("text");

            //---- firstChatLbl2 ----
            firstChatLbl2.setText("Roshan Zope");
            firstChatLbl2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
            firstChatLbl2.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));

            //---- label6 ----
            label6.setText("text");

            //---- label7 ----
            label7.setText("text");

            //---- label8 ----
            label8.setText("text");

            //======== bottomPanel ========
            {

                GroupLayout bottomPanelLayout = new GroupLayout(bottomPanel);
                bottomPanel.setLayout(bottomPanelLayout);
                bottomPanelLayout.setHorizontalGroup(
                    bottomPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                            .addContainerGap(45, Short.MAX_VALUE)
                            .addComponent(searchBarTF2, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43))
                );
                bottomPanelLayout.setVerticalGroup(
                    bottomPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                            .addContainerGap(20, Short.MAX_VALUE)
                            .addComponent(searchBarTF2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14))
                );
            }

            GroupLayout middlePanelLayout = new GroupLayout(middlePanel);
            middlePanel.setLayout(middlePanelLayout);
            middlePanelLayout.setHorizontalGroup(
                middlePanelLayout.createParallelGroup()
                    .addGroup(middlePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(firstChatLbl2, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addComponent(bottomPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            middlePanelLayout.setVerticalGroup(
                middlePanelLayout.createParallelGroup()
                    .addGroup(middlePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(middlePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstChatLbl2)
                            .addComponent(label6)
                            .addComponent(label8)
                            .addComponent(label7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                        .addComponent(bottomPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
        }

        //======== rightPanel ========
        {
            rightPanel.setBackground(new Color(0xeeeeee));

            //---- label9 ----
            label9.setText("IMG");
            label9.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label10 ----
            label10.setText("text");

            //---- label11 ----
            label11.setText("text");

            GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
            rightPanel.setLayout(rightPanelLayout);
            rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(searchBarTF3, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
            );
            rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup()
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(searchBarTF3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(265, Short.MAX_VALUE))
            );
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(leftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(middlePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addComponent(leftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(middlePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Snehal Shelte
    private JPanel leftPanel;
    private JLabel label1;
    private JLabel usernameLbl;
    private JLabel label2;
    private JLabel firstChatLbl;
    private JTextField searchBarTF;
    private JLabel label3;
    private JLabel label4;
    private JPanel middlePanel;
    private JLabel label5;
    private JLabel firstChatLbl2;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JPanel bottomPanel;
    private JTextField searchBarTF2;
    private JPanel rightPanel;
    private JTextField searchBarTF3;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
