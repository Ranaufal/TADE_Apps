/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package tadeapps.View.panel;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ranaufal
 */
public class PInputPengeluaran extends javax.swing.JPanel {

    /**
     * Creates new form PInputPengeluaran
     */
    public boolean isChecked = false;
    public String id_jpengeluaran;
    
    public PInputPengeluaran(String nama_pengeluaran,String satuan,String id_jpengeluaran) {
        initComponents();
        
        this.id_jpengeluaran = id_jpengeluaran;
   
        biayaBeli.setVisible(false);
        quantity.setVisible(false);
        txtRp.setVisible(false);
        txtSatuan.setVisible(false);
        checkPengeluaran.setText(nama_pengeluaran);
        txtSatuan.setText(satuan);
    }

    public JTextField getBiayaBeli() {
        return biayaBeli;
    }

    public JTextField getQuantity() {
        return quantity;
    }

    public JLabel getTxtSatuan() {
        return txtSatuan;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkPengeluaran = new javax.swing.JCheckBox();
        quantity = new javax.swing.JTextField();
        biayaBeli = new javax.swing.JTextField();
        txtSatuan = new javax.swing.JLabel();
        txtRp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 222, 136));

        checkPengeluaran.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        checkPengeluaran.setForeground(new java.awt.Color(8, 43, 89));
        checkPengeluaran.setText("nama pengeluaran");
        checkPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPengeluaranActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        quantity.setForeground(new java.awt.Color(8, 43, 89));

        biayaBeli.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        biayaBeli.setForeground(new java.awt.Color(8, 43, 89));

        txtSatuan.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        txtSatuan.setForeground(new java.awt.Color(8, 43, 89));
        txtSatuan.setText("ekor");

        txtRp.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        txtRp.setForeground(new java.awt.Color(8, 43, 89));
        txtRp.setText("Rp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(biayaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(checkPengeluaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(biayaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRp))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSatuan)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPengeluaranActionPerformed
        // TODO add your handling code here:
        if(checkPengeluaran.isSelected()){
            isChecked = true;
        }else{
            isChecked = false;
        }
        biayaBeli.setVisible(isChecked);
        quantity.setVisible(isChecked);
        txtRp.setVisible(isChecked);
        txtSatuan.setVisible(isChecked);
        
    }//GEN-LAST:event_checkPengeluaranActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biayaBeli;
    private javax.swing.JCheckBox checkPengeluaran;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel txtRp;
    private javax.swing.JLabel txtSatuan;
    // End of variables declaration//GEN-END:variables
}
