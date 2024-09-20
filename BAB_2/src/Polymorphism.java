/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Polymorphism {
    
    public static void main (String[] args){
        Karyawan K[] = new Karyawan[3];
        K[0] = new Karyawan();
        K[1] = new Receptionist();
        K[2] = new Manager();
        for (int i = 0; i < 3; i++) {
            System.out.println("Gaji karyawan " + i + " adalah " + K[i].gettotalgaji());
        }
        for (int i = 0; i < 3; i++) {
            K[i].naikgaji();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Gaji karyawan " + i + " sekarang adalah " + K[i].gettotalgaji());
        }
        
    }
    
}
