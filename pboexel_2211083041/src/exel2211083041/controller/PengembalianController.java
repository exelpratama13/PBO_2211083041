/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exel2211083041.controller;
import exel2211083041.view.FormPengembalian;
import exel2211083041.view.FormPeminjaman;
import exel2211083041.model.Peminjaman;
import exel2211083041.model.Pengembalian;
import exel2211083041.model.Anggota;
import exel2211083041.model.Buku;
import exel2211083041.dao.BukuDaoImpl;
import exel2211083041.dao.AnggotaDaoImpl;
import exel2211083041.dao.PeminjamanDaoImpl;
import exel2211083041.dao.PeminjamanDao;
import exel2211083041.dao.AnggotaDao;
import exel2211083041.dao.BukuDao;
import exel2211083041.database.DatabaseHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author exel
 */
public class PengembalianController {
   FormPengembalian formPengembalian;
   FormPeminjaman formPeminjaman;
   Pengembalian pengembalian;
   Peminjaman peminjaman;
   PeminjamanDao peminjamanDao;
   AnggotaDao anggotaDao;
   BukuDao bukuDao;
   
  public PengembalianController(FormPengembalian formPengembalian){
       try {
           this.formPengembalian = formPengembalian;
           peminjamanDao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
           anggotaDao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
           bukuDao = new BukuDaoImpl(DatabaseHelper.getConnection());
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
  
  public void tampilTabelPeminjaman() {
    try {
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman p : list) {
            Anggota anggota = anggotaDao.getAnggota(p.getNobp());
            Buku buku = bukuDao.getBuku(p.getKodeBuku());
            Object[] row = {
                p.getNobp(),
                anggota.getNama(),
                p.getKodeBuku(),
                buku.getJudulBuku(),
                p.getTglPinjam(),
                p.getTglKembali()
            };
            tabelModel.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 
