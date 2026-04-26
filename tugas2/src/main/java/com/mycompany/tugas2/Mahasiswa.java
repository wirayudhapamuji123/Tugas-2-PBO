/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa() {
        nama = "Tidak diketahui";
        umur = 0;
    }

    public Mahasiswa(String n, int u) {
        nama = n;
        umur = u;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public int getUmur() {
        return umur;
    }
}
