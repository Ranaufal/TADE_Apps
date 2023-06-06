/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Model;

/**
 *
 * @author ranaufal
 */
public class MPengeluaran {
    private String nama_jpengeluaran,satuan,username;
    private String id_pengeluaran,id_jpengeluaran,tgl_pengeluaran,id_admin;
    private int total_biaya,quantity;
    
    public MPengeluaran(String id_jpengeluaran,String nama_jpengeluaran,String satuan){
        this.id_jpengeluaran = id_jpengeluaran;
        this.nama_jpengeluaran = nama_jpengeluaran;
        this.satuan = satuan;
    }
    
    public MPengeluaran(String nama_jpengeluaran,int total_biaya,int quantity,String satuan,String username,String tgl_pengeluaran){
        this.nama_jpengeluaran = nama_jpengeluaran;
        this.total_biaya = total_biaya;
        this.quantity = quantity;
        this.satuan = satuan;
        this.username = username;
        this.tgl_pengeluaran = tgl_pengeluaran;
    }
    

    public String getId_pengeluaran() {
        return id_pengeluaran;
    }

    public void setId_pengeluaran(String id_pengeluaran) {
        this.id_pengeluaran = id_pengeluaran;
    }

    public String getId_jpengeluaran() {
        return id_jpengeluaran;
    }

    public void setId_jpengeluaran(String id_jpengeluaran) {
        this.id_jpengeluaran = id_jpengeluaran;
    }

    public String getTgl_pengeluaran() {
        return tgl_pengeluaran;
    }

    public void setTgl_pengeluaran(String tgl_pengeluaran) {
        this.tgl_pengeluaran = tgl_pengeluaran;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama_jpengeluaran() {
        return nama_jpengeluaran;
    }

    public void setNama_jpengeluaran(String nama_jpengeluaran) {
        this.nama_jpengeluaran = nama_jpengeluaran;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
