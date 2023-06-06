/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Dao;

import tadeapps.Model.MAdmin;
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
public class DUserAdmin {
    public void queryInsert(Connection con, MAdmin model) throws SQLException {
        String sql = "INSERT INTO admin(username, password, nama_pegawai, no_hp, jk, alamat, level_akses) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getUsername());
        ps.setString(2, model.getPassword());
        ps.setString(3, model.getNama_pegawai());
        ps.setString(4, model.getNo_hp());
        ps.setString(5, model.getJk());
        ps.setString(6, model.getAlamat());
        ps.setString(7, model.getLevel_akses());
        ps.executeUpdate();
    }
    
    public void queryUpdate(Connection con, MAdmin model) throws SQLException{
        String sql = "UPDATE admin SET username=?, password=?, nama_pegawai=?, no_hp=?, jk=?, alamat=?, level_akses=? WHERE id_admin=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getUsername());
        ps.setString(2, model.getPassword());
        ps.setString(3, model.getNama_pegawai());
        ps.setString(4, model.getNo_hp());
        ps.setString(5, model.getJk());
        ps.setString(6, model.getAlamat());
        ps.setString(7, model.getLevel_akses());
        ps.setInt(8, model.getId_admin());
        ps.executeUpdate();
    }
    
    public void queryDelete(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM admin WHERE id_admin=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    public List<MAdmin> queryAllData(Connection con) throws SQLException {
        String sql = "SELECT * FROM admin";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<MAdmin> list = new ArrayList<>();
        while (rs.next()) {
            MAdmin model = new MAdmin(rs.getInt("id_admin"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("nama_pegawai"),
                    rs.getString("no_hp"),
                    rs.getString("jk"),
                    rs.getString("alamat"),
                    rs.getString("level_akses"));
            list.add(model);
        }
        return list;
    }
    
    
}
