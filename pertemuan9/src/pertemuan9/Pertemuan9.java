/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andbayu
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Kalkulator k = new Kalkulator();
        
        System.out.println("Bil1 : ");
        double b1 = Double.parseDouble(br.readLine());
        System.out.println("Bil2 : ");
        double b2 = Double.parseDouble(br.readLine());
        
        k = new Kalkulator(b1, b2);
        System.out.println("");
        
        System.out.println("Hasil Jumlah");
        k.penjumlahan();
        
        System.out.println("Hasil Pengurangan " + k.pengurangan());
        System.out.println("Hasil Pembagian " + k.pembagian());
        System.out.println("Hasil Perkalian " + k.perkalian());
        
    }
    
}
