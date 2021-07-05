/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author andbayu
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan    = new Scanner(System.in);
        String garis    = "===================================";
        String menu     = garis+"\n"+
                          "Pilih Bangun Datar\n"+
                          garis+"\n"+
                          "1. Persegi \n"+
                          "2. Belah Ketupat\n"+
                          "3. Lingkaran\n";
        System.out.println(menu);

        // TODO code application logic here
        System.out.print("Masukan Pilihan > ");
        int input = scan.nextInt();

        System.out.println(garis+"\na. Luas");
        System.out.println("b. Keliling\n"+garis);
        System.out.print("input ~> ");
        String pilih = scan.next();

        switch (input) {
            case 1:
                Persegi ps = new Persegi(20);
                ps.pilihHitung(pilih);
                break;
            case 2:
                BelahKetupat bk = new BelahKetupat(20, 20, 40);
                bk.pilihHitung(pilih);
                break;
            case 3:
                Lingkaran lk = new Lingkaran(14, 7);
                lk.pilihHitung(pilih);
            default:
                break;
        }

    }
    
}
