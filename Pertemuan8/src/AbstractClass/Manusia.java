/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author andbayu
 */
public abstract class Manusia {
    
    private double tinggiBadan;

    public Manusia(double tb) 
    {
        tinggiBadan = tb;
    } 

    public double getTinggiBadan() 
    {
        return tinggiBadan;
    }

    public abstract double hitungBBI();
}
