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
public abstract class AbstractKantin {
    
    // menghindari NPE ketika dipanggil
    protected int totalharga = 0;

    protected int totalItem = 0;

    public abstract void hitungTotal(int[] harga, int[] jumlahBeli);

    public int getTotalHarga() {
        return totalharga;
    }

    public int getTotalItem() {
        return totalItem;
    }

}
