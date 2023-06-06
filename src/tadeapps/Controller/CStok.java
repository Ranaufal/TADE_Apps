/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;

import Koneksi.Koneksi;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import tadeapps.Dao.DStok;
import tadeapps.Model.MStok;
import tadeapps.View.VMasterStok;
/**
 *
 * @author ranaufal
 */
public class CStok {
    VMasterStok view;
    MStok model;
    DStok dao;
    Koneksi k;
    private int n = 1;

    public CStok(VMasterStok view) {
        this.view = view;
    }
    public void insert() {
        model = new MStok(Integer.parseInt(view.getTxtQuantity().getText()),
                view.getTxtNamaStock().getText(),
                view.getTxtSatuan().getText(),
                view.getTxtJenisStock().getText());
        dao = new DStok();
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
        int index = view.getjTableMasterStok().getSelectedRow();
        dao = new DStok();
        k = new Koneksi();
        model = new MStok(view.getIds().get(index),
                Integer.parseInt(view.getTxtQuantity().getText()),
                view.getTxtNamaStock().getText(),
                view.getTxtSatuan().getText(),
                view.getTxtJenisStock().getText());
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
        int index = view.getjTableMasterStok().getSelectedRow();
        dao = new DStok();
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
        DefaultTableModel tabel = (DefaultTableModel) view.getjTableMasterStok().getModel();
        tabel.setRowCount(0);
        k = new Koneksi();
        dao = new DStok();
        List<MStok> list;
        List<Integer> ids = new ArrayList<>();
        int i = 0;
        try {
            list = dao.queryAllData(k.getKoneksi());
            for (MStok model : list) {
                Object data[] = {
                    n++,
                    model.getNama_stok(),
                    model.getQuantity_stok(),
                    model.getSatuan(),
                    model.getJenis_stok()
                };
                tabel.addRow(data);
                ids.add(model.getId_stok());
            }
            view.setIds(ids);
            n = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void filter() {
        DefaultTableModel tabel = (DefaultTableModel) view.getjTableMasterStok().getModel();
        tabel.setRowCount(0);
        k = new Koneksi();
        dao = new DStok();
        List<MStok> list;
        List<Integer> ids = new ArrayList<>();
        int i = 0;
        try {
            list = dao.queryFilter(k.getKoneksi(), view.getjComboBoxFilter().getSelectedItem().toString());
            for (MStok model : list) {
                Object data[] = {
                    n++,
                    model.getNama_stok(),
                    model.getQuantity_stok(),
                    model.getSatuan(),
                    model.getJenis_stok()
                };
                tabel.addRow(data);
                ids.add(model.getId_stok());
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
