/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ModelAdmin;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MSI-PC
 */
public class DAOValidasi {
    public ModelAdmin queryLogin(Connection con, String username, String password) throws SQLException {
        ModelAdmin model = null;
        String sql = "SELECT * FROM admin WHERE username=? AND password=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            model = new ModelAdmin();
            model.setNama_pegawai(rs.getString("nama_pegawai"));
        }
        return model;
    }
    
    public void queryRegister(Connection con, String username, String password, String nama_pegawai, String no_hp, String jk, String alamat) throws SQLException {
        String sql = "INSERT INTO admin(username, password, nama_pegawai, no_hp, jk, alamat, level_akses) VALUES(?,?,?,?,?,?,'admin')";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, nama_pegawai);
        ps.setString(4, no_hp);
        ps.setString(5, jk);
        ps.setString(6, alamat);
        ps.executeUpdate();
    }
}
