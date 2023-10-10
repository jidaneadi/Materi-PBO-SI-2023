/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert3_1;

/**
 *
 * @author Jidanear
 */
public class Pert3_1 {

    public static void main(String[] args) {
        int i;
        for(i=0;i<=9;i++){
            System.out.println("Variabel i = " + i);
        }
        
        int j= 10;
        System.out.println("Pengecekan dengan while");
        while(j>=2){
            System.out.printf("Angka %s \t", j);
            j--;
        }
        
        int k = 10;
        
        System.out.println("");
        System.out.println("Pengecekan dengan do while");
        do{
            System.out.printf("Angka %s", k);
            k--;
        }while(k>=2);
            
    }
}
