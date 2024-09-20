/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.controller;

import id.yogdev.bioskop.dao.TransaksiDAO;
import id.yogdev.bioskop.dao.TransaksiDAOMySQL;
import id.yogdev.bioskop.model.CrudState;
import id.yogdev.bioskop.model.Transaksi;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Asus X450J
 */
public class TransaksiController extends Observable{
    private TransaksiDAO dao = new TransaksiDAOMySQL();
    private CrudState crudState;
    
    public void setDAO(TransaksiDAO t){
        dao = t;
    }
    
    public void manipulate(Transaksi t, CrudState c){
        boolean result = false;
        this.crudState = c;
        
        switch (c){
            case INSERT:
                result = dao.insert(t);
                break;
            case UPDATE:
                result = dao.update(t);
                break;
            case DELETE:
                result = dao.delete(t);
                break;
        }
        
        setChanged();
        if (result){
            notifyObservers(t);
        }else{
            notifyObservers();
        }
    }
    
    public CrudState getCrudState(){
        return crudState;
    }
    
    public List<Transaksi> getAllTransaksi() {
        return dao.getAllTransaksi();
    }
    
}
