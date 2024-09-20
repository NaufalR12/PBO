/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Rekening {
    private String id;
    private String nama;
    private double saldo;

    public Rekening(String id, String nama, double saldo) {
        this.id = id;
        this.nama = nama;
        this.saldo = saldo;
    }

    public Rekening(String id, String nama) {
        this(id, nama, 0); 
    }

    public String getID() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void kredit(double jumlah) {
        saldo += jumlah;
    }

    public boolean debit(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi");
            return false;
        }
    }

    public void transferKe(Rekening tujuan, double jumlah) {
        if (debit(jumlah)) {
            tujuan.kredit(jumlah);
        } else {
            System.out.println("Transfer gagal: Saldo tidak mencukupi");
        }
    }

    @Override
    public String toString() {
        return "Rekening[id=" + id + ", nama=" + nama + ", saldo=" + (int) saldo + "]";
    }
}
