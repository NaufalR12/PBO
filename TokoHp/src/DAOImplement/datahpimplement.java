/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplement;
import java.util.List;
import model.*;
/**
 *
 * @author LENOVO
 */
public interface datahpimplement {
    public void insert(datahp p);
    public void update(datahp p);
    public void delete(int id);
    public List<datahp>  getAll();
}
