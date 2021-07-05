/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembelian5200411559;

/**
 *
 * @author andbayu
 */
public class Type50 extends Rumah{
    Type50(double hargaRumah) {
        // mengakses contructor parent class
        super(hargaRumah);
        hitungKPR();
    }

    private void hitungKPR() {
        biayaKPR = 0.07 * hargaRumah;
        pajakBeli = (0.07 * hargaRumah) - 5000000;
        biayaNotaris = 5000000;
        bayar = hargaRumah + biayaKPR + pajakBeli + biayaNotaris;
    }
}
