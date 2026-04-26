/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2;

/**
 *
 * @author USER
 */

    public class Tugas2 {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilData();

        System.out.println("------------------");

        Mahasiswa mhs2 = new Mahasiswa("Wira Yudha Pamuji", 20);
        mhs2.tampilData();

        System.out.println("Umur dari method return: " + mhs2.getUmur());
    }
}
    

