/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang() {
        this.panjang = 3.0f;
        this.lebar = 4.0f;
    }

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setLength(float panjang) {
        this.panjang = panjang;
    }

    public void setWidth(float lebar) {
        this.lebar = lebar;
    }

    public float getLength() {
        return panjang;
    }

    public float getWidth() {
        return lebar;
    }

    public float getLuas() {
        return panjang * lebar;
    }

    public float getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public String toString() {
        return String.format("PersegiPanjang [panjang=%.1f, lebar=%.1f]", panjang, lebar);
    }
}

