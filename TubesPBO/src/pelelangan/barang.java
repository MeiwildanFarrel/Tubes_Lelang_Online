/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelelangan;

/**
 *
 * @author ACER
 */
abstract class barang {
    protected int idBarang;
    protected String namaBarang;
    protected String gambar;
    protected String jenis;
    protected String deskripsiBarang;
    protected double hargaAwal;

    public barang(int idBarang, String namaBarang, String jenis, String gambar, String deskripsiBarang, double hargaAwal) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.gambar = gambar;
        this.jenis = jenis;
        this.deskripsiBarang = deskripsiBarang;
        this.hargaAwal = hargaAwal;
    }

    public abstract double hitungNilaiJual();
}
