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

import tadeapps.Model.MMenuMakanan;

/**
 *
 * @author ranaufal
 */
public class DMenuMakanan {
    public List<MMenuMakanan> queryAllData(Connection con) throws SQLException {
        String sql = "SELECT * FROM menu_makanan";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<MMenuMakanan> list = new ArrayList<>();
        while (rs.next()) {
            MMenuMakanan model = new MMenuMakanan(rs.getInt("id_menu"),
                    rs.getInt("harga"),
                    rs.getInt("quantity_menu"),
                    rs.getString("nama_menu"),
                    rs.getString("keterangan"));
            list.add(model);
        }
        return list;
    }
    
    public void queryInsert(Connection con, MMenuMakanan model) throws SQLException {
        String sql = "INSERT INTO menu_makanan(nama_menu, harga, quantity_menu, keterangan) VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getNama_menu());
        ps.setInt(2, model.getHarga());
        ps.setInt(3, model.getQuantity_menu());
        ps.setString(4, model.getKeterangan());
        ps.executeUpdate();
    }
    
    public void queryUpdate(Connection con, MMenuMakanan model) throws SQLException{
        String sql = "UPDATE menu_makanan SET nama_menu=?, harga=?, quantity_menu=?, keterangan=? WHERE id_menu=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getNama_menu());
        ps.setInt(2, model.getHarga());
        ps.setInt(3, model.getQuantity_menu());
        ps.setString(4, model.getKeterangan());
        ps.setInt(5, model.getId_menu());
        ps.executeUpdate();
    }
    
    public void queryDelete(Connection con, int id) throws SQLException {
        String sql = "DELETE FROM menu_makanan WHERE id_menu=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    
    
}
