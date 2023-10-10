/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert3;

import java.util.Scanner;
/**
 *
 * @author Jidanear
 */
public class Pert3 {

    public static void main(String[] args) {
        
       int menu;//Variabel pemilihan menu
       int angka;//Variabel pengecekan angka genap/ganjil
       
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Aplikasi pengecekan angka");
        System.out.println("1. Pengecekan angka genap");
        System.out.println("2. Pengecekan angka ganjil");
        System.out.print("Pilih menu = ");
        menu = s.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Masukkan angka genap");
                angka = s.nextInt();
                if(angka%2==0){
                    System.out.println("True");
                }else{
                    System.out.println("false");
                }
                break;
            case 2:
                System.out.println("Masukkan angka ganjil");
                angka = s.nextInt();
                if(angka%2==1){
                    System.out.println("True");
                }else{
                    System.out.println("false");
                }
        }
    }
}
