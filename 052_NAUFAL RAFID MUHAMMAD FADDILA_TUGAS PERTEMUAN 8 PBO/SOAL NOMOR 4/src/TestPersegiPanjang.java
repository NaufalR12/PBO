/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TestPersegiPanjang {
public static void main(String[] args) {
PersegiPanjang pp1 = new PersegiPanjang (2.2f, 4.4f);
System.out.println(pp1);
PersegiPanjang pp2 = new PersegiPanjang();
System.out.println(pp2);
pp1.setLength(4.6f);
pp1.setWidth(6.8f);
System.out.println(pp1);
System.out.printf("Luas: %.2f%n", pp1.getLuas());
System.out.printf("Keliling: %.2f%n", pp2.getKeliling());
}
}
