/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ViewAdmin;
import View.ViewUpdateAdmin;
import Model.ModelAdmin;
import DAO.DAOAdmin;
import Koneksi.Koneksi;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-PC
 */
public class ControllerAdmin {
    ViewAdmin view;
    ViewUpdateAdmin viewUpdate;
    ModelAdmin model;
    DAOAdmin dao;
    Koneksi k;
    private int n = 1;
    
    public ControllerAdmin(ViewAdmin view) {
        this.view = view;
    }

    public ControllerAdmin(ViewUpdateAdmin viewUpdate) {
        this.viewUpdate = viewUpdate;
    }
    
    public void update() throws ClassNotFoundException {
        model = new ModelAdmin(viewUpdate.getTxtUsername().getText(),
                viewUpdate.getTxtPassword().getText(),
                viewUpdate.getTxtNamaPegawai().getText(),
                viewUpdate.getTxtNoHp().getText(),
                viewUpdate.getJk(),
                viewUpdate.getTxtAlamat().getText());
        dao = new DAOAdmin();
        k = new Koneksi();
        try {
            dao.queryUpdate(k.getKoneksi(), model);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void hapus() throws ClassNotFoundException {
        DefaultTableModel tabel = (DefaultTableModel)view.getTabelAdmin().getModel();
        model = new ModelAdmin();
        int index = view.getTabelAdmin().getSelectedRow();
        model.setUsername(tabel.getValueAt(index, 1).toString());
        dao = new DAOAdmin();
        k = new Koneksi();
        try {
            int id = dao.queryId(k.getKoneksi(), model.getUsername());
            dao.queryDelete(k.getKoneksi(), id);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void viewTabel() throws ClassNotFoundException {
        DefaultTableModel tabel = (DefaultTableModel)view.getTabelAdmin().getModel();
        tabel.setRowCount(0);
        dao = new DAOAdmin();
        k = new Koneksi();
        List<ModelAdmin> list;
        try {
            list = dao.queryAllData(k.getKoneksi());
            for (ModelAdmin model : list) {
                Object data[] = {
                    n++,
                    model.getUsername(),
                    model.getPassword(),
                    model.getNama_pegawai(),
                    model.getNo_hp(),
                    model.getJk(),
                    model.getAlamat(),
                    model.getLevel_akses()
                };
                tabel.addRow(data);
            }
            n = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void setUpdate() throws ClassNotFoundException {
        DefaultTableModel tabel = (DefaultTableModel)view.getTabelAdmin().getModel();
        model = new ModelAdmin();
        dao = new DAOAdmin();
        k = new Koneksi();
        int index = view.getTabelAdmin().getSelectedRow();
        model.setUsername(tabel.getValueAt(index, 1).toString());
        try {
            dao.queryId(k.getKoneksi(), model.getUsername());
            model = dao.querySingleData(k.getKoneksi(), model.getId_admin());
            viewUpdate.getTxtUsername().setText(model.getUsername());
            viewUpdate.getTxtPassword().setText(model.getPassword());
            viewUpdate.getTxtNamaPegawai().setText(model.getNama_pegawai());
            viewUpdate.getTxtNoHp().setText(model.getNo_hp());
            viewUpdate.getJk().setText(model.getUsername());
            viewUpdate.getTxtUsername().setText(model.getUsername());
        } catch (SQLException ex) {
            Logger.getLogger(ControllerAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
