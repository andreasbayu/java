/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5fix;

/**
 *
 * @author andbayu
 */
public class Pertemuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Herbivore hb = new Herbivore();
        hb.nama = "Cow";
        hb.color = "Hitam Putih";
        hb.display();
        
        Carnivore cn = new Carnivore();
        cn.nama = "Tiger";
        cn.color = "Loreng";
        cn.display();
        
        Omnivore on = new  Omnivore();
        on.nama ="ayam";
        cn.color ="cokelat";
        on.display();
        
    }
}
