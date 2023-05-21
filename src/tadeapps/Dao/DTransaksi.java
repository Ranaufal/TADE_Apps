/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;

import tadeapps.Model.MTransaksi;
/**
 *
 * @author ranaufal
 */
public class DTransaksi {
    public List<MTransaksi> queryAllData(Connection con, String id_customer)throws SQLException {
        String sql = "SELECT id_menu,harga,quantity,harga * quantity as total,nama_menu "
                + "FROM barcode JOIN menu_makanan USING(id_menu) "
                + "WHERE id_customer=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id_customer);
        ResultSet rs = ps.executeQuery();
        List<MTransaksi> list = new ArrayList<>();
        while (rs.next()) {
            MTransaksi model = new MTransaksi(
                    rs.getInt("id_menu"),
                    rs.getInt("harga"),                    
                    rs.getInt("quantity"),
                    rs.getInt("total"),
                    rs.getString("nama_menu"));
            list.add(model);
        }
        return list;
    }
}
