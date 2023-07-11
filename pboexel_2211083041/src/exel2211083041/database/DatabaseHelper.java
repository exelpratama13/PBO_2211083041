/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exel2211083041.database;

import exel2211083041.model.Anggota;
import exel2211083041.model.Buku;
import exel2211083041.dao.BukuDaoImpl;
import exel2211083041.dao.AnggotaDaoImpl;
import exel2211083041.dao.AnggotaDao;
import exel2211083041.dao.BukuDao;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author exel
 */
public class DatabaseHelper {
        private static Connection connection;
        
        public static Connection getConnection() throws SQLException{
            if(connection == null){
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setURL("jdbc:mysql://localhost/pbo_exel");
                dataSource.setUser("root");
                dataSource.setPassword("");
                
                connection = dataSource.getConnection();
            }
              return connection;
        }
        
        public static void main(String[] args) {
         try{  
                connection = DatabaseHelper.getConnection();
                Anggota anggota = new Anggota();
                anggota.setNobp("2211082008");
                anggota.setNama("Farhan Kebab");
                anggota.setAlamat("Padang");
                anggota.setJenisKelamin("L");
                AnggotaDao dao = new AnggotaDaoImpl(connection);
                dao.insert(anggota);
                JOptionPane.showMessageDialog(null, "Entri Ok");
                
                Buku buku = new Buku();
                buku.setKodeBuku("2210");
                buku.setJudulBuku("Udin yang petot");
                buku.setPengarang("Ajo");
                buku.setPenerbit("Suka-suka");
                BukuDao dao2 = new BukuDaoImpl(connection);
                dao2.insert(buku);
                 JOptionPane.showMessageDialog(null, "Entri Ok");
        
          } catch(SQLException ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
              Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE,null,ex);
          }
    }
}
