/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tadeapps.View.Customer;

import Koneksi.Koneksi;
import tadeapps.Dao.DKodeAcak;

import java.awt.GridBagConstraints;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author ranaufal
 */
public class CustomerMenuMakanan extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMenuMakanan
     */
    Connection con;
    Statement stat;
    ResultSet rs;
    
//        parameter / variable 
    public int banyakMenu = 100;
    public int counter = 0;

//        object 
    GridBagConstraints gbc = new GridBagConstraints();
    MenuMakanan[] menumakan = new MenuMakanan[banyakMenu];
    Koneksi DB = new Koneksi();
    DKodeAcak kodeacak = new DKodeAcak();
    
    
    public CustomerMenuMakanan() {
        initComponents();
        
//        color 
        Color bgcolor = new Color(246,222,136);
        this.getContentPane().setBackground(bgcolor);

//        object child 
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
//        dummy 
        counter = 0;
        try {
            String bnykMenu = "SELECT COUNT(*) as banyakmenu FROM menu_makanan";
            rs = stat.executeQuery(bnykMenu);
            
            if(rs.next()){
                banyakMenu = rs.getInt("banyakmenu");

                for(int i=0;i<banyakMenu;i++){
                    String sql = "SELECT * FROM menu_makanan WHERE id_menu="+(i+1);
                    rs = stat.executeQuery(sql);
                    if(rs.next()){
                        menumakan[i] = new MenuMakanan(rs.getString("nama_menu"),rs.getString("harga"));
                        if(i%2 == 0){
                            gbc.gridx = 0;
                            gbc.gridy = counter;
                        }else{
                            gbc.gridx = 1;
                            gbc.gridy = counter;
                            counter++;
                        }
                        PanelProduct.add(menumakan[i],gbc);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Data Error");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMenuMakanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tested() throws ClassNotFoundException{
        
        counter = 0;
        try {
//            insert data kode ke customers
            String kodedidapat = kodeacak.ProsesAcak();
            String sqlInsertToCustomers = "INSERT INTO customers(id_customer,jam_pemesanan) VALUES(?,CURRENT_TIME())";
//            rs = stat.executeQuery(sqlInsertToCustomers);
            PreparedStatement ps = con.prepareStatement(sqlInsertToCustomers);
            ps.setString(1, kodedidapat);
            ps.executeUpdate();
        
            String bnykMenu = "SELECT COUNT(*) as banyakmenu FROM menu_makanan";
            rs = stat.executeQuery(bnykMenu);
            if(rs.next()){
                banyakMenu = rs.getInt("banyakmenu");

                for(int i=0;i<banyakMenu;i++){
                    String sql = "SELECT * FROM menu_makanan WHERE id_menu="+(i+1);
                    rs = stat.executeQuery(sql);
                    if(rs.next()){
                        if(menumakan[i].jumlahdipesan > 0){
//                            insert data yang dipesan ke tabel barcode 
                            String sqlInsertToBarcode = "INSERT INTO barcode(id_customer,id_menu,quantity) VALUES('"+kodedidapat+"','"+rs.getString("id_menu")+"',"+menumakan[i].jumlahdipesan+")";
                            PreparedStatement statement = con.prepareStatement(sqlInsertToBarcode);
                            statement.executeUpdate();
                            
                            String txt = "kode pemesanan anda = "+kodedidapat+"\n\n";
                            txt = txt+rs.getString("nama_menu") +" : "+  menumakan[i].jumlahdipesan;
                            JOptionPane.showMessageDialog(null, txt);
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Data Error");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMenuMakanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JLabel getTxtTotalBelanja() {
        return txtTotalBelanja;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        PanelProduct = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTotalBelanja = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 222, 136));
        setMinimumSize(new java.awt.Dimension(604, 713));
        setPreferredSize(new java.awt.Dimension(604, 713));
        setSize(new java.awt.Dimension(604, 713));

        title.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(206, 90, 90));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Talago Dewi");

        PanelProduct.setBackground(new java.awt.Color(246, 222, 136));
        PanelProduct.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(117, 106, 65));

        jLabel1.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Belanja :");

        txtTotalBelanja.setFont(new java.awt.Font("Kannada MN", 1, 36)); // NOI18N
        txtTotalBelanja.setForeground(new java.awt.Color(246, 222, 136));
        txtTotalBelanja.setText("Rp. 58.000");

        jButton1.setBackground(new java.awt.Color(246, 222, 136));
        jButton1.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(117, 106, 65));
        jButton1.setText("Detail");

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setFont(new java.awt.Font("Kannada MN", 0, 18)); // NOI18N
        jButton2.setText("Dapatkan Barcode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtTotalBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtTotalBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(PanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            tested();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMenuMakanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtTotalBelanja;
    // End of variables declaration//GEN-END:variables
}
