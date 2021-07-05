/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCuy;

/**
 *
 * @author andbayu
 */
public class Percabangan {
    public static void main(String[] args){
        int a = 7;
        
        if ((a > 0) && (a % 2 == 0 )) {
            System.out.println(a + " adalah bilnagan genap positif");
        } else if ( (a < 0 ) && (a % 2 == 0) ){
            System.out.println(a + " adalah bilangan negatif");
        } else if ( (a > 0 ) && (a % 2 != 0) ){
            System.out.println(a + " adalah bilangan ganjil positif");
        } else {
            System.out.println(a + " adalah bilangan ganjil negatif");
        }
    }
}
