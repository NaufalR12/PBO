package DAOdataparkir;

import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.dataparkirimplement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class dataparkirDAO implements dataparkirimplement {
    Connection connection;
     
    final String select = "SELECT * FROM data_parkir";
    final String insert = "INSERT INTO data_parkir (nama, jenis, plat, merk, durasi, total) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE data_parkir SET nama=?,jenis=? merk=?, durasi=?, total=? WHERE plat=?";
    final String delete = "DELETE FROM data_parkir WHERE plat=?";
    
    public dataparkirDAO() {
        connection = connector.connection();
    }

    @Override
    public void insert(dataparkir p) {
        if (p.getNama().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (p.getJenis().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Plat harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (p.getPlat().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Plat harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (p.getMerk().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Merk harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
       
        
       
        
        int durasi = p.getDurasi();
        if (durasi < 0 ) {
            JOptionPane.showMessageDialog(null, "Durasi tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
    
    
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getJenis());
            statement.setString(3, p.getPlat());
            statement.setString(4, p.getMerk());
            statement.setInt(5, p.getDurasi());
            statement.setInt(6, p.hitungTotal());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(dataparkir p) {
        if (p.getNama().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Judul harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (p.getJenis().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jenis harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (p.getPlat().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Plat harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (p.getMerk().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Merk harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        
        int durasi = p.getDurasi();
        if (durasi < 0 ) {
            JOptionPane.showMessageDialog(null, "Durasi tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getJenis());
            statement.setString(3, p.getMerk());
            statement.setInt(4, p.getDurasi());
            statement.setInt(5, p.hitungTotal());
            statement.setString(6, p.getPlat());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal mengubah data!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            
            JOptionPane.showMessageDialog(null, "Gagal mengubah data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(String plat) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setString(1, plat);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public int count() {
    int count = 0;
    try {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT COUNT(*) AS count FROM data_parkir");
        if (rs.next()) {
            count = rs.getInt("count");
        }
    } catch (SQLException ex) {
        Logger.getLogger(dataparkirDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return count;
}

    
    @Override
    public List<dataparkir> getAll() {
        List<dataparkir> dp = null;
        try {
            dp = new ArrayList<dataparkir>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                dataparkir pr = new dataparkir();
                pr.setNama(rs.getString("nama"));
                pr.setJenis(rs.getString("jenis"));
                pr.setPlat(rs.getString("plat"));
                pr.setMerk(rs.getString("merk"));
                pr.setDurasi(rs.getInt("durasi"));
                pr.setTotal(rs.getInt("total"));
                dp.add(pr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataparkirDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
}
