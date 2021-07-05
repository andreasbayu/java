/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author andbayu
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestEnkapsulasi te = new TestEnkapsulasi();
        te.setName("Bayu");
        te.setAge(20);
        te.setIdNum("Test dummy string");
        System.out.printf("Name\t: %s \nAge\t: %d \n", te.getName(), te.getAge());
    }
    
}
