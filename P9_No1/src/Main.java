/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
// Superclass Pekerjaan
class Pekerjaan {
    // Method untuk mendapatkan deskripsi pekerjaan
    public void deskripsi() {
        System.out.println("Ini adalah pekerjaan umum.");
    }
}

// Subclass 1: Pekerjaan Programmer
class Programmer extends Pekerjaan {
    // Method overriding untuk mendapatkan deskripsi pekerjaan programmer
    @Override
    public void deskripsi() {
        System.out.println("Seorang programmer adalah seseorang yang membuat dan mengembangkan perangkat lunak.");
    }
}

// Subclass 2: Pekerjaan Dokter
class Dokter extends Pekerjaan {
    // Method overriding untuk mendapatkan deskripsi pekerjaan dokter
    @Override
    public void deskripsi() {
        System.out.println("Seorang dokter adalah seorang profesional medis yang merawat pasien dan mendiagnosis penyakit.");
    }
}

// Subclass 3: Pekerjaan Pengacara
class Pengacara extends Pekerjaan {
    // Method overriding untuk mendapatkan deskripsi pekerjaan pengacara
    @Override
    public void deskripsi() {
        System.out.println("Seorang pengacara memberikan nasihat hukum dan mewakili klien di pengadilan.");
    }
}

// Kelas utama untuk menguji implementasi method overriding
public class Main {
    public static void main(String[] args) {
        // Objek pekerjaan umum
        Pekerjaan pekerjaanUmum = new Pekerjaan();
        pekerjaanUmum.deskripsi(); // Output: Ini adalah pekerjaan umum.

        // Objek pekerjaan programmer
        Pekerjaan programmer = new Programmer();
        programmer.deskripsi(); // Output: Seorang programmer adalah seseorang yang membuat dan mengembangkan perangkat lunak.

        // Objek pekerjaan dokter
        Pekerjaan dokter = new Dokter();
        dokter.deskripsi(); // Output: Seorang dokter adalah seorang profesional medis yang merawat pasien dan mendiagnosis penyakit.

        // Objek pekerjaan pengacara
        Pekerjaan pengacara = new Pengacara();
        pengacara.deskripsi(); // Output: Seorang pengacara memberikan nasihat hukum dan mewakili klien di pengadilan.
    }
}

