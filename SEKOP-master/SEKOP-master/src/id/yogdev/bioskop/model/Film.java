/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.model;

/**
 *
 * @author Asus X450J
 */
public class Film {
    private String id;
    private String name;
    private String genre;
    private String jammulai1;
    private String jamselesai1;
    private String jammulai2;
    private String jamselesai2;
    private String jammulai3;
    private String jamselesai3;
    private String ruang;
    
    public Film(String id, String name, String genre, String jammulai1, String jamselesai1, String jammulai2, String jamselesai2, String jammulai3, String jamselesai3, String ruang) {
        this.name = name;
        this.genre = genre;
        this.jammulai1 = jammulai1;
        this.jamselesai1 = jamselesai1;
        this.jammulai2 = jammulai2;
        this.jamselesai2 = jamselesai2;
        this.jammulai3 = jammulai3;
        this.jamselesai3 = jamselesai3;
        this.ruang = ruang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getJamMulai1() {
        return jammulai1;
    }
    public void setJamMulai1(String jammulai1) {
        this.jammulai1 = jammulai1;
    }
    
    public String getJamSelesai1() {
        return jamselesai1;
    }
    public void setJamSelesai1(String jamselesai1) {
        this.jamselesai1 = jamselesai1;
    }
    
    public String getJamMulai2() {
        return jammulai2;
    }
    public void setJamMulai2(String jammulai2) {
        this.jammulai2 = jammulai2;
    }
    
    public String getJamSelesai2() {
        return jamselesai2;
    }
    public void setJamSelesai2(String jamselesai2) {
        this.jamselesai2 = jamselesai2;
    }
    
    public String getJamMulai3() {
        return jammulai3;
    }
    public void setJamMulai3(String jammulai3) {
        this.jammulai3 = jammulai3;
    }
    
    public String getJamSelesai3() {
        return jamselesai3;
    }
    public void setJamSelesai3(String jamselesai3) {
        this.jamselesai3 = jamselesai3;
    }

    public String getRuang() {
        return ruang;
    }
    public void setRuang(String ruang) {
        this.ruang = ruang;
    }
    @Override
    public String toString() {
        return this.name;
    }    
}

