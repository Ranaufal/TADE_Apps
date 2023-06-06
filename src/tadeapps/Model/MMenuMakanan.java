/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Model;

/**
 *
 * @author ranaufal
 */
public class MMenuMakanan {
    private int id_menu, harga, quantity_menu;
    private String nama_menu, keterangan;

    public MMenuMakanan(int harga, int quantity_menu, String nama_menu, String keterangan) {
        this.harga = harga;
        this.quantity_menu = quantity_menu;
        this.nama_menu = nama_menu;
        this.keterangan = keterangan;
    }

    public MMenuMakanan(int id_menu, int harga, int quantity_menu, String nama_menu, String keterangan) {
        this.id_menu = id_menu;
        this.harga = harga;
        this.quantity_menu = quantity_menu;
        this.nama_menu = nama_menu;
        this.keterangan = keterangan;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getQuantity_menu() {
        return quantity_menu;
    }

    public void setQuantity_menu(int quantity_menu) {
        this.quantity_menu = quantity_menu;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
}
