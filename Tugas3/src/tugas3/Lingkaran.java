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
public class Lingkaran extends BangunDatar {
    private double PHI = Math.PI; 
    private double diameter;
    private double jariJari;

    Lingkaran(double diameter,double jariJari){
        this.diameter = diameter;
        this.jariJari = jariJari;
        nama = "Lingkaran";
        luas =  hitungLuas();
        keliling = hitungKeliling();
    }

    private double hitungLuas() {
        return PHI * diameter * jariJari;
    }

    private double hitungKeliling() {
        return PHI * diameter;
    }

}
