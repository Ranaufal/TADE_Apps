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

import tadeapps.Model.MPengeluaran;

/**
 *
 * @author ranaufal
 */
public class DPengeluaran {
    public List<MPengeluaran> getInputPengeluaran(Connection con) throws SQLException{
        String sql = "SELECT * FROM jenis_pengeluaran";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<MPengeluaran> list = new ArrayList<>();
        while (rs.next()) {
            MPengeluaran model = new MPengeluaran(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3));
            list.add(model);
        }
        return list;
    }
    public List<MPengeluaran> getAllPengeluaran(Connection con,int filter) throws SQLException{
        String sql;
        if(filter == 1){
            sql = "SELECT nama_jpengeluaran,total_biaya,quantity,satuan,username,tgl_pengeluaran \n" +
                    "FROM jenis_pengeluaran join pengeluaran USING(id_jpengeluaran)\n" +
                    " join admin USING(id_admin) WHERE tgl_pengeluaran=DATE(now())";
        }else if(filter == 2){
            sql = "SELECT nama_jpengeluaran,total_biaya,quantity,satuan,username,tgl_pengeluaran \n" +
                    "FROM jenis_pengeluaran join pengeluaran USING(id_jpengeluaran)\n" +
                    " join admin USING(id_admin) WHERE MONTH(tgl_pengeluaran) = MONTH(now()) AND YEAR(tgl_pengeluaran) = YEAR(now())";
        }else{
            sql = "SELECT nama_jpengeluaran,total_biaya,quantity,satuan,username,tgl_pengeluaran \n" +
                    "FROM jenis_pengeluaran join pengeluaran USING(id_jpengeluaran)\n" +
                    " join admin USING(id_admin)";
        }
        
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<MPengeluaran> list = new ArrayList<>();
        while (rs.next()) {
            MPengeluaran model = new MPengeluaran(
                rs.getString(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6));
            list.add(model);
        }
        return list;
    }
    
    public void insert(Connection con, String id_jpengeluaran, int total_biaya, int quantity, String id_admin) throws SQLException {
        String sql = "INSERT INTO pengeluaran(id_jpengeluaran, total_biaya, quantity, id_admin, tgl_pengeluaran) VALUES(?,?,?,?,now())";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id_jpengeluaran);
        ps.setInt(2, total_biaya);
        ps.setInt(3, quantity);
        ps.setString(4, id_admin);
        ps.executeUpdate();
    }
    
}
