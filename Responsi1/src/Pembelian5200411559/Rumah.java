
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembelian5200411559;
// Nama     : Yulianto Bayu Prasetyo
// NIM      : 5200411559
/**
 *
 * @author andbayu
 */
public class Rumah {
    protected double hargaRumah, biayaKPR, pajakBeli, biayaNotaris, bayar;

    Rumah(double hargaRumah) {
        this.hargaRumah = hargaRumah;
    }

    public void totalCash() {
        // casting to int
        int convertToInt = (int) hargaRumah;
        System.out.println("Total Biaya     : " + convertToInt);
    }

    public void totalKPR() {
                                               // Manual casting :)
        System.out.println("Biaya KPR       : "+(int) biayaKPR);
        System.out.println("Pajak Pembeli   : "+(int) pajakBeli);
        System.out.println("Biaya Notaris   : "+(int) biayaNotaris);
        System.out.println("Total Bayar     : "+(int) bayar);
    }
}