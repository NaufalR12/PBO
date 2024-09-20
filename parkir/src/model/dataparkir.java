/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class dataparkir {
    private String nama;
    private String jenis;
    private String plat;
    private String merk;
    private int durasi;
    private int total;

    public String getNama() {
        return nama;
    }
    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public int hitungTotal() {
        if (jenis.equalsIgnoreCase("MOBIL")) {
            if (durasi <= 3) {
                return durasi * 5000;
            } else {
                int biayaDasar = 3 * 5000;
                int tambahanJam = durasi - 3;
                int biayaTambahan = (tambahanJam * 2000) + (tambahanJam * 5000);
                return biayaDasar + biayaTambahan;
            }
        } else if (jenis.equalsIgnoreCase("MOTOR")) {
            if (durasi <= 3) {
                return durasi * 3000;
            } else {
                int biayaDasar = 3 * 3000;
                int tambahanJam = durasi - 3;
                int biayaTambahan = (tambahanJam * 1000) + (tambahanJam * 3000);
                return biayaDasar + biayaTambahan;
            }
        } else {
            // Tampilkan notifikasi error
            JOptionPane.showMessageDialog(null, "Jenis kendaraan tidak teridentifikasi", "Error", JOptionPane.ERROR_MESSAGE);
            return 0; // Atau nilai lain yang sesuai sebagai default/error
        }
                
        
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

            
    
}
