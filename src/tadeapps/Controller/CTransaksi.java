/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;

import javax.swing.table.*;
import java.util.List;
import javax.swing.JOptionPane;

import Koneksi.Koneksi;
import java.sql.SQLException;
import tadeapps.Dao.DTransaksi;
import tadeapps.Model.MTransaksi;
import tadeapps.View.VTransaksi;

/**
 *
 * @author ranaufal
 */
public class CTransaksi {
    DTransaksi dao;
    MTransaksi model;
    VTransaksi view;
    Koneksi k;
    
    public int banyakBarang = 0;
    private int n = 1;

    public CTransaksi(VTransaksi view) {
        this.view = view;
    }
    
    public void insertToTable(String id_customer) throws SQLException{
        DefaultTableModel tabel = (DefaultTableModel)view.getjTable().getModel();
//        tabel.setRowCount(0);
        dao = new DTransaksi();
        k = new Koneksi();
        List<MTransaksi> list;
        try {
            list = dao.queryAllData(k.getKoneksi(),id_customer);
            for (MTransaksi model : list) {
                Object data[] = {
                    n++,
                    model.getId_menu(),
                    model.getNama_menu(),
                    model.getHarga(),
                    model.getQuantity(),
                    model.getTotal()
                };
                tabel.addRow(data);
                banyakBarang = n-1;
                
            }
            JOptionPane.showMessageDialog(null, "Sukses bro");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
