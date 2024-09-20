/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
public class Stark extends MakhlukHidup implements Pekerjaan {
    
    Stark(String nama) {
        super(nama, 2, true);
    }
    
    public void bernafas() {
        System.out.println(nama + " menghirup O2");
        
    }
    
    public void namaPekerjaan() {
        System.out.println("Pekerjaan    : President Director");
    }
    
    public void gaji() {
        System.out.println("Gaji    : Rp. 900.000.000,-");
    }
    
    public static void main(String[] args) {
        Stark tony = new Stark("Anthony Stark");
        tony.status();
        tony.bernafas();
        System.out.println("Nama perusahaan : " + namaPerusahaan);
        tony.namaPekerjaan();
        tony.gaji();
        System.out.println("Bonus gaji : " + bonus);
    }
}