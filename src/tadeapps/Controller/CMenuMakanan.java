/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;

import Koneksi.Koneksi;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
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
    MMenuMakanan model;
    DMenuMakanan dao;
    Koneksi k;
    private int n = 1;
    
    public CMenuMakanan(VMenuMakanan view){
        this.view = view;
    }
    
    public void insert() {
        model = new MMenuMakanan(Integer.parseInt(view.getTxtHargaMenu().getText()),
                Integer.parseInt(view.getTxtQuantityMenu().getText()),
                view.getTxtNamaMenu().getText(),
                view.getTxtKeterangan().getText());
        dao = new DMenuMakanan();
        k = new Koneksi();
        try {
            dao.queryInsert(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view, "Insert Berhasil");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void update() {
        int index = view.getjTableMenuMakanan().getSelectedRow();
        dao = new DMenuMakanan();
        k = new Koneksi();
        model = new MMenuMakanan(view.getIds().get(index),
                Integer.parseInt(view.getTxtHargaMenu().getText()),
                Integer.parseInt(view.getTxtQuantityMenu().getText()),
                view.getTxtNamaMenu().getText(),
                view.getTxtKeterangan().getText());
        try {
            dao.queryUpdate(k.getKoneksi(), model);
            JOptionPane.showMessageDialog(view, "Update Berhasil");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void delete() {
        int index = view.getjTableMenuMakanan().getSelectedRow();
        dao = new DMenuMakanan();
        k = new Koneksi();
        try {
            dao.queryDelete(k.getKoneksi(),view.getIds().get(index));
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void viewTabel() {
        DefaultTableModel tabel = (DefaultTableModel) view.getjTableMenuMakanan().getModel();
        tabel.setRowCount(0);
        k = new Koneksi();
        dao = new DMenuMakanan();
        List<MMenuMakanan> list;
        List<Integer> ids = new ArrayList<>();
        int i = 0;
        try {
            list = dao.queryAllData(k.getKoneksi());
            for (MMenuMakanan model : list) {
                Object data[] = {
                    n++,
                    model.getNama_menu(),
                    model.getHarga(),
                    model.getQuantity_menu()
                };
                tabel.addRow(data);
                ids.add(model.getId_menu());
            }
            view.setIds(ids);
            n = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
}
