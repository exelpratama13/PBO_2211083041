/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pelanggan;
import model.PelangganDao;
import model.PelangganDaoImpl;
import view.FormPDAM;



public class TarifPdamController {
    private FormPDAM formPDAM;
    private Pelanggan pelanggan;
    private PelangganDao pelangganDao;
    
    public TarifPdamController(FormPDAM formPDAM) {
        this.formPDAM = formPDAM;
        pelangganDao = new PelangganDaoImpl();
    }
    
    public void bersihForm() {
        formPDAM.getTxtKodepelanggan().setText("");
        formPDAM.getTxtNama().setText("");
    }
    
    public void savePelanggan() {
        pelanggan = new Pelanggan();
        pelanggan.setKodepelanggan(formPDAM.getTxtKodepelanggan().getText());
        pelanggan.setNama(formPDAM.getTxtNama().getText());
        pelangganDao.save(pelanggan);
        JOptionPane.showMessageDialog(formPDAM, "Insert Ok");
    }
    
    public void tampil() {
        DefaultTableModel tabelModel =
        (DefaultTableModel) formPDAM.getTblTarif().getModel();
        tabelModel.setRowCount(0);
        List<Pelanggan> list = pelangganDao.getAllPelanggan();
        for (Pelanggan pelanggan1 : list) {
            Object row[] = {
            pelanggan1.getKodepelanggan(),
            pelanggan1.getNama(),
            };
            tabelModel.addRow(row);
        }
    }

}


