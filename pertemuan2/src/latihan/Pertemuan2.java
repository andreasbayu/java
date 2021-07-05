/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.io.*;

/**
 *
 * @author andbayu
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Handphone hp = new Handphone();

        System.out.print("Merk  : ");
        hp.setMerk(br.readLine());
        System.out.print("Tipe  : ");
        hp.setTipe(br.readLine());
        System.out.print("Warna : ");
        hp.setWarna(br.readLine());
        System.out.print("Harga : ");
        hp.setHarga(Double.parseDouble(br.readLine()));

        System.out.println("Merk  : "+ hp.getMerk());
        System.out.println("Tipe  : "+ hp.getTipe());
        System.out.println("Warna : "+ hp.getWarna());
        System.out.println("Harga : "+ hp.getHarga());
        System.out.println("Harga Diskon : "+ hp.HargaDiskon());
        hp.keterangan();


    }
    
}
