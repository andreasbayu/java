/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCuy;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author archlinux
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        boolean kondisi = true;
//        do akan tetap diajalakan meskipun kondisi = false
//        boolean kondisi = false;
        do {
            System.out.print("masukkan Nama : ");
            String nama = input.next();
            list.add(nama);
            System.out.print("Lagi ? [y/T]\n~> ");
            String lagi = input.next();
//            kondisi = lagi.equalsIgnoreCase("y") ? true : false;
            kondisi = lagi.equalsIgnoreCase("y");
        }while(kondisi);
        System.out.println("Cetak Nama");
        list.forEach(nama -> {System.out.println("Nama : "+nama);});
    }
}
