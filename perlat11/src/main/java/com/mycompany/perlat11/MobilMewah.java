package com.mycompany.perlat11;

public class MobilMewah extends Mobil implements KendaraanBermotor{
    double pajakBarangMewah= 200.00;
    private String asalNegara;

    public MobilMewah(String asalNegara) {
        super("Merah", asalNegara, 500, 800000.00);
        this.asalNegara = asalNegara;
    }
    
    public MobilMewah(double harga,String merk){
        super("Merah", merk, 500, harga);
        this.asalNegara = "Italia";
    }
}