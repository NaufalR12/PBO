/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestInvois {
public static void main(String[] args) {
InvoisBarang inv1 = new InvoisBarang("P101", "Pulpen biru", 132, 8000);
System.out.println(inv1);
inv1.setJumlah(200);
inv1.setHargaSatuan(8500);
System.out.println(inv1);
System.out.println("ID barang: " + inv1.getId());
System.out.println("Nama barang: " + inv1.getNamaBarang());
System.out.println("Jumlah dibeli: " + inv1.getJumlah());
System.out.println("Harga satuan: " + inv1.getHargaSatuan());
System.out.println("Total tagihan: " + inv1.getTagihan());
}
}
