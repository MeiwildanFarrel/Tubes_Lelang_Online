/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelelangan;

import java.io.File;

/**
 *
 * @author ACER
 */
public class barang {
    protected int idBarang;
    protected String pelelang;
    protected String namaBarang;
    protected String hargaAwal;
    protected File gambar;
    protected String jenis;
    protected String deskripsiBarang;
    

    public barang(String pelelang,String namaBarang, String hargaAwal, String jenis,String deskripsiBarang) throws ValidasiInputException {
        if (pelelang.isEmpty()) {
            throw new ValidasiInputException("Inputkan nama pelelang");
        }
        if (namaBarang.isEmpty()) {
            throw new ValidasiInputException("Inputkan nama barang");
        }
        if (hargaAwal.isEmpty()) {
            throw new ValidasiInputException("inputkan harga awal");
        }
//        if (gambar == null) {
//            throw new ValidasiInputException("silahkan pilih gambar");
//        }
        if (jenis.isEmpty()) {
            throw new ValidasiInputException("pilih jenis barang");
        }
        if (deskripsiBarang.isEmpty()) {
            throw new ValidasiInputException("inputkan deskripsi barang");
        }
        
        this.pelelang = pelelang;
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
//        this.gambar = gambar;
        this.jenis = jenis;
        this.deskripsiBarang = deskripsiBarang;
        
    }
    // Getter dan Setter
  

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(String hargaAwal) {
        this.hargaAwal = hargaAwal;
    }

    public String getDeskripsiBarang() {
        return deskripsiBarang;
    }

    public void setDeskripsiBarang(String deskripsi) {
        this.deskripsiBarang = deskripsi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenisBarang) {
        this.jenis = jenisBarang;
    }

//    public File getGambar() {
//        return gambar;
//    }
//
//    public void setFileGambar(File fileGambar) {
//        this.gambar = fileGambar;
//    }

    void validate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
