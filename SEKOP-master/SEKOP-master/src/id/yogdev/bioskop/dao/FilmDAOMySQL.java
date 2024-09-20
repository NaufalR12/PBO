/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.dao;

import id.yogdev.bioskop.database.KoneksiDatabase;
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
public class FilmDAOMySQL implements FilmDAO {
   
    @Override
    public boolean insert(Film f) {
        String sql = "INSERT INTO film values (null, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = KoneksiDatabase.getConnection().prepareStatement(sql);
            
            statement.setString(1, f.getName());
            statement.setString(2, f.getGenre());
            statement.setString(3, f.getJamMulai1());
            statement.setString(4, f.getJamSelesai1());
            statement.setString(5, f.getJamMulai2());
            statement.setString(6, f.getJamSelesai2());
            statement.setString(7, f.getJamMulai3());
            statement.setString(8, f.getJamSelesai3());
            statement.setString(9, f.getRuang());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Film f) {
        return true;
    }

    @Override
    public boolean delete(Film f) {
        return true;
    }

    @Override
    public List<Film> getAllFilm() {
        List<Film> films = new ArrayList<Film>();
        String sql = "Select * from film";
        try {
            if (KoneksiDatabase.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = KoneksiDatabase.getConnection().prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Film f = new Film(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10)
                    );
                    films.add(f);
                }
                statement.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
        return films;
    }

    @Override
    public List<Film> getByName(String name) {
        return null;
    }

    @Override
    public Film getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    

