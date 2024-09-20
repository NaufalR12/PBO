/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPanjang() {
        return length;
    }

    public void setPanjang(double length) {
        this.length = length;
    }

    public double getLebar() {
        return width;
    }

    public void setLebar(double width) {
        this.width = width;
    }

    public double getKeliling() {
        return 2 * (length + width);
    }

    public String getDesc() {
        return String.format("[Panjang=%.2f, Lebar=%.2f]", length, width);
    }
}

class PersegiPanjang extends Rectangle {
    public PersegiPanjang(double length, double width) {
        super(length, width);
    }
}

public class TestMain {
    public static void main(String[] args) {
        Rectangle r1 = new PersegiPanjang(5, 6);
        System.out.println(r1.getDesc());
        r1.setPanjang(7);
        r1.setLebar(2);
        System.out.println(r1.getDesc());
        System.out.printf("Keliling : %.2f%n", r1.getKeliling());
    }
}

