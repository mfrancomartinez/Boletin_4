/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_4_4;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Restaurante ex1 = new Restaurante();
    ex1.setPatacas(3);
    ex1.setPolbo(3);
    ex1.amosarpatacas();
    ex1.amosarpolbo();
    ex1.calcularClientes();
    ex1.engadirpatacas(3);
    ex1.engadirpolbo(3);
    ex1.amosarpatacas();
    ex1.amosarpolbo();
    ex1.calcularClientes();
    }
    
}
