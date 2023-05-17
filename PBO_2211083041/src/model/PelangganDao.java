/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;
import java.util.List;

/**
 *
 * @author PC11
 */
public interface PelangganDao {
    Pelanggan save(Pelanggan pelanggan);
    Pelanggan update(int index, Pelanggan pelanggan);
    void delete (int index);
    Pelanggan getPelanggan (int index);
    List<Pelanggan> getAllPelanggan();
}


