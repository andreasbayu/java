/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCuy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author archlinux
 */
public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
//        while untuk perulangan yang tidak ditentukan 
        while(true){
            
            System.out.print("Masukkan Angka : ");
            int angka = input.nextInt();
            list.add(angka);
            System.out.print("Lagi ? [y/T]\n~> ");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase("y")){
                continue;
            }else if (lagi.equalsIgnoreCase("t")) {
                // untuk menghentikan perulangan
                break;
            }else {
                // untuk menghentikan program
                System.out.println("Error intput tidak dikenal");
                System.exit(0);
            }  
        }
        list.forEach(hasil -> { System.out.println("Hasil angka inputan "+hasil); });
    }
}
