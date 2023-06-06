/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tadeapps.Model.MStok;
/**
 *
 * @author ranaufal
 */
public class DStok {
    public void queryInsert(Connection con, MStok model) throws SQLException {
        String sql = "INSERT INTO stok(nama_stok, quantity_stok, satuan, jenis_stok) VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getNama_stok());
        ps.setInt(2, model.getQuantity_stok());
        ps.setString(3, model.getSatuan());
        ps.setString(4, model.getJenis_stok());
        ps.executeUpdate();
    }
    
    public void queryUpdate(Connection con, MStok model) throws SQLException{
        String sql = "UPDATE stok SET nama_stok=?, quantity_stok=?, satuan=?, jenis_stok=? WHERE id_stok=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getNama_stok());
        ps.setInt(2, model.getQuantity_stok());
        ps.setString(3, model.getSatuan());
        ps.setString(4, model.getJenis_stok());
        ps.setInt(5, model.getId_stok());
        ps.executeUpdate();
    }
    
    public void queryDelete(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM stok WHERE id_stok=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    public List<MStok> queryAllData(Connection con) throws SQLException {
        String sql = "SELECT * FROM stok";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<MStok> list = new ArrayList<>();
        while (rs.next()) {
            MStok model = new MStok(rs.getInt("id_stok"),
                    rs.getInt("quantity_stok"),
                    rs.getString("nama_stok"),
                    rs.getString("satuan"),
                    rs.getString("jenis_stok"));
            list.add(model);
        }
        return list;
    }
    
    public List<MStok> queryFilter(Connection con, String jenis_stok) throws SQLException {
        String sql = "SELECT * FROM stok WHERE jenis_stok=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, jenis_stok);
        ResultSet rs = ps.executeQuery();
        List<MStok> list = new ArrayList<>();
        while (rs.next()) {
            MStok model = new MStok(rs.getInt("id_stok"),
                    rs.getInt("quantity_stok"),
                    rs.getString("nama_stok"),
                    rs.getString("satuan"),
                    rs.getString("jenis_stok"));
            list.add(model);
        }
        return list;
    }
}
