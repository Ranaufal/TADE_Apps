/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tadeapps.View;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import tadeapps.Controller.CStok;
/**
 *
 * @author ranaufal
 */
public class VMasterStok extends javax.swing.JFrame {

    /**
     * Creates new form VMasterStok
     */
    CStok controller;
    private List<Integer> ids;
    public VMasterStok() {
        initComponents();
        controller = new CStok(this);
        controller.viewTabel();
    }
    
    public JComboBox<String> getjComboBoxFilter() {
        return jComboBoxFilter;
    }

    public JTable getjTableMasterStok() {
        return jTableMasterStok;
    }

    public JTextField getTxtJenisStock() {
        return txtJenisStock;
    }

    public JTextField getTxtNamaStock() {
        return txtNamaStock;
    }

    public JTextField getTxtQuantity() {
        return txtSatuan;
    }

    public JTextField getTxtSatuan() {
        return txtSatuan;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
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
        jBtnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtUsernamePegawai = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMasterStok = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNamaStock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJenisStock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnInsert = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jComboBoxFilter = new javax.swing.JComboBox<>();
        txtSatuan = new javax.swing.JTextField();
        txtQuantity1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(246, 222, 136));

        jBtnBack.setFont(new java.awt.Font("Kannada MN", 0, 13)); // NOI18N
        jBtnBack.setForeground(new java.awt.Color(8, 43, 89));
        jBtnBack.setText("Back");
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Kannada MN", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(8, 43, 89));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Master Stok");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1155, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(246, 222, 136));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(246, 222, 136));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(246, 222, 136));

        txtUsernamePegawai.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        txtUsernamePegawai.setForeground(new java.awt.Color(204, 0, 51));
        txtUsernamePegawai.setText("usernamepegawai");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtUsernamePegawai)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtUsernamePegawai)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(246, 222, 136));
        jPanel5.setLayout(null);

        jTableMasterStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Stok", "Quantity Stok", "Satuan", "Jenis Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMasterStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMasterStokMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMasterStok);
        if (jTableMasterStok.getColumnModel().getColumnCount() > 0) {
            jTableMasterStok.getColumnModel().getColumn(0).setResizable(false);
            jTableMasterStok.getColumnModel().getColumn(1).setResizable(false);
            jTableMasterStok.getColumnModel().getColumn(2).setResizable(false);
            jTableMasterStok.getColumnModel().getColumn(3).setResizable(false);
            jTableMasterStok.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(2, 52, 650, 470);

        jLabel1.setText("Nama Stok");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(660, 0, 90, 40);
        jPanel5.add(txtNamaStock);
        txtNamaStock.setBounds(750, 0, 320, 40);

        jLabel2.setText("Quantity");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(660, 50, 90, 40);
        jPanel5.add(txtJenisStock);
        txtJenisStock.setBounds(750, 150, 320, 40);

        jLabel3.setText("Jenis Stock");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(660, 150, 90, 40);

        jLabel4.setText("Satuan");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(660, 100, 90, 40);

        jBtnInsert.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        jBtnInsert.setForeground(new java.awt.Color(8, 43, 89));
        jBtnInsert.setText("Insert");
        jBtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnInsert);
        jBtnInsert.setBounds(700, 340, 160, 40);

        jBtnUpdate.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        jBtnUpdate.setForeground(new java.awt.Color(8, 43, 89));
        jBtnUpdate.setText("Update");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnUpdate);
        jBtnUpdate.setBounds(880, 340, 160, 40);

        jBtnDelete.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        jBtnDelete.setForeground(new java.awt.Color(8, 43, 89));
        jBtnDelete.setText("Delete");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(jBtnDelete);
        jBtnDelete.setBounds(790, 400, 160, 40);

        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fiter" }));
        jComboBoxFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFilterActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBoxFilter);
        jComboBoxFilter.setBounds(2, 10, 650, 40);
        jPanel5.add(txtSatuan);
        txtSatuan.setBounds(750, 100, 320, 40);
        jPanel5.add(txtQuantity1);
        txtQuantity1.setBounds(750, 50, 320, 40);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        new VMasterMenu().setVisible(true);
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertActionPerformed
        controller.insert();
        controller.viewTabel();
    }//GEN-LAST:event_jBtnInsertActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.viewTabel();
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        controller.delete();
        controller.viewTabel();
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jTableMasterStokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMasterStokMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTableMasterStokMouseClicked

    private void jComboBoxFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFilterActionPerformed
        // TODO add your handling code here:
        controller.filter();
        if (jComboBoxFilter.getSelectedItem().equals("filter")) {
            controller.viewTabel();
        }
    }//GEN-LAST:event_jComboBoxFilterActionPerformed

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
            java.util.logging.Logger.getLogger(VMasterStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMasterStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMasterStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMasterStok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMasterStok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnInsert;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JComboBox<String> jComboBoxFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMasterStok;
    private javax.swing.JTextField txtJenisStock;
    private javax.swing.JTextField txtNamaStock;
    private javax.swing.JTextField txtQuantity1;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JLabel txtUsernamePegawai;
    // End of variables declaration//GEN-END:variables
}
