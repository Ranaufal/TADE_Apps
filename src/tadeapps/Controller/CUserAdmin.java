/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;

import tadeapps.View.VUserAdmin;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import tadeapps.Model.MAdmin;
import tadeapps.Dao.DUserAdmin;
import Koneksi.Koneksi;
/**
 *
 * @author MSI-PC
 */
public class CUserAdmin {
    Koneksi k;
    VUserAdmin view;
    MAdmin model;
    DUserAdmin dao;
    private int n = 1;

    public CUserAdmin(VUserAdmin view) {
        this.view = view;
    }

    public void insert() {
        model = new MAdmin(view.getTxtUsername().getText(),
                view.getTxtPassword().getText(),
                view.getTxtNamaPegawai().getText(),
                view.getTxtNoHp().getText(),
                view.getjComboBoxJk().getSelectedItem().toString(),
                view.getTxtAlamat().getText(),
                view.getjComboBoxLvlAkses().getSelectedItem().toString());
        dao = new DUserAdmin();
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
        dao = new DUserAdmin();
        k = new Koneksi();
        model = new MAdmin(view.getId(),
                view.getTxtUsername().getText(),
                view.getTxtUsername().getText(),
                view.getTxtUsername().getText(),
                view.getTxtUsername().getText(),
                view.getjComboBoxJk().getSelectedItem().toString(),
                view.getTxtAlamat().getText(),
                view.getjComboBoxLvlAkses().getSelectedItem().toString());
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
        int index = view.getjTableAdmin().getSelectedRow();
        dao = new DUserAdmin();
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
        DefaultTableModel tabel = (DefaultTableModel) view.getjTableAdmin().getModel();
        tabel.setRowCount(0);
        k = new Koneksi();
        dao = new DUserAdmin();
        List<MAdmin> list;
        List<Integer> ids = new ArrayList<>();
        List<String> alamats = new ArrayList<>();
        int i = 0;
        try {
            list = dao.queryAllData(k.getKoneksi());
            for (MAdmin model : list) {
                Object data[] = {
                    n++,
                    model.getUsername(),
                    model.getPassword(),
                    model.getNama_pegawai(),
                    model.getNo_hp(),
                    model.getJk(),
                    model.getLevel_akses()
                };
                tabel.addRow(data);
                ids.add(model.getId_admin());
                alamats.add(model.getAlamat());
            }
            view.setIds(ids);
            view.setAlamats(alamats);
            n = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }

    public void search() {
        view.setId(view.getIds().get(view.getjTableAdmin().getSelectedRow()));
        view.getTxtUsername().setText(view.getjTableAdmin().getValueAt(view.getjTableAdmin().getSelectedRow(), 1).toString());
        view.getTxtPassword().setText(view.getjTableAdmin().getValueAt(view.getjTableAdmin().getSelectedRow(), 2).toString());
        view.getTxtNamaPegawai().setText(view.getjTableAdmin().getValueAt(view.getjTableAdmin().getSelectedRow(), 3).toString());
        view.getTxtNoHp().setText(view.getjTableAdmin().getValueAt(view.getjTableAdmin().getSelectedRow(), 4).toString());
        view.getjComboBoxJk().setSelectedItem(view.getjTableAdmin().getValueAt(view.getjTableAdmin().getSelectedRow(), 5).toString());
        view.getjComboBoxLvlAkses().setSelectedItem(view.getjTableAdmin().getValueAt(view.getjTableAdmin().getSelectedRow(), 6).toString());
        view.getTxtAlamat().setText(view.getAlamats().get(view.getjTableAdmin().getSelectedRow()));
    }
            
}
