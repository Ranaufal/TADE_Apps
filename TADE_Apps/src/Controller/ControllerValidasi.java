/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DAOValidasi;
import Model.ModelAdmin;
import View.ViewLogin;
import Koneksi.Koneksi;
import View.ViewRegister;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI-PC
 */
public class ControllerValidasi {
    ViewLogin viewLogin;
    ViewRegister viewRegister;
    ModelAdmin model;
    DAOValidasi dao;
    Koneksi k;
    
    public ControllerValidasi(ViewLogin view) {
        this.viewLogin = view;
    }
    
    public ControllerValidasi(ViewRegister view) {
        this.viewRegister = view;
    }
    
    public ModelAdmin login() throws ClassNotFoundException {
        model = new ModelAdmin();
        model.setUsername(viewLogin.getTxtUsername().getText());
        model.setPassword(viewLogin.getTxtPassword().getText());
        dao = new DAOValidasi();
        k = new Koneksi();
        try {
            model = dao.queryLogin(k.getKoneksi(), model.getUsername(), model.getPassword());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(viewLogin, ex.getMessage());
        }
        return model;
    }
    
    public void register() throws ClassNotFoundException {
        model = new ModelAdmin();
        model.setUsername(viewRegister.getTxtUsername().getText());
        model.setPassword(viewRegister.getTxtPassword().getText());
        model.setNama_pegawai(viewRegister.getTxtNamaPegawai().getText());
        model.setNo_hp(viewRegister.getTxtNoHp().getText());
        model.setJk(viewRegister.getJk());
        model.setAlamat(viewRegister.getTxaAlamat().getText());
        dao = new DAOValidasi();
        k = new Koneksi();
        try {
            dao.queryRegister(k.getKoneksi(), model.getUsername(), model.getPassword(), model.getNama_pegawai(), model.getNo_hp(), model.getJk(), model.getAlamat());
            JOptionPane.showMessageDialog(null, "Register Berhasil");
            viewRegister.dispose();
            new ViewLogin().setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
