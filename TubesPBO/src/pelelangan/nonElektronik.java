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
public class nonElektronik extends barang{

    public nonElektronik(String pelelang, String namaBarang, String hargaAwal,String deskripsiBarang) throws ValidasiInputException {
        super(pelelang, namaBarang, hargaAwal, "Elektronik",  deskripsiBarang);
    }

   
}
