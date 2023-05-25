/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Controller;

import Koneksi.Koneksi;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tadeapps.Dao.DLogin;
import tadeapps.Model.MAdmin;
import tadeapps.View.VLogin;

/**
 *
 * @author ranaufal
 */
public class CLogin {
    VLogin view;
    MAdmin model;
    DLogin dao;
    Koneksi k;
    
    public CLogin(VLogin view){
        this.view = view;
    }
    
    public MAdmin login() throws ClassNotFoundException {
        model = new MAdmin();
        model.setUsername(view.getTxtUsername().getText());
        model.setPassword(view.getTxtPassword().getText());
        dao = new DLogin();
        k = new Koneksi();
        try {
            model = dao.queryLogin(k.getKoneksi(), model.getUsername(), model.getPassword());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
        return model;
    }
}
