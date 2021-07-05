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
public class Pembeli extends AbstractKantin {

    // @Override hitungTotal
    public void hitungTotal(int[] harga, int[] jumlahBeli) {
        for (int i = 0; i < jumlahBeli.length; i++) {
            this.totalharga += harga[i] * jumlahBeli[i];
            this.totalItem += jumlahBeli[i];
        }
    }
    
}
