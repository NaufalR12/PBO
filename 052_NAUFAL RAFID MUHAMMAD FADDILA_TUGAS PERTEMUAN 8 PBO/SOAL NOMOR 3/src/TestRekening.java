/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestRekening {
public static void main(String[] args) {
Rekening r1 = new Rekening("S101", "Sugiyantoro", 110);
System.out.println(r1);
Rekening r2 = new Rekening("F102", "Fachri Husaini");
System.out.println(r2);
System.out.println("No. rekening: " + r1.getID());
System.out.println("Nama: " + r1.getNama());
System.out.println("Saldo: " + r1.getSaldo());
r1.kredit(100);
System.out.println(r1);
r1.debit(50);
System.out.println(r1);
r1.debit(500);
System.out.println(r1);
r1.transferKe(r2, 100);
System.out.println(r1);
System.out.println(r2);
}
}