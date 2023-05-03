/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ModelAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI-PC
 */
public class DAOAdmin {
    public List<ModelAdmin> queryAllData(Connection con) throws SQLException {
        String sql = "SELECT * FROM admin";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<ModelAdmin> list = new ArrayList<>();
        while (rs.next()) {
            ModelAdmin model = new ModelAdmin(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8));
            list.add(model);
        }
        return list;
    }
    
    public void queryUpdate(Connection con, ModelAdmin model) throws SQLException {
        String sql = "UPDATE admin SET username=?, password=?, nama_pegawai=?, no_hp=?, jk=?, alamat=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getUsername());
        ps.setString(2, model.getPassword());
        ps.setString(3, model.getNama_pegawai());
        ps.setString(4, model.getNo_hp());
        ps.setString(5, model.getJk());
        ps.setString(6, model.getAlamat());
        ps.executeUpdate();
    }
    
    public void queryDelete(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM admin WHERE id_admin=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    public int queryId(Connection con, String username) throws SQLException {
        ModelAdmin model = new ModelAdmin();
        String sql = "SELECT * FROM admin WHERE username=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {            
            model.setId_admin(rs.getInt("id_admin"));
        }
        return model.getId_admin();
    }
    
    public ModelAdmin querySingleData(Connection con, int id) throws SQLException {
        String sql = "SELECT * FROM admin WHERE id_admin=?";
        ModelAdmin model = null;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            model = new ModelAdmin(rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nama_pegawai"),
                    rs.getString("no_hp"),
                    rs.getString("jk"),
                    rs.getString("alamat"));
        }
        return model;
    }
}
