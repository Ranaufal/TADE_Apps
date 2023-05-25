/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;

import Koneksi.Koneksi;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tadeapps.Dao.DMenuMakanan;
import tadeapps.Dao.DUserAdmin;
import tadeapps.Model.MAdmin;
import tadeapps.Model.MMenuMakanan;
import tadeapps.View.VMenuMakanan;

/**
 *
 * @author ranaufal
 */
public class CMenuMakanan {
    VMenuMakanan view;
    DMenuMakanan dao;
    MMenuMakanan model;
    
    Koneksi k;
    public int n=1;
    
    public CMenuMakanan(VMenuMakanan view){
        this.view = view;
    }
    
    public void viewTabel() throws ClassNotFoundException {
        DefaultTableModel tabel = (DefaultTableModel)view.getTabelMenuMakanan().getModel();
        tabel.setRowCount(0);
        dao = new DMenuMakanan();
        k = new Koneksi();
        List<MMenuMakanan> list;
        try {
            list = dao.queryAllData(k.getKoneksi());
            for (MMenuMakanan model : list) {
                Object data[] = {
                    n++,
                    model.getNama_menu(),
                    model.getHarga(),
                    "Belum ada ygy",
                    model.getKeterangan()
                };
                tabel.addRow(data);
            }
            n = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void insert() throws ClassNotFoundException {
        model = new MMenuMakanan(
                null,
                view.getTxtNamaMenu().getText(),
                view.getTxtHarga().getText(),
                view.getTxtKeterangan().getText()
        );
        dao = new DMenuMakanan();
        k = new Koneksi();
        try {
            dao.insert(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view,"Insert Data Pengembalian Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view,ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view,"Insert Data Pengembalian Gagal 1");
        }
    }
}
