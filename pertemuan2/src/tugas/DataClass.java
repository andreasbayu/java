/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author andbayu
 */

class DataClass{
    private int stok;
    private int harga;
    private String nama;

    // constructor data class
    DataClass(String nama, int stok, int harga) {
        this.stok = stok;
        this.harga = harga;
        this.nama = nama;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getStok(){
        return this.stok;
    }

    public int getHarga(){
        return this.harga;
    }

    public String getNama(){
        return this.nama;
    }
}