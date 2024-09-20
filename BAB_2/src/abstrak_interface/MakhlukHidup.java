/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak_interface;

/**
 *
 * @author LENOVO
 */
public abstract class MakhlukHidup {
    
    protected String nama;
    protected int jumlahkaki;
    protected boolean bisaTerbang;
    
    public MakhlukHidup(String nama, int jumlahkaki, boolean bisaTerbang) {
        this.nama = nama;
        this.jumlahkaki = jumlahkaki;
        this.bisaTerbang = bisaTerbang;
        
    }
    
    abstract void bernafas();
    
    public void status() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jumlah kaki : " + jumlahkaki);
        System.out.println("Bisa terbang : " + bisaTerbang);
        
    }
}
