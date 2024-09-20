/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.dao;

import id.yogdev.bioskop.model.Film;
import java.util.List;

/**
 *
 * @author Asus X450J
 */
public interface FilmDAO {
    
    public boolean insert(Film f);
    
    public boolean update(Film f);
    
    public boolean delete(Film f);
    
    public List<Film> getAllFilm();
    
    public Film getByID(String id);
    
    public List<Film> getByName(String name);
    
}
