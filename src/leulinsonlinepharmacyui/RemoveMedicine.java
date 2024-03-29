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
        pharmaback = new javax.swing.JButton();
        selectBrandLabel = new javax.swing.JLabel();
        medbrand = new javax.swing.JTextField();
        removebtn = new javax.swing.JButton();
        viewMed = new javax.swing.JButton();

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

        viewMed.setText("Click here to view medicine");
        viewMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removePanelLayout = new javax.swing.GroupLayout(removePanel);
        removePanel.setLayout(removePanelLayout);
        removePanelLayout.setHorizontalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addGroup(removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pharmaback))
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(medbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(selectBrandLabel))
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(viewMed, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(removePanelLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        removePanelLayout.setVerticalGroup(
            removePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removePanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pharmaback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(viewMed, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(selectBrandLabel)
                .addGap(18, 18, 18)
                .addComponent(medbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(removePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMedActionPerformed
        new PharmaViewMedicines().setVisible(true);

    }//GEN-LAST:event_viewMedActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed

    }//GEN-LAST:event_removebtnActionPerformed

    private void removebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removebtnMouseClicked
        String med = medbrand.getText();
        if(control.removeMedicine(med) == true){
            JOptionPane.showMessageDialog(rootPane,"Successfully removed!");
            this.dispose();
            new PharmaDashboard().setVisible(true);
        }

        //        String a = "Allergies";
        //        String b = "Headache";
        //        String c = "Body Pain";
        //        String d = "Cough";
        //        String dropDownValue = (String) comboBox.getSelectedItem();
        //        String remove = dropDownValue;
        //
        //        String sql1 = "DELETE FROM `medicineforallergies` WHERE brandname='" + med + "'";
        //        String sql2 = "DELETE FROM `medicineforheadache` WHERE brandname='" + med + "'";
        //        String sql3 = "DELETE FROM `medicineforbodypain` WHERE brandname='" + med + "'";
        //        String sql4 = "DELETE FROM `medicineforcough` WHERE brandname='" + med + "'";
        //
        //        JOptionPane.showMessageDialog(rootPane, dropDownValue);
        //        try {
            ////            System.out.println("na read ni siya!");
            //            Class.forName("com.mysql.jdbc.Driver");
            //            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "")) {
                //                Statement stmt = con.createStatement();
                //
                //                if (remove.equals(a) == true) {
                    ////                    System.out.println("na read ni siya!");
                    //                    stmt.executeUpdate(sql1);
                    //                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    //                    this.dispose();
                    //                    new PharmaDashboard().setVisible(true);
                    //                } else if (remove.equals(b) == true) {
                    ////                    System.out.println("na read ni siya!");
                    //                    stmt.executeUpdate(sql2);
                    //                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    //                    this.dispose();
                    //                    new PharmaDashboard().setVisible(true);
                    //                } else if (remove.equals(c) == true) {
                    ////                    System.out.println("na read ni siya!");
                    //                    stmt.executeUpdate(sql3);
                    //                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    //                    this.dispose();
                    //                    new PharmaDashboard().setVisible(true);
                    //                } else if (remove.equals(d) == true) {
                    ////                    System.out.println("na read ni siya!");
                    //                    stmt.executeUpdate(sql4);
                    //                    JOptionPane.showMessageDialog(rootPane, "Medicine removed successfully!");
                    //                    this.dispose();
                    //                    new PharmaDashboard().setVisible(true);
                    //                } else {
                    //                    JOptionPane.showMessageDialog(rootPane, remove);
                    //                }
                //            }
            //        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            //            JOptionPane.showMessageDialog(rootPane, "Error connecting to database!");
            //        }
    }//GEN-LAST:event_removebtnMouseClicked

    private void medbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medbrandActionPerformed

    private void pharmabackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmabackActionPerformed
        this.setVisible(false);
        new PharmaDashboard().setVisible(true);
    }//GEN-LAST:event_pharmabackActionPerformed

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
    private javax.swing.JPanel headPanel;
    private javax.swing.JTextField medbrand;
    private javax.swing.JButton pharmaback;
    private javax.swing.JLabel removeLabel;
    private javax.swing.JPanel removePanel;
    private javax.swing.JButton removebtn;
    private javax.swing.JLabel selectBrandLabel;
    private javax.swing.JButton viewMed;
    // End of variables declaration//GEN-END:variables
}
