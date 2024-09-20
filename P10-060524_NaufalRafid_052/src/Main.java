/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 * Nama : Naufal Rafid Muhammad Faddila
 * NIM : 123220052
 * Kelas : PBO IF-E
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        AplikasiMahasiswa aplikasi = new AplikasiMahasiswa();

        
        aplikasi.tambahMahasiswa(new Mahasiswa("123220052", "Naufal Rafid", 2022, 100, 3.75));
        aplikasi.tambahMahasiswa(new Mahasiswa("123230033", "Arman Naufal", 2023, 80, 3.85));
        aplikasi.tambahMahasiswa(new Mahasiswa("123210001", "Budi Prasetya", 2021, 120, 3.90));
        aplikasi.tambahMahasiswa(new Mahasiswa("123220077", "Caras Wati", 2022, 95, 3.75));
        
        
        
       List<Mahasiswa> mahasiswaByNIM = aplikasi.cariByNIM("123220052");
        int jumlahMahasiswaByNIM = mahasiswaByNIM.size();
        if (jumlahMahasiswaByNIM > 0) {
            System.out.println("Mahasiswa dengan NIM 123220052 ditemukan sebanyak: " + jumlahMahasiswaByNIM);
            for (Mahasiswa m : mahasiswaByNIM) {
                System.out.println("NIM: " + m.getNim());
                System.out.println("Nama: " + m.getNama());
                System.out.println("Angkatan: " + m.getAngkatan());
                System.out.println("Jumlah SKS: " + m.getJumlahSKS());
                System.out.println("IPK: " + m.getIpk());
                System.out.println();
            }
        } else {
            System.out.println("Mahasiswa dengan NIM 123220052 tidak ditemukan.");
        }

       List<Mahasiswa> mahasiswaByNamaPartial = aplikasi.cariByNama("Naufal");
        int jumlahMahasiswaByNamaPartial = mahasiswaByNamaPartial.size();
        if (jumlahMahasiswaByNamaPartial > 0) {
            System.out.println("Mahasiswa dengan nama 'Naufal' ditemukan sebanyak: " + jumlahMahasiswaByNamaPartial);
            for (Mahasiswa m : mahasiswaByNamaPartial) {
                System.out.println("NIM: " + m.getNim());
                System.out.println("Nama: " + m.getNama());
                System.out.println("Angkatan: " + m.getAngkatan());
                System.out.println("Jumlah SKS: " + m.getJumlahSKS());
                System.out.println("IPK: " + m.getIpk());
                System.out.println();
            }
        } else {
            System.out.println("Mahasiswa dengan nama 'Naufal' tidak ditemukan.");
        }

        List<Mahasiswa> mahasiswaByIPK = aplikasi.tampilkanByIPK(3.75);
        System.out.println("Mahasiswa dengan IPK 3.75 ditemukan sebanyak: " + mahasiswaByIPK.size());
        for (Mahasiswa m : mahasiswaByIPK) {
            System.out.println("NIM: " + m.getNim());
            System.out.println("Nama: " + m.getNama());
            System.out.println("Angkatan: " + m.getAngkatan());
            System.out.println("Jumlah SKS: " + m.getJumlahSKS());
            System.out.println("IPK: " + m.getIpk());
            System.out.println();
        }
    }
}
