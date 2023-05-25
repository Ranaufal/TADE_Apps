/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tadeapps.Model.MAdmin;

/**
 *
 * @author ranaufal
 */
public class DLogin {
    public MAdmin queryLogin(Connection con, String username, String password) throws SQLException {
        MAdmin model = null;
        String sql = "SELECT * FROM admin WHERE username=? AND password=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            model = new MAdmin();
            model.setNama_pegawai(rs.getString("nama_pegawai"));
        }
        return model;
    }
}
