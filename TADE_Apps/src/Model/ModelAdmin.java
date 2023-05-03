/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MSI-PC
 */
public class ModelAdmin {
    private int id_admin;
    private String username, password, nama_pegawai, no_hp, jk, alamat, level_akses;

    public ModelAdmin() {}

    public ModelAdmin(int id_admin, String username, String password, String nama_pegawai, String no_hp, String jk, String alamat, String level_akses) {
        this.id_admin = id_admin;
        this.username = username;
        this.password = password;
        this.nama_pegawai = nama_pegawai;
        this.no_hp = no_hp;
        this.jk = jk;
        this.alamat = alamat;
        this.level_akses = level_akses;
    }

    public ModelAdmin(String username, String password, String nama_pegawai, String no_hp, String jk, String alamat) {
        this.username = username;
        this.password = password;
        this.nama_pegawai = nama_pegawai;
        this.no_hp = no_hp;
        this.jk = jk;
        this.alamat = alamat;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLevel_akses() {
        return level_akses;
    }

    public void setLevel_akses(String level_akses) {
        this.level_akses = level_akses;
    }
    
}
