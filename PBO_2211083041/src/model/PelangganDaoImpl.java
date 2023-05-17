/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;

/**
 *
 * @author PC11
 */
public class PelangganDaoImpl implements PelangganDao {
       private List<Pelanggan> data = new ArrayList<>();
    
    public Pelanggan save(Pelanggan pelanggan) {
        data.add(pelanggan);
        return pelanggan;
    }
    
    public Pelanggan update(int index, Pelanggan pelanggan) {
        data.set(index, pelanggan);
        return pelanggan;
    }
    
    public void delete(int index) {
        data.remove(index);
    }
    
    public Pelanggan getPelanggan(int index) {
        return data.get(index);
    }
    
    public List<Pelanggan> getAllPelanggan () {
        return data;
    }
}


