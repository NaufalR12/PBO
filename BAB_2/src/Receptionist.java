/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Receptionist extends Karyawan {
     Receptionist() {
         gaji += 1000000;
         setbonus(300000);
     }
     
     void naikgaji() {
         gaji += 1000000;
     }
}
