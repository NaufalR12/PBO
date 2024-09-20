/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestPegawai {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai(1008, "Robert", "Mugabe", 8500);
        System.out.println(p1);
        p1.setSalary(9000);
        System.out.println(p1);
        System.out.println("ID pegawai: " + p1.getId());
        System.out.println("Nama depan: " + p1.getNamaDepan());
        System.out.println("Nama belakang: " + p1.getNamaBelakang());
        System.out.println("Besar gaji (ribu): " + p1.getGaji());
        System.out.println("Nama lengkap: " + p1.getNamaLengkap());
        System.out.println("Gaji setahun (ribu): " + p1.getGajiTahun());
        System.out.println(p1.naikGaji(20));
        System.out.println(p1);
    }
}
