/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_4_1;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Coche ex1 = new Coche();
     ex1.getVelocidade();     
     ex1.acelerar(20);
     ex1.getVelocidade();     
     ex1.frenar(5);
     ex1.getVelocidade();
     
    }
    
}
