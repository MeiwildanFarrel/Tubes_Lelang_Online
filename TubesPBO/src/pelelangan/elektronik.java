/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelelangan;

/**
 *
 * @author ACER
 */
public class elektronik extends barang{
    public elektronik(int idBarang, String namaBarang, String jenis, String gambar, String deskripsiBarang, double hargaAwal) {
        super(idBarang, namaBarang, jenis, gambar, deskripsiBarang, hargaAwal);
    }

    @Override
    public double hitungNilaiJual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
