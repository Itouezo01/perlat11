package com.mycompany.perlat11;

public class Mobil implements KendaraanBermotor{
    private String  warna;
    private int kecepatan = 200;
    private String merk;
    private Double harga = 400000.00;

    public Mobil(){
        System.out.println("Ini adalah Konstruktor 1");
        this.harga=300000.00;
        this.merk="Toyota Innova";
        this.kecepatan=150;
        this.warna = "Merah";
    }

    public Mobil(String warna, String merk,int kecepatan, Double harga) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.merk = merk;
        this.harga = harga;
    }    

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }
    
    public  void getInfo(){
        System.out.println("Merek :"+this.merk);
        System.out.println("Harga :" +getHarga());
        System.out.println("Kecepatan Maksimal"+this.kecepatan);
        System.out.println("Warna"+this.warna);
    }

    @Override
    public void gasPol() {
        System.out.println("Ngegas co");
    }

    @Override
    public void remBlong() {
        System.out.println("Mandek");    
    }
}