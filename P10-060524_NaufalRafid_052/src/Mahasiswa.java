/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private int angkatan;
    private int jumlahSKS;
    private double ipk;

    public Mahasiswa(String nim, String nama, int angkatan, int jumlahSKS, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
        this.jumlahSKS = jumlahSKS;
        this.ipk = ipk;
    }

    // Getter methods
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public int getJumlahSKS() {
        return jumlahSKS;
    }

    public double getIpk() {
        return ipk;
    }
}
