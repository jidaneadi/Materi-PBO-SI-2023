/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.materi_lat3_4;

/**
 *
 * @author Jidanear
 */
class Handphone {
    private String merk, tipe, warna;
    private double harga;
    
    //Method Setter 
    public void setMerk(String mrk){
        this.merk = mrk;
    }
    public void setTipe(String tp){
        this.tipe = tp;
    }
    public void setWarna(String wrn){
        this.warna = wrn;
    }
    public void setHarga(double hrg){
        this.harga = hrg;
    }
    public String getTipe(){
        return tipe;
    }
    public String getWarna(){
        return warna;
    }
    public double getHarga(){
        return harga;
    }
    public String getMerk(){
        return merk;
    }
    
    public double Diskon(){
        double diskon = 0.1 * getHarga();
        double hrg_tot = getHarga() - diskon;
        
        return hrg_tot;
    }
}
