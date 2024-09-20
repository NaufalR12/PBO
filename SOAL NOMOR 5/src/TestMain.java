/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestMain {
public static void main(String[] args) {
Author a1 = new Author("Ian Sommerville", "sommerville@nowhere.com");
System.out.println(a1);
a1.setEmail("sommerville@somewhere.com");
System.out.println(a1);
System.out.println("Nama pengarang: " + a1.getNama());
System.out.println("Email pengarang: " + a1.getEmail());
Buku b1 = new Buku("11134", "Software Engineering", a1, 59.99, 71);
System.out.println(b1);
b1.setHarga(44.99);
b1.setStok(81);
System.out.println(b1);
System.out.println("ID buku: " + b1.getBookID());
System.out.println("Judul buku: " + b1.getJudul());
System.out.println("Harga buku: " + b1.getHarga());
System.out.println("Jumlah stok: " + b1.getStok());
System.out.println("Nama pengarang: " + b1.getAuthor());
System.out.println("Nama pengarang: " + b1.getAuthor().getNama());
System.out.println("Email pengarang: " + b1.getAuthor().getEmail());
}
}
