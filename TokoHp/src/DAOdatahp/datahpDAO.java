/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdatahp;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.datahpimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LENOVO
 */
public class datahpDAO implements datahpimplement {
     Connection connection;
     
     final String select = "SELECT * FROM datahp";
     final String insert = "INSERT INTO datahp (merk, brand, chip) VALUES (?, ?, ?);";
     final String update = "update datahp set merk=?, brand=?, chip=? where id=? ";
     final String delete = "delete from datahp where id=?";
     public datahpDAO() {
         connection = connector.connection();
     }

    @Override
    public void insert(datahp p) {
        
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,p.getMerk());
            statement.setString(2,p.getBrand());
            statement.setString(3,p.getChip());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()) {
                p.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(datahp p) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1,p.getMerk());
            statement.setString(2,p.getBrand());
            statement.setString(3,p.getChip());
            statement.setInt(4,p.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1,id);
        
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try{
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<datahp> getAll() {
        List<datahp> dp = null;
        try{
            dp = new ArrayList<datahp>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                datahp hp = new datahp();
                hp.setId(rs.getInt("id"));
                hp.setMerk(rs.getString("merk"));
                hp.setBrand(rs.getString("brand"));
                hp.setChip(rs.getString("chip"));
                dp.add(hp);
                
            }
        }catch(SQLException ex){
            Logger.getLogger(datahpDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dp;
    }
}
