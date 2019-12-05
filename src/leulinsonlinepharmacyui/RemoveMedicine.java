 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leulinsonlinepharmacyui;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Controller.Controller;

/**
 *
 * @author eulinle_sd2022
 */
public class RemoveMedicine extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    Controller control = new Controller();

    public RemoveMedicine() {
        initComponents();
        this.setTitle("Remove Medicine");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        removePanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        removeLabel = new javax.swing.JLabel();
        selectMedLabel = new javax.swing.JLabel();
        coughbtn = new javax.swing.JButton();
        headachebtn = new javax.swing.JButton();
        bodypainbtn = new javax.swing.JButton();
        allergiesbtn = new javax.swing.JButton();
        pharmaback = new javax.swing.JButton();
        selectBrandLabel = new javax.swing.JLabel();
        medbrand = new javax.swing.JTextField();
        removebtn = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        removePanel.setBackground(new java.awt.Color(0, 153, 153));

        headPanel.setBackground(new java.awt.Color(153, 153, 153));

        removeLabel.setBackground(new java.awt.Color(0, 102, 102));
        removeLabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        removeLabel.setForeground(new java.awt.Color(0, 102, 102));
        removeLabel.setText("Remove Medicine");

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeLabel)
                .addGap(121, 121, 121))
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(removeLabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        selectMedLabel.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        selectMedLabel.setForeground(new java.awt.Color(153, 0, 0));
        selectMedLabel.setText("Select Medicine Type to Remove");

        coughbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coughbtn.setText("View Medicine for Cough");
        coughbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coughbtnMouseClicked(evt);
            }
        });
        coughbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coughbtnActionPerformed(evt);
            }
        });

        headachebtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        headachebtn.setText("View Medicine for Headache");
        headachebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headachebtnActionPerformed(evt);
            }
        });

        bodypainbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bodypainbtn.setText("View Medicine for Body Pain");
        bodypainbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodypainbtnActionPerformed(evt);
            }
        });

        allergiesbtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        allergiesbtn.setText("View Medicine for Allergies");
        allergiesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergiesbtnActionPerformed(evt);
            }
        });

        pharmaback.setBackground(new java.awt.Color(153, 153, 153));
        pharmaback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pharmaback.setForeground(new java.awt.Color(0, 153, 153));
        pharmaback.setText("< Back");
        pharmaback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmabackActionPerformed(evt);
            }
        });

        selectBrandLabel.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        selectBrandLabel.setText("Select medicine brandname you want to remove:");

        medbrand.setText(" ");
        medbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medbrandActionPerformed(evt);
            }
        });

        removebtn.setText("Remove");
        removebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removebtnMouseClicked(evt);
            }
        });
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cough", "Body Pain", "Headache", "Allergies" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removePanelLayout = new javax.swing.GroupLayout(removePanel);
        removePanel.setLayout(removePanelLayout);
        removePanelLayout.setHorizontalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(medbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(removePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePanelLayout.createSequentialGroup()
                        .addGap(0, 125, Short.MAX_VALUE)
                        .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePanelLayout.createSequentialGroup()
                                .addComponent(selectMedLabel)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePanelLayout.createSequentialGroup()
                                .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))))
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addComponent(pharmaback)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectBrandLabel)
                .addGap(80, 80, 80))
            .addGroup(removePanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headachebtn)
                    .addComponent(coughbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bodypainbtn)
                    .addComponent(allergiesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        removePanelLayout.setVerticalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pharmaback)
                .addGap(21, 21, 21)
                .addComponent(selectMedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(allergiesbtn)
                .addGap(18, 18, 18)
                .addComponent(headachebtn)
                .addGap(18, 18, 18)
                .addComponent(bodypainbtn)
                .addGap(18, 18, 18)
                .addComponent(coughbtn)
                .addGap(56, 56, 56)
                .addComponent(selectBrandLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(medbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pharmabackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmabackActionPerformed
        this.setVisible(false);
        new PharmaDashboard().setVisible(true);
    }//GEN-LAST:event_pharmabackActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed

    }//GEN-LAST:event_removebtnActionPerformed

    private void removebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebtnMouseClicked
        String med = medbrand.getText();

        String a = "Allergies";
        String b = "Headache";
        String c = "Body Pain";
        String d = "Cough";
        String dropDownValue = (String) comboBox.getSelectedItem();
        String remove = dropDownValue;

        String sql1 = "DELETE FROM `medicineforallergies` WHERE brandname='" + med + "'";
        String sql2 = "DELETE FROM `medicineforheadache` WHERE brandname='" + med + "'";
        String sql3 = "DELETE FROM `medicineforbodypain` WHERE brandname='" + med + "'";
        String sql4 = "DELETE FROM `medicineforcough` WHERE brandname='" + med + "'";

        JOptionPane.showMessageDialog(rootPane, dropDownValue);
        try {
//            System.out.println("na read ni siya!");
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "")) {
                Statement stmt = con.createStatement();

                if (remove.equals(a) == true) {
//                    System.out.println("na read ni siya!");
                    stmt.executeUpdate(sql1);
                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    this.dispose();
                    new PharmaDashboard().setVisible(true);
                } else if (remove.equals(b) == true) {
//                    System.out.println("na read ni siya!");
                    stmt.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    this.dispose();
                    new PharmaDashboard().setVisible(true);
                } else if (remove.equals(c) == true) {
//                    System.out.println("na read ni siya!");
                    stmt.executeUpdate(sql3);
                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    this.dispose();
                    new PharmaDashboard().setVisible(true);
                } else if (remove.equals(d) == true) {
//                    System.out.println("na read ni siya!");
                    stmt.executeUpdate(sql4);
                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    this.dispose();
                    new PharmaDashboard().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, remove);
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error connecting to database!");
        }
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE brandname='" + b + "'");
//
//            while (rs.next()) {
//                System.out.println("Reading!");
//                if (rs.getString("brandname").equals(b)) {
//                    try {
//                        exist = true;
//                        String sql = "DELETE FROM `medicine` WHERE brandname='" + b + "'";
//                        stmt.executeUpdate(sql);
//                        JOptionPane.showMessageDialog(null, "Successfully removed!");
//                        this.dispose();
//                        new PharmaDashboard().setVisible(true);
//                        break;
//                    } catch (HeadlessException | SQLException e) {
//                        JOptionPane.showMessageDialog(null, "Error removing!!");
//                    }
//                }
//            }
//            if (exist == false) {
//                JOptionPane.showMessageDialog(null, "Brand name do not exist!");
//            }
//            con.close();
//        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error connecting!!");
//        }

    }//GEN-LAST:event_removebtnMouseClicked

    private void medbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medbrandActionPerformed

    private void allergiesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergiesbtnActionPerformed
        this.setVisible(true);
        new MforAllergies().setVisible(true);
    }//GEN-LAST:event_allergiesbtnActionPerformed

    private void bodypainbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodypainbtnActionPerformed
        this.setVisible(true);
        new MforBodyPain().setVisible(true);
    }//GEN-LAST:event_bodypainbtnActionPerformed

    private void headachebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headachebtnActionPerformed
        this.setVisible(true);
        new MforHeadache().setVisible(true);
    }//GEN-LAST:event_headachebtnActionPerformed

    private void coughbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coughbtnActionPerformed
        this.setVisible(true);
        new MforCough().setVisible(true);
    }//GEN-LAST:event_coughbtnActionPerformed

    private void coughbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coughbtnMouseClicked

    }//GEN-LAST:event_coughbtnMouseClicked

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        //        String value = comboBox.getSelectedItem().toString();
        //
        //        try {
        //            Class.forName("com.mysql.jdbc.Driver");
        //                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
        //                Statement stmt = con.createStatement();
        //                ResultSet rs = stmt.executeQuery("SELECT * FROM `" + value + "`");
        //
        //
        //
        //        } catch () {
        //        }
    }//GEN-LAST:event_comboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RemoveMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allergiesbtn;
    private javax.swing.JButton bodypainbtn;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JButton coughbtn;
    private javax.swing.JPanel headPanel;
    private javax.swing.JButton headachebtn;
    private javax.swing.JTextField medbrand;
    private javax.swing.JButton pharmaback;
    private javax.swing.JLabel removeLabel;
    private javax.swing.JPanel removePanel;
    private javax.swing.JButton removebtn;
    private javax.swing.JLabel selectBrandLabel;
    private javax.swing.JLabel selectMedLabel;
    // End of variables declaration//GEN-END:variables
}
