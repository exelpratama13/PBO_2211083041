/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exel2211083041.dao;
import exel2211083041.model.Peminjaman;
import java.sql.*;
import java.util.List;
/**
 *
 * @author exel
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp, String kodebuku, String tglPinjam) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
