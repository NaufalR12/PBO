/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOdatahp.datahpDAO;
import DAOImplement.datahpimplement;
import model.*;
import view.MainView;
/**
 *
 * @author LENOVO
 */
public class datahpcontroller {
    MainView frame;
    datahpimplement impldatahp;
    List<datahp> dp;
    
    public datahpcontroller(MainView frame) {
        this.frame = frame;
        impldatahp = new datahpDAO();
        dp = impldatahp.getAll();
    }
    
    public void isitabel(){
        dp = impldatahp.getAll();
        modeltabeldatahp mp = new modeltabeldatahp(dp);
        frame.getTabelDatahp().setModel(mp);
    }
    
    public void insert(){
        datahp dp = new datahp();
        dp.setMerk(frame.getJTxtmerk().getText());
        dp.setBrand(frame.getJTxtbrand().getText());
        dp.setChip(frame.getJTxtchip().getText());
        impldatahp.insert(dp);
    }
    
    public void update(){
        datahp dp = new datahp();
        dp.setMerk(frame.getJTxtmerk().getText());
        dp.setBrand(frame.getJTxtbrand().getText());
        dp.setChip(frame.getJTxtchip().getText());
        dp.setId(Integer.parseInt(frame.getJTxtid().getText()));
        impldatahp.update(dp);
    }
    
    public void delete(){
        int id = Integer.parseInt(frame.getJTxtid().getText());
        impldatahp.delete(id);
    }
}
