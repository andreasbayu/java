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
public final class Perempuan extends Manusia{
    
    public Perempuan(double tb) 
    {
        super(tb);
    }

    @Override
    public final double hitungBBI()
    {
        return (super.getTinggiBadan() - 100) * 0.8;
    }
}
