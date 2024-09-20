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
public class Admin {
    private String tnama;
    private String tpas;
    
    public boolean status=false;
    
    public void settnama(String tnama){
        this.tnama = tnama;
    }
    
    public void settpas(String tpas){
        this.tpas = tpas;   
    }
   
    public void loginAdmin(String id, String pass){
        if(id.equals("yoga")&&pass.equals("yudha")){
            status=true;
        }
        else{
            System.out.print("Username dan password Anda salah");
        }
    }
    
}
