/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_4_3;

/**
 *
 * @author mfrancomartinez
 */
public class Circulo {
    private double radio;
    private final double  pi = 3.14;
    private double area;
    private double lonxitude;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getPi() {
        return pi;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        area = pi*Math.pow(radio, 2);
        System.out.println("El area es: "+area);
        return area;
    }
    
    public double calcularLonxitude(){
        lonxitude = 2*pi*radio;
        System.out.println("A lonxitude é: "+lonxitude);
        return lonxitude;
    }
    
}
