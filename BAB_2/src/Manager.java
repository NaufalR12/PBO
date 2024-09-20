/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class Manager extends Karyawan {
    
    Manager(){
        gaji += 2000000;
        setbonus(500000);
    }
    
    void naikgaji() {
        gaji += 3000000;
    }
}
