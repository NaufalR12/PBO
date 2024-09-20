/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class InvoisBarang {
    private String id;
    private String namaBarang;
    private int jumlah;
    private double hargaSatuan;

    public InvoisBarang(String id, String namaBarang, int jumlah, double hargaSatuan) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getId() {
        return id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public double getTagihan() {
        return jumlah * hargaSatuan;
    }

    @Override
    public String toString() {
        return "InvoisBarang[id=" + id + ", nama=" + namaBarang + ", jumlah=" + jumlah + ", unitPrice=" + hargaSatuan + "]";
    }
}

