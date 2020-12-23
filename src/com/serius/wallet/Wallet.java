package com.serius.wallet;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author serius
 */
public class Wallet extends javax.swing.JFrame {

    private void clearForm(){
        dateTr.setEditable(true);
        dateTr.setText(null);
        cbType.setSelectedItem(this);
        intVal.setText(null);
        txtAbout.setText(null);
    }
    
//    private void jumlah() {
//        
//        try{
//            String sql = "SELECT sum(value) FROM transaction WHERE transaction.type = 0";
//            java.sql.Connection conn = (Connection)Config.configDB();
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(sql);
//            rest.setText("Oke");
//        }catch(SQLException e){
//            rest.setText(e.getMessage());
//        }
//    }
    
    private void showData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Tr");
        model.addColumn("Date");
        model.addColumn("Type");
        model.addColumn("About");
        model.addColumn("Value");
        
        try{
//            jumlah();
            int no = 1;
            String sql = "SELECT sum(value), id, date, type, about, value FROM transaction";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
            tbHistory.setModel(model);
        }catch(SQLException e){
            System.out.println("Error get data from DB "+ e.getMessage());
        }
        
        
    }
    
    
    public Wallet() {
        initComponents();
        showData();
        clearForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateTr = new javax.swing.JTextField();
        intVal = new javax.swing.JTextField();
        txtAbout = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        cbType = new javax.swing.JComboBox<>();
        txtIDTr = new javax.swing.JTextField();
        rest = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Electronic Wallet ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 210, 70));

        jLabel2.setFont(new java.awt.Font("Open Sans", 2, 12)); // NOI18N
        jLabel2.setText("by serius apps");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel4.setText("About");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel5.setText("Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel6.setText("Value");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        dateTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTrActionPerformed(evt);
            }
        });
        jPanel1.add(dateTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, -1));
        jPanel1.add(intVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, -1));
        jPanel1.add(txtAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 220, -1));

        tbHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHistory);
        if (tbHistory.getColumnModel().getColumnCount() > 0) {
            tbHistory.getColumnModel().getColumn(0).setMinWidth(3);
            tbHistory.getColumnModel().getColumn(0).setPreferredWidth(3);
            tbHistory.getColumnModel().getColumn(0).setMaxWidth(6);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 520, 160));

        btnAdd.setText("Add");
        btnAdd.setToolTipText("");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        btnClose.setText("Close");
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", " " }));
        jPanel1.add(cbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 220, -1));

        txtIDTr.setEnabled(false);
        txtIDTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDTrActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        rest.setBackground(new java.awt.Color(223, 65, 65));
        rest.setText("Rp. ");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });
        jPanel1.add(rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 562, 451));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTrActionPerformed
        
    }//GEN-LAST:event_dateTrActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
        dateTr.setFocusable(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        try {
            String sql = "INSERT INTO transaction VALUES (null, '" + dateTr.getText() + "', '" + cbType.getSelectedItem() + "', '" + txtAbout.getText() + "', '" + Integer.parseInt(intVal.getText()) + "')";
            java.sql.Connection conn;
            conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Success to add data to database");
            showData();
            clearForm();          
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Add data failed cause " + e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHistoryMouseClicked
        
        int row = tbHistory.rowAtPoint(evt.getPoint());
        
        String idTr= tbHistory.getValueAt(row, 1).toString();
        txtIDTr.setText(idTr);
        
        String date = tbHistory.getValueAt(row, 2).toString();
        dateTr.setText(date);
        
        String type = tbHistory.getValueAt(row, 3).toString();
        cbType.setSelectedItem(type);
        
        String value = tbHistory.getValueAt(row, 5).toString();
        intVal.setText(value);
        
        String about = tbHistory.getValueAt(row, 4).toString();
        txtAbout.setText(about);
    }//GEN-LAST:event_tbHistoryMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            
            String sql = "UPDATE transaction SET date='" + dateTr.getText() + "', type='" + cbType.getSelectedItem() + "', about='" + txtAbout.getText() + "', value='" + intVal.getText() + "' WHERE id='"+ txtIDTr.getText() +"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Success");
            showData();
            clearForm();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Update Failed" + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtIDTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDTrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDTrActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            String sql = "DELETE FROM transaction WHERE id = '"+txtIDTr.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Delete Complete");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        showData();
        clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
       
    }//GEN-LAST:event_restActionPerformed

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
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JTextField dateTr;
    private javax.swing.JTextField intVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rest;
    private javax.swing.JTable tbHistory;
    private javax.swing.JTextField txtAbout;
    private javax.swing.JTextField txtIDTr;
    // End of variables declaration//GEN-END:variables
}
