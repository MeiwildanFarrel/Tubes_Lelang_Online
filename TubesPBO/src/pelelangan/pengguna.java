/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelelangan;

/**
 *
 * @author ACER
 */
public class pengguna {
    private int idPengguna;
    private String namaPengguna;

    public pengguna(int idPengguna, String namaPengguna) {
        this.idPengguna = idPengguna;
        this.namaPengguna = namaPengguna;
    }

    public String getNama() {
          return namaPengguna;
    }
}
