/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Pegawai {
    private int id;
    private String namaDepan;
    private String namaBelakang;
    private double gaji;

    public Pegawai(int id, String namaDepan, String namaBelakang, double gaji) {
        this.id = id;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.gaji = gaji;
    }

    public void setSalary(double gaji) {
        this.gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public double getGaji() {
        return gaji;
    }

    public String getNamaLengkap() {
        return namaDepan + " " + namaBelakang;
    }

    public double getGajiTahun() {
        return gaji * 12;
    }

    public double naikGaji(double persentase) {
        double kenaikan = gaji * persentase / 100;
        gaji += kenaikan;
        return gaji;
    }

    @Override
    public String toString() {
        return "Pegawai[id=" + id + ", nama=" + getNamaLengkap() + ", gaji=" + gaji + "]";
    }
}
