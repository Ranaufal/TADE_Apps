/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Model;

/**
 *
 * @author ranaufal
 */
public class MStok {
    int id_stok, quantity_stok;
    String nama_stok, satuan, jenis_stok;

    public MStok(int quantity_stok, String nama_stok, String satuan, String jenis_stok) {
        this.quantity_stok = quantity_stok;
        this.nama_stok = nama_stok;
        this.satuan = satuan;
        this.jenis_stok = jenis_stok;
    }

    public MStok(int id_stok, int quantity_stok, String nama_stok, String satuan, String jenis_stok) {
        this.id_stok = id_stok;
        this.quantity_stok = quantity_stok;
        this.nama_stok = nama_stok;
        this.satuan = satuan;
        this.jenis_stok = jenis_stok;
    }

    public int getId_stok() {
        return id_stok;
    }

    public void setId_stok(int id_stok) {
        this.id_stok = id_stok;
    }

    public int getQuantity_stok() {
        return quantity_stok;
    }

    public void setQuantity_stok(int quantity_stok) {
        this.quantity_stok = quantity_stok;
    }

    public String getNama_stok() {
        return nama_stok;
    }

    public void setNama_stok(String nama_stok) {
        this.nama_stok = nama_stok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getJenis_stok() {
        return jenis_stok;
    }

    public void setJenis_stok(String jenis_stok) {
        this.jenis_stok = jenis_stok;
    }
}
