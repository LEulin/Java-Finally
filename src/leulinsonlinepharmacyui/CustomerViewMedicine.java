/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leulinsonlinepharmacyui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eulinle_sd2022
 */
public class CustomerViewMedicine extends javax.swing.JFrame {

    String uname;
    /**
     * Creates new form CustomerViewMeds
     */
    public CustomerViewMedicine() {
        initComponents();
        this.setTitle("Customer View Medicines");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine`");
            DefaultTableModel tm = (DefaultTableModel) MedTable.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object table[] = {rs.getInt("id"), rs.getString("brandname"), rs.getString("genericname"), rs.getString("type"), rs.getInt("quantity"), rs.getInt("price")};
                tm.addRow(table);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }
    }

    public CustomerViewMedicine(String username) {
        initComponents();
        this.setTitle("Medicine for Body Pain");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        uname = username;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/eulin", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine`");
            DefaultTableModel tm = (DefaultTableModel) MedTable.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object table[] = {rs.getInt("id"), rs.getString("brandname"), rs.getString("genericname"), rs.getString("type"), rs.getInt("quantity"), rs.getInt("price")};
                tm.addRow(table);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database!");
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewMedPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JPanel();
        viewLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedTable = new javax.swing.JTable();
        cusmoback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewMedPanel.setBackground(new java.awt.Color(0, 153, 153));
        viewMedPanel.setForeground(new java.awt.Color(0, 153, 153));

        headerLabel.setBackground(new java.awt.Color(153, 153, 153));

        viewLabel.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        viewLabel.setForeground(new java.awt.Color(0, 102, 102));
        viewLabel.setText("View Medicines");

        javax.swing.GroupLayout headerLabelLayout = new javax.swing.GroupLayout(headerLabel);
        headerLabel.setLayout(headerLabelLayout);
        headerLabelLayout.setHorizontalGroup(
            headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLabelLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(viewLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLabelLayout.setVerticalGroup(
            headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLabelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(viewLabel)
                .addGap(27, 27, 27))
        );

        MedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Medicine ID", "Brand Name", "Generic Name", "Type", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(MedTable);

        cusmoback.setBackground(new java.awt.Color(153, 153, 153));
        cusmoback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cusmoback.setForeground(new java.awt.Color(0, 153, 153));
        cusmoback.setText("< Back");
        cusmoback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusmobackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewMedPanelLayout = new javax.swing.GroupLayout(viewMedPanel);
        viewMedPanel.setLayout(viewMedPanelLayout);
        viewMedPanelLayout.setHorizontalGroup(
            viewMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewMedPanelLayout.createSequentialGroup()
                .addGroup(viewMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewMedPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cusmoback))
                    .addGroup(viewMedPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        viewMedPanelLayout.setVerticalGroup(
            viewMedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMedPanelLayout.createSequentialGroup()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cusmoback, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewMedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(viewMedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusmobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusmobackActionPerformed
        this.setVisible(false);
        new CustomerDashboard().setVisible(true);
    }//GEN-LAST:event_cusmobackActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerViewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerViewMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MedTable;
    private javax.swing.JButton cusmoback;
    private javax.swing.JPanel headerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel viewLabel;
    private javax.swing.JPanel viewMedPanel;
    // End of variables declaration//GEN-END:variables
}
