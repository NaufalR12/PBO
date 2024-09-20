/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.dao;

import id.yogdev.bioskop.model.Transaksi;
import java.util.List;

/**
 *
 * @author Asus X450J
 */
public interface TransaksiDAO {
    public boolean insert(Transaksi t);
    
    public boolean update(Transaksi t);
    
    public boolean delete(Transaksi t);
    
    public List<Transaksi> getAllTransaksi();
    
    public Transaksi getByID(String id);
    
    public List<Transaksi> getByName(String name);
    
}
