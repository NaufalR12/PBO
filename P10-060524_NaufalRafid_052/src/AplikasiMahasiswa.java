/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public class AplikasiMahasiswa {
    private List<Mahasiswa> daftarMahasiswa;

    public AplikasiMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    // mencari dan menampilkan data mahasiswa berdasarkan NIM
    public List<Mahasiswa> cariByNIM(String nim) {
        List<Mahasiswa> mahasiswaDitemukan = new ArrayList<>();
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                mahasiswaDitemukan.add(mahasiswa);
            }
        }
        return mahasiswaDitemukan;
    }

    // mencari dan menampilkan data mahasiswa berdasarkan Nama atau bagian dari Nama
    public List<Mahasiswa> cariByNama(String nama) {
        List<Mahasiswa> mahasiswaDitemukan = new ArrayList<>();
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNama().toLowerCase().contains(nama.toLowerCase())) {
                mahasiswaDitemukan.add(mahasiswa);
            }
        }
        return mahasiswaDitemukan;
    }

    // menampilkan data mahasiswa dengan IPK tertentu
    public List<Mahasiswa> tampilkanByIPK(double ipkTertentu) {
        List<Mahasiswa> mahasiswaDitemukan = new ArrayList<>();
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getIpk() == ipkTertentu) {
                mahasiswaDitemukan.add(mahasiswa);
            }
        }
        return mahasiswaDitemukan;
    }
}
