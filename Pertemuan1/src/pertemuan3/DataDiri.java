/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
/**
 *
 * @author andbayu
 */
public class DataDiri {
    public static void main(String[] args) {
        // instance of class scanner
        Scanner scan = new Scanner(System.in);
        String nama; 
        double tinggi;
        int umur;

        System.out.print("Nama  : "); nama = scan.nextLine();
        System.out.print("Umur  : "); umur = scan.nextInt();
        System.out.print("Tinggi: "); tinggi = scan.nextDouble();

        System.out.println("Nama " + nama);
        System.out.println("umur " + umur);
        System.out.println("tinggi " + tinggi);

    }
}
