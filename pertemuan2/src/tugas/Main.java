/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andbayu
 */

public class Main {
    
    public final String GARIS = "=========================================";
    // Generic Arraylist
    private ArrayList<DataClass> data = new ArrayList<>();

    Main(){
        // memanggil addData kedalam konstruktor
        addData();
    }

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        Main m = new Main();
        m.menu();
    }

    public void menu() throws IOException{
        String menu   = GARIS+"\n Pilih Menu \n"+GARIS+"\n"+
                        "1. Tampilkan Barang \n"+
                        "2. Tambah Barang\n"+
                        "3. Edit Barang\n"+
                        "4. Hapus Barang\n"+GARIS;
        System.out.print(menu+"\nMasukan Pilihan :\n [~> ] ");
        String input = scanner.next();
        switch (input) {
            case "1":
                tampilBarang();       
                break;
            case "2":
                tambahBarang();
                break;
            case "3":
                editBarang();
                break;
            case "4":
                hapusBarang();
                break;
            default:
                System.out.println("input tidak dikenal");
                break;
        }
        do {
            System.out.print("Kembali ? [y/t] > "); String lagi = scanner.next();
            if (lagi.equalsIgnoreCase("y")) {  
                menu();
            } else if(lagi.equalsIgnoreCase("t")) { 
                System.exit(0);; 
            } else { 
                System.out.println("Input mu bro ra genah"); 
            }
        }
        while(true);
    }

    public void tampilBarang() {
        System.out.println(GARIS+"\nNo |Nama          | Stok    | Harga \n"+GARIS);
        List<Integer> stok = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            System.out.println(i+1 +". "+ data.get(i).getNama()+" | "+data.get(i).getStok()+"|   "+ data.get(i).getHarga());
            stok.add(data.get(i).getStok());
        };
        System.out.println(GARIS+"\nTotal Stok : "+ hitungStok(stok));
    }

    public int hitungStok(List<Integer> stok){
        int total=0;
        for (int i : stok) {
            total += i;
        }
        return total;
    }

    public void tambahBarang() throws IOException {
        String nama = "";
        System.out.println(GARIS+"\n\t\t Tambah Barang\n"+GARIS);
        System.out.print("Masukkan Nama Barang  : "); nama = scanner.nextLine(); nama += scanner.nextLine();
        System.out.print("Masukkan Stok Barang  : "); int stok = scanner.nextInt();
        System.out.print("Masukkan Harga Barang : "); int harga = scanner.nextInt();
        data.add(new DataClass(nama, stok, harga));
        tampilBarang();
    }

    public void editBarang() throws IOException{
        System.out.println(GARIS+"\n\t\t Edit Barang");
        String nama = " ";
        tampilBarang();
        System.out.println(" ~> masukan angka 00 untuk jika tidak merubah data <~ ");
        System.out.print("Masukkan No Barang    : "); int index = scanner.nextInt();
        System.out.print("Masukkan Nama Barang  : "); nama = scanner.nextLine(); nama += scanner.nextLine(); 
        System.out.print("Masukkan Stok Barang  : "); int stok = scanner.nextInt(); 
        System.out.print("Masukkan Harga Barang : "); int harga = scanner.nextInt();
        String cekNama = (nama.equals("00")) ? data.get(index - 1).getNama() : nama;
        int cekStok = (stok == 00) ? data.get(index - 1).getStok() : stok;
        int cekHarga = (harga == 00) ? data.get(index - 1).getHarga() : harga;
        data.set(index-1, new DataClass(cekNama, cekStok, cekHarga));
        tampilBarang();
    }

    public void hapusBarang() throws IOException{
        System.out.println(GARIS+"\n\t\t Hapus Barang");
        tampilBarang();
        System.out.print("Masukkan No Barang  : "); int index = scanner.nextInt();
        data.remove(index - 1);
        tampilBarang();
    }

    public void addData(){
        // untuk memasukan dummy data kedalam arrylist
        String nama[] = {"Sabun Mandi", "Sabun Cuci piring", "Sabun Cuci baju"};
        int stok[] = {20,30,40};
        int harga[] = {10000, 20000, 1000};
        for (int i = 0; i < nama.length; i++) {
            data.add(new DataClass(nama[i], stok[i], harga[i]));
        }
        
    }
}
