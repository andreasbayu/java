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
public class Persegi extends BangunDatar{
    private float sisi;

    Persegi(float sisi) {
        this.sisi = sisi;
        // mengganti nama default bangun datar
        nama = "Persegi";
        luas = hitungLuas();
        keliling = hitungKeliling();
    }

    private float hitungLuas() {
        return sisi * sisi;
    }

    private float hitungKeliling() {
        return 4 * sisi;
    }

    
}