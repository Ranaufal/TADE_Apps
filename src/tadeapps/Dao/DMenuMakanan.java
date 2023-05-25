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
            MMenuMakanan model = new MMenuMakanan(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
            list.add(model);
        }
        return list;
    }
    
    public void insert(Connection con, MMenuMakanan mm) throws SQLException{
        String sql = "insert into menu_makanan values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, mm.getId());
        ps.setString(2, mm.getNama_menu());
        ps.setString(3, mm.getHarga());
        ps.setString(4, mm.getKeterangan());
        ps.executeUpdate();
    }
}
