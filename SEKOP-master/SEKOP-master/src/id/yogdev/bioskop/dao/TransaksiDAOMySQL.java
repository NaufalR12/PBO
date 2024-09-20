/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.dao;

import id.yogdev.bioskop.database.KoneksiDatabase;
import id.yogdev.bioskop.model.Transaksi;
import id.yogdev.bioskop.model.Film;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asus X450J
 */
public class TransaksiDAOMySQL implements TransaksiDAO{
    
    @Override
    public boolean insert(Transaksi t) {
         String sql = "INSERT INTO transaksi values (null, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = KoneksiDatabase.getConnection().prepareStatement(sql);
            
            
            statement.setString(1, t.getShow());
            statement.setString(2, t.getFilm().getName());
            statement.setString(3, t.getBarisan());
            statement.setString(4, t.getKelas());
            statement.setString(5, t.getKursi());
            statement.setString(6, t.getJumlah());
            statement.setInt(7, t.getHarga());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        }
        catch (Exception x) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, x);
        }
        return false;
        
    }

    @Override
    public boolean update(Transaksi t) {
       return true;
    }

    @Override
    public boolean delete(Transaksi t) {
        return true;
    }

    @Override
    public List<Transaksi> getAllTransaksi() {
        List<Transaksi> transaksi = new ArrayList<Transaksi>();
        String sql = "Select * from transaksi";
        try {
            if (KoneksiDatabase.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = KoneksiDatabase.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Transaksi t = new Transaksi(
                         
                        rs.getString(1),
                        new Film(rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2), rs.getString(2)),
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)
                    );
                    transaksi.add(t);     
                }
                statement.close();
            }
        } catch (Exception x) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, x);
        }
        return transaksi;
    }

    @Override
    public List<Transaksi> getByName(String name) {
        return null;
    }

    @Override
    public Transaksi getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

}
