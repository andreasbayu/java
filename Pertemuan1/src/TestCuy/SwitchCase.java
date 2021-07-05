/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCuy;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author archlinux
 */
public class SwitchCase {
    // Global variable
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int InputPilihan;
        String menu = 
                "\t\t~~ Pilih Menu ~~~\n"
                + "1. Penjumlahan\n"
                + "2. Perkalian\n"
                + "3. Tombol HAPE Jadul\n"
                + "4. Keluar";
        System.out.println(menu);
        System.out.print("Masukkan Pilihan :\n~> ");
        InputPilihan = input.nextInt();
       
        switch(InputPilihan) {
            case 1:
                penjumlahan();
                break;
            case 2:
                perkalian();
                break;
            case 3:
                tombolHape();
                break;
            case 4:
                System.exit(0);
            defalut:
                System.out.println("Input Yang Anda Masukkan Tidak Dikenal");
        }
        System.out.print("Lagi ? [y/T]\n~> ");
        String ytaut = input.next();
        if (ytaut.equalsIgnoreCase("y")) {
            main(args);
        }
        
    }
    
    public static void penjumlahan(){
        int Hasil = 0;
        ArrayList<Integer> angka = new ArrayList<Integer>();
        System.out.print("Masuakan Jumalah Bilangan Yang Akan Ditambahkan : ");
        int InputNilai = input.nextInt();
        
        for (int i = 0; i < InputNilai; i++) {
            System.out.print("Masukkan Bilangan "+ (i+1) +" : ");
            int InputBilangan = input.nextInt();
            Hasil += InputBilangan;
            angka.add(InputBilangan);
        }
        
        System.out.print("Hasil penjumlahan Dari : ");
        // Lambda 
        angka.forEach( nilai -> { System.out.print(nilai + ", "); });
         System.out.println("adalah = " + Hasil);
    }
    public static void perkalian(){
        // hasil 1 karena jika diberi 0 hasil tetap 0
        int Hasil = 1;
        ArrayList<Integer> angka = new ArrayList<Integer>();
        System.out.print("Masukkan Jumlah Bilangan Yang Akan Dikalikan : ");
        int InputNilai = input.nextInt();
        
        for (int i = 0; i < InputNilai; i++) {
            System.out.print("Masukkan Bilangan "+ (i+1) +" : ");
            int InputBilangan = input.nextInt();
            Hasil *= InputBilangan;
            angka.add(InputBilangan);
        }
        
        System.out.print("Hasil Perkalian Dari : ");
        // Lambda 
        angka.forEach( nilai -> { System.out.print(nilai + ", "); });
        System.out.println("adalah = " + Hasil);
    }
    
   
    public static void tombolHape() {
        char[][] kibot = {
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'},
            {' '}
        };
        char[] key = {'2','3','4','5','6','7','8','9','0'};
        HashMap<Character, char[] > data = new HashMap<Character, char[]>();
        for (int i = 0 ; i < key.length; i++) {
            data.put(key[i], kibot[i]);
        }
        ArrayList<Character> resultKata = new ArrayList<Character>();

        System.out.println(
            "Example : 22 2 999 0 88 \n"
            +"Output : bay u"
        );
        System.out.print("Masukkan nomor : ");
        String InputString = input.nextLine();
        InputString+= input.nextLine();
        String[] Splitdulu = InputString.split(" ");
        char[] a;
        for ( int i = 0; i < Splitdulu.length; i++ ){
            a = data.get(Splitdulu[i].charAt(0));
            resultKata.add(a[Splitdulu[i].length() - 1]);
        }
        System.out.print("Hasil Kalimat/Kata  = ");
        resultKata.forEach(huruf -> { System.out.print(huruf); });
        System.out.println("");
    }
    
}
