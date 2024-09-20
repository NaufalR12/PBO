/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class connector {
    private static Connection con;
    
    public static Connection connection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            
            data.setDatabaseName("dbparkir");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                JOptionPane.showMessageDialog(null, "Koneksi berhasil");
            }  catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Koneksi gagal: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return con;
    }
}
