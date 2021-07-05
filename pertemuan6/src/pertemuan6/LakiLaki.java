/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author andbayu
 */
public class LakiLaki extends Manusia{
    public LakiLaki(double tb) 
    {
        super(tb);
    }

    @Override
    public double hitungBBI()
    {
        return (super.getTinggiBadan() - 100) * 0.9;
    }
}
