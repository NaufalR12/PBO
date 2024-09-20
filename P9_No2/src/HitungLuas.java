/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class HitungLuas {
    // Method untuk menghitung luas persegi dengan satu parameter (sisi)
    public double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    // Method untuk menghitung luas persegi panjang dengan dua parameter (panjang dan lebar)
    public double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung luas segitiga dengan tiga parameter (alas, tinggi, dan jenis segitiga)
    public double hitungLuas(double alas, double tinggi, String jenisSegitiga) {
        double luas = 0;
        if (jenisSegitiga.equalsIgnoreCase("segitiga sama sisi")) {
            luas = (alas * tinggi) / 2;
        } else if (jenisSegitiga.equalsIgnoreCase("segitiga sama kaki")) {
            luas = (alas * tinggi) / 2;
        }
        return luas;
    }

    public static void main(String[] args) {
        HitungLuas hitung = new HitungLuas();

        // Memanggil method hitungLuas untuk persegi
        System.out.println("Luas persegi dengan sisi 5: " + hitung.hitungLuas(5));

        // Memanggil method hitungLuas untuk persegi panjang
        System.out.println("Luas persegi panjang dengan panjang 4 dan lebar 6: " + hitung.hitungLuas(4, 6));

        // Memanggil method hitungLuas untuk segitiga
        System.out.println("Luas segitiga dengan alas 3, tinggi 4, dan jenis segitiga sama sisi: " +
                hitung.hitungLuas(3, 4, "segitiga sama sisi"));
    }
}

