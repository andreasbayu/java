/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.io.*;


/**
 *
 * @author andbayu
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        Manusia[] m = new Manusia[2];

        int x = 0;

        do 
        {
            System.out.println("User "+(x + 1));
            System.out.print("Masukkan Tinggi Badan Anda (cm)     = ");
            double t = Double.parseDouble(buff.readLine());
            System.out.print("Masukkan Jenis Kelamin Anda (L/P)   = ");
            String jk = buff.readLine();

            if (jk.equalsIgnoreCase("L")) {
                m[x] = new LakiLaki(t);
                System.out.println("Berat Badal Ideal laki - laki anda adalah "+m[x].hitungBBI()+"KG" );
                System.out.println();
            } else if (jk.equalsIgnoreCase("P")){
                m[x] = new Perempuan(t);
                System.out.println("Berat Badal Ideal perempuan anda adalah "+m[x].hitungBBI()+"KG" );
                System.out.println();
            } else {
                System.out.println("Input Tidak Dikenal");
            }
            x++;
        } while (x < 2);
    }
    
}
