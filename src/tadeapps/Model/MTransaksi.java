/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tadeapps.Model;

/**
 *
 * @author ranaufal
 */
public class MTransaksi {
    private int id_menu,harga,quantity,total;
    private String nama_menu;
    
    public MTransaksi(int id_menu, int harga, int quantity,int total, String nama_menu){
        this.id_menu = id_menu;
        this.harga = harga;
        this.nama_menu = nama_menu;
        this.quantity= quantity;        
        this.total= total;
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

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    
}
