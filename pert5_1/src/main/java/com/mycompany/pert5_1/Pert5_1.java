/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert5_1;

import java.util.Scanner;

/**
 *
 * @author Jidanear
 */
public class Pert5_1 {

    public static void main(String[] args) {
        Hewan h = new Hewan();
        Scanner i = new Scanner(System.in);
        
        System.out.println(h.getHewan());
        
        //Penerapan Getter
        System.out.println("Masukkan nama hewa = " );
        String newHewan = i.nextLine();
        
        h.setHewan(newHewan);
        
        System.out.println("Nama hewan baru = " + h.getHewan());
    }
}
