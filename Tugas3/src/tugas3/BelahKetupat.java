/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
/**
 *
 * @author andbayu
 */
public class BelahKetupat extends BangunDatar {
    private double d1, d2;
    private double sisi;

    BelahKetupat(double d1, double d2, double sisi) {
        this.d1 = d1;
        this.d2 = d2;
        this.sisi = sisi;
        nama = "Belah Ketupat";
        luas = hitungLuas();
        keliling = hitungKeliling();
    }

    private double hitungLuas() {
        return 0.5 * d1 * d2;
    }

    private double hitungKeliling() {
        return 4 * sisi;
    }
}
