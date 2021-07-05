/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author andbayu
 */
public class Kalkulator implements Operasi{
    private double bil1, bil2;
    
    public double getBil1() {
        return bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }
    
    

    public Kalkulator() {
    }
    
    Kalkulator(double bil1, double bil2) 
    {
        this.setBil1(bil1);
        this.setBil2(bil2);
    }

    @Override
    public void penjumlahan() {
        System.out.println(bil1+bil2);
    }

    @Override
    public double pengurangan() {
       return bil1-bil2;
    }

    @Override
    public double perkalian() {
        return bil1 * bil2;
    }

    @Override
    public double pembagian() {
        return bil1 / bil2;
    }
    
}
