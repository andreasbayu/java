/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan9;

/**
 *
 * @author andbayu
 */
public class Pelanggan extends AbstractKantin{

    // @Override hitung total
    public void hitungTotal(int[] harga, int[] jumlahBeli) {
        for (int i = 0; i < jumlahBeli.length; i++) {
            this.totalharga += harga[i] * jumlahBeli[i];
            this.totalItem += jumlahBeli[i];
        }
        if (this.totalharga > 30000) {
            System.out.println("Anda Berhak Mendapat diskon 5% ");
        }
    }

    public int getDiskon() {
        if (this.totalharga < 0 ) {
            System.out.println("Total Harga masih kosong");
            return 0;
        } else if (this.totalharga > 30000){
            int diskon = (int) (0.05 * this.totalharga);
            return diskon;
        } else {
            return 0;
        }
    }
    
}
