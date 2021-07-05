/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembelian5200411559;

import java.util.Scanner;

/**
 *
 * @author andbayu
 */
public class Main {
    /**
     * @param args the command line arguments
     */

    static Scanner scan = new Scanner(System.in);
    static String garis = "============================================";
    public static void main(String[] args) {
        // TODO code application logic here
        
        String menu =  garis
                        +"\nSelamat Datang diprogram responsi1\n"
                        +garis+"\n"
                        +"1. Tipe Rumah 45\n"
                        +"2. Tipe Rumah 50\n"
                        +garis+"\n"
                        +"~>  ";
        System.out.print(menu);
        String pilihMenu = scan.next();
        switch (pilihMenu) {
            case "1":
                tipe45(args);
                break;
            case "2":
                tipe50(args);
                break;
            default:
                System.out.println("[!] Input tidak dikenal");
                break;
        }

    }

    public static void tipe45(String[] args) {
        System.out.println(garis);
        System.out.println("Rumah Tipe 45");
        System.out.println(garis);
        System.out.println("1. CASH ");
        System.out.println("2. KPR ");
        System.out.println("3. Kembali");
        System.out.println(garis);
        System.out.print("Pilih : ");
        String pilih = scan.next(); 
        switch (pilih) {
            case "1":
                System.out.println(garis);
                System.out.print("Masukan Harga Rumah : ");
                double hargaRumahc = scan.nextDouble();
                Type45 empatLimac = new Type45(hargaRumahc); 
                empatLimac.totalCash();
                kembaliKemenu(args);
                break;
            case "2":
                System.out.println(garis);
                System.out.print("Masukan Harga Rumah : ");
                double hargaRumahk = scan.nextDouble();
                Type45 empatLimak = new Type45(hargaRumahk); 
                empatLimak.totalKPR();
                kembaliKemenu(args);
                break;
            case "3":
                main(args);
            default:
                tipe45(args);
                break;
        }
    }

    public static void tipe50(String[] args) {
        System.out.println(garis);
        System.out.println("Rumah Tipe 50");
        System.out.println(garis);
        System.out.println("1. CASH ");
        System.out.println("2. KPR ");
        System.out.println("3. Kembali");
        System.out.println(garis);
        System.out.print("Pilih : ");
        String pilih = scan.next(); 
        switch (pilih) {
            case "1":
                System.out.println(garis);
                System.out.print("Masukan Harga Rumah : ");
                double hargaRumahc = scan.nextDouble(); 
                Type50 limaPuluhc = new Type50(hargaRumahc);
                limaPuluhc.totalCash();
                kembaliKemenu(args);
                break;
            case "2":
                System.out.println(garis);
                System.out.print("Masukan Harga Rumah : ");
                double hargaRumahk = scan.nextDouble(); 
                Type50 limaPuluhk = new Type50(hargaRumahk);
                limaPuluhk.totalKPR();
                kembaliKemenu(args);
                break;
            case "3":
                main(args);
            default:
                tipe50(args);
                break;
        }
    }

    public static void kembaliKemenu(String[] args) {
        System.out.print("Kembali ke menu ? [y/T] > ");
        String kembali = scan.next();
        if (kembali.equalsIgnoreCase("y")) {
            main(args);
        } else if (kembali.equalsIgnoreCase("t")) {
            System.exit(0);
        } else {
            kembaliKemenu(args);
        }
    }

}