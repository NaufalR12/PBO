/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.yogdev.bioskop.controller;

import id.yogdev.bioskop.dao.FilmDAO;
import id.yogdev.bioskop.dao.FilmDAOMySQL;
import id.yogdev.bioskop.model.CrudState;
import id.yogdev.bioskop.model.Film;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Asus X450J
 */
public class FilmController extends Observable{
    private FilmDAO dao = new FilmDAOMySQL();
    private CrudState crudState;
    
    public void setDAO(FilmDAO d){
        dao = d;
    }
    
    public void manipulate(Film f, CrudState c){
        boolean result = false;
        this.crudState = c;
        
        switch (c){
            case INSERT:
                result = dao.insert(f);
                break;
            case UPDATE:
                result = dao.update(f);
                break;
            case DELETE:
                result = dao.delete(f);
                break;
        }
        
        setChanged();
        if (result){
            notifyObservers(f);
        }else{
            notifyObservers();
        }
    }
    
    public CrudState getCrudState(){
        return crudState;
    }
    
    public List<Film> getAllFilm() {
        return dao.getAllFilm();
    }
}
