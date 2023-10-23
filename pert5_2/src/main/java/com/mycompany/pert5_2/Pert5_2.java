/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert5_2;

import java.util.Scanner;

/**
 *
 * @author Jidanear
 */
public class Pert5_2 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Mobil m = new Mobil();
        
        System.out.println("Masukkan nama =");
        String name_car = i.nextLine();
        System.out.println("Masukkan merk =");
        String new_merk = i.nextLine();
        System.out.println("Masukkan tahun dibuat =");
        String year = i.nextLine();
        
        m.setNama(name_car);
        m.setMerk(new_merk);
        m.setTahun(year);
        
        System.out.println("Nama mobil : " + m.getNama());
        System.out.println("Merk mobil : " + m.getMerk());
        System.out.println("Tahun pembuatan : "+m.getTahun());
    }
}
