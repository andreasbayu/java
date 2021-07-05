/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author andbayu
 */
public class Handphone {
    private String merk, tipe, warna;
    private double harga;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setWarna(String color) {
        warna = color;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // getter
    public String getMerk() {
        return merk;
    }

    public String getTipe(){
        return tipe;
    }

    public String getWarna(){
        return warna;
    }

    public double getHarga() {
        return harga;
    }

    public double HargaDiskon() {
        double diskon = 0.1 * getHarga();
        double total = getHarga() - diskon;
        return total;
    }

    public void keterangan() {
        System.out.println("Harga setelah di diskon adalah : "+ HargaDiskon());
    }
}
