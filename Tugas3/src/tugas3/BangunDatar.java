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
public class BangunDatar {
    protected double luas;
    protected double keliling;
    protected String nama = "Datar";

    void cetakLuas() {
        System.out.println("Luas Bangun " + nama + " Adalah = " + luas);
    }

    void cetakKeliling() {
        System.out.println("Keliling Bangun "+ nama +" Adalah = " + keliling);
    }

    void pilihHitung(String input) {
        if (input.equalsIgnoreCase("a")) {
            cetakLuas();
        } else if(input.equalsIgnoreCase("b")) {
            cetakKeliling();
        } else {
            System.out.println("Input Salah !!! ");
        }
    }
}
