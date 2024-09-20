/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.model;

/**
 *
 * @author Asus X450J
 */
public class Transaksi {
    private String id;
    private Film film;
    private String show;
    private String barisan;
    private String kursi;
    private String kelas;
    private String jumlah;
    private int harga;
    

    public Transaksi(String id, Film film, String show, String barisan, String kelas, String kursi, String jumlah, int harga) {
        this.film = film;
        this.show = show;
        this.barisan = barisan;
        this.kelas = kelas;
        this.kursi = kursi;
        this.jumlah = jumlah;
        this.harga = harga;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }
    
    public String getBarisan() {
        return barisan;
    }

    public void setBarisan(String barisan) {
        this.barisan = barisan;
    }
    
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public String getKursi() {
        return kursi;
    }

    public void setKursi(String kursi) {
        this.kursi = kursi;
    }
    
    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
