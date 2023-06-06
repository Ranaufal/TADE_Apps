/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;


import java.awt.GridBagConstraints;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Koneksi.Koneksi;
import tadeapps.Dao.DPengeluaran;
import tadeapps.Model.MPengeluaran;
import tadeapps.View.VDataPengeluaran;
import tadeapps.View.VInputTransaksiPengeluaran;
import tadeapps.View.panel.PInputPengeluaran;

/**
 *
 * @author ranaufal
 */
public class CPengeluaran {
    
    VInputTransaksiPengeluaran view;
    VDataPengeluaran viewData;
    DPengeluaran dao;
    MPengeluaran model;
    Koneksi k;
    PInputPengeluaran [] pip;
    private int n = 1;
    

    public CPengeluaran(VInputTransaksiPengeluaran view) {
        this.view = view;
    }
    
    public CPengeluaran (VDataPengeluaran viewData){
        this.viewData = viewData;
    }
    
    public void TampilkanInputnya(){
        GridBagConstraints gbc = new GridBagConstraints();
        dao = new DPengeluaran();
        k = new Koneksi();
        

        List<MPengeluaran> myList;
        int counter = 0, i = 0;
        try {
            myList = dao.getInputPengeluaran(k.getKoneksi());
            pip = new PInputPengeluaran[myList.size()];
            for (MPengeluaran model : myList){
                pip[i] = new PInputPengeluaran(
                        model.getNama_jpengeluaran(),
                        model.getSatuan(),
                        model.getId_jpengeluaran()
                );
                if(i%2 == 0){
                    gbc.gridx = 0;
                    gbc.gridy = counter;
                }else{
                    gbc.gridx = 1;
                    gbc.gridy = counter;
                    counter++;
                }
                view.getMainPanel().add(pip[i],gbc);
                i++;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CPengeluaran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CPengeluaran.class.getName()).log(Level.SEVERE, null, ex);
        }          
           
    }
    
    public void TampilkanSemuaData(int filter){
        DefaultTableModel tabel = (DefaultTableModel)viewData.getTabelPengeluaran().getModel();
        tabel.setRowCount(0);
        dao = new DPengeluaran();
        k = new Koneksi();
        List<MPengeluaran> list;
        try {
            list = dao.getAllPengeluaran(k.getKoneksi(),filter);
            for (MPengeluaran model : list) {
                Object data[] = {
                    n++,
                    model.getNama_jpengeluaran(),
                    model.getTotal_biaya(),
                    model.getQuantity()+" "+model.getSatuan(),
                    model.getUsername(),
                    model.getTgl_pengeluaran()
                };
                tabel.addRow(data);
            }
            n = 1;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CPengeluaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert() {
        dao = new DPengeluaran();
        k = new Koneksi();
        try {
            for(int i=0; i<pip.length; i++){
                if(pip[i].isChecked){
                    dao.insert(k.getKoneksi(), pip[i].id_jpengeluaran, Integer.parseInt(pip[i].getBiayaBeli().getText()), Integer.parseInt(pip[i].getQuantity().getText()), view.id_admin);
                }
            }
            JOptionPane.showMessageDialog(null, "Register Berhasil");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CPengeluaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
