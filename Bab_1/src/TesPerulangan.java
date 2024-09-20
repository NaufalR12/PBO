/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class TesPerulangan {
  
 
    public static void main(String[] args) { 
        int i; 
        // for 
        System.out.println("Perulangan For...."); 
        for (i = 0; i < 10; i++) { 
            System.out.println("Perulangan ke : " + i); 
        } 
 
        // while 
        System.out.println("Perulangan While...."); 
        i = 0; 
        while (i < 10) { 
            System.out.println("Perulangan ke : " + i); 
            i++; 
        } 
 
 
        // Do-while 
        System.out.println("Perulangan Do-While...."); 
        i = 0; 
        do { 
            System.out.println("Perulangan ke : " + i); 
            i++; 
        } while (i < 10); 
    } 
} 

