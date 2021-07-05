/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan9;

import java.util.Scanner;


/**
 *
 * @author andbayu
 */
public class Main {

    static Scanner scanner  = new Scanner(System.in);
    static String garis     = "======================================================";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            menu(args);
        } while(true); 
    }

    public static void menu(String[] args) {
        String menu =   Color.green+
                        garis+
                        "\n\t\tKasir Kantin\n"+
                        garis+
                        Color.end+
                        Color.cyan+"\n"+
                        "[1] Pembeli \n" +
                        "[2] Pelanggan Tetap\n"+
                        Color.end+
                        Color.green+
                        garis+
                        Color.end;
                        
        System.out.println(menu);
        System.out.print("[ Masukkan Pilihan > ");
        String intput = scanner.next();

        switch (intput) {
            case "1":
                pembeli();
                kembali(args);
                break;
            case "2":
                pelanggan();
                kembali(args);
                break;
            default:
                System.out.println(Color.red+"\n\n[!] Input Tidak Dikenal\n"+Color.end);
                break;
        }    
    }

    public static void pembeli() {
        System.out.print("[ Masukkan Jumlah Barang > ");
        int jmlBarang = scanner.nextInt();
        
        String namaBarang[] = new String[jmlBarang];
        int hargaBarang[] = new int[jmlBarang];
        int jumlahBeli[] = new int[jmlBarang];

        for (int i = 0; i < jmlBarang; i++) {
            System.out.println("");

            System.out.print("[ Masukkan Nama Barang   > ");
            String nama = scanner.nextLine(); nama += scanner.nextLine();
            System.out.print("[ Masukkan Harga Barang  > ");
            int harga = scanner.nextInt();
            System.out.print("[ Masukkan Jumlah Barang > ");
            int jmlBeli = scanner.nextInt();

            namaBarang[i] = nama;
            hargaBarang[i] = harga;
            jumlahBeli[i] = jmlBeli;
        }       

        System.out.println(garis+"\n\t\t\tKatin Kita\n"+garis);
        System.out.println("Nama Barang\t\t Harga Barang\t\tJumlah\n"+garis);
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.format("%s%s %,18d %15d %s%n",Color.cyan, namaBarang[i], hargaBarang[i], jumlahBeli[i], Color.end);
        }
        Pembeli pembeli = new Pembeli();
        pembeli.hitungTotal(hargaBarang, jumlahBeli);

        System.out.println(garis+Color.green);
        System.out.println("Total Item \t: "+pembeli.getTotalItem());
        System.out.printf("Total Harga \t: Rp. %,d %n", pembeli.getTotalHarga());
        System.out.print("Tunai\t\t: Rp. ");
        int tunai = scanner.nextInt();
        System.out.printf("Kembalian\t: Rp. %,d %n", (tunai - pembeli.getTotalHarga()));
        System.out.println(Color.end+garis);

    }

    public static void pelanggan() {
        System.out.print("[ Masukkan Jumlah Barang > ");
        int jmlBarang = scanner.nextInt();
        
        String namaBarang[] = new String[jmlBarang];
        int hargaBarang[] = new int[jmlBarang];
        int jumlahBeli[] = new int[jmlBarang];

        for (int i = 0; i < jmlBarang; i++) {
            System.out.println("");

            System.out.print("[ Masukkan Nama Barang   > ");
            String nama = scanner.nextLine(); nama += scanner.nextLine();
            System.out.print("[ Masukkan Harga Barang  > ");
            int harga = scanner.nextInt();
            System.out.print("[ Masukkan Jumlah Barang > ");
            int jmlBeli = scanner.nextInt();

            namaBarang[i] = nama;
            hargaBarang[i] = harga;
            jumlahBeli[i] = jmlBeli;
        }       

        System.out.println(garis+"\n\t\t\tKatin Kita\n"+garis);
        System.out.println("Nama Barang\t\t Harga Barang\t\tJumlah\n"+garis);
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.format("%s%s %,18d %15d %s%n",Color.cyan, namaBarang[i], hargaBarang[i], jumlahBeli[i], Color.end);
        }
        System.out.println(garis+Color.green);
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.hitungTotal(hargaBarang, jumlahBeli);
        
        System.out.println("Total Item \t: "+pelanggan.getTotalItem());
        System.out.printf("Total Harga \t: Rp. %,d %n", pelanggan.getTotalHarga());
        System.out.printf("Diskon\t\t: Rp. %,d %n", pelanggan.getDiskon());
        System.out.printf("Total Bayar \t: Rp. %,d %n", (pelanggan.getTotalHarga() - pelanggan.getDiskon()));
        System.out.print("Tunai\t\t: Rp. ");
        int tunai = scanner.nextInt();
        System.out.printf("Kembalian\t: Rp. %,d %n", (tunai - (pelanggan.getTotalHarga() - pelanggan.getDiskon())));
        System.out.println(Color.end+garis);
    }

    public static void kembali(String[] args) {
        System.out.print("\n[*] kembali ? [y/T] > ");
        String kembali = scanner.next();
        if (kembali.equalsIgnoreCase("y")) {
            main(args);
        } else {
            System.exit(0);
        }
    }
}

class Color{
    // ANSI escape code
    static final String red       = "\u001b[31;1m";
    static final String green     = "\u001b[32;1m";
    static final String cyan      = "\u001b[36;1m";
    static final String end       = "\u001B[0m";
}
