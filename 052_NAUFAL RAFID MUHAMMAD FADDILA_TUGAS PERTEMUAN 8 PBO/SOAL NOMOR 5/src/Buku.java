/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Buku {
    private String bookID;
    private String judul;
    private Author author;
    private double harga;
    private int stok;

    public Buku(String bookID, String judul, Author author, double harga, int stok) {
        this.bookID = bookID;
        this.judul = judul;
        this.author = author;
        this.harga = harga;
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getBookID() {
        return bookID;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Buku[id=" + bookID + ", judul=" + judul + ", " + author + ", harga=" + harga + ", stok=" + stok + "]";
    }
}

