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
public class Restaurante {
    private int polbo;
    private int patacas;

    public Restaurante() {
    }

    public Restaurante(int polbo, int patacas) {
        this.polbo = polbo;
        this.patacas = patacas;
    }

    public int getPolbo() {
        return polbo;
    }

    public int getPatacas() {
        return patacas;
    }

    public void setPolbo(int polbo) {
        this.polbo = polbo;
    }

    public void setPatacas(int patacas) {
        this.patacas = patacas;
    }
    
    
    
    
    public int calcularClientes(){
        int clientes = (2*polbo + patacas)/3;
        System.out.println("el numero de clientes es: "+clientes);
        return clientes;
     }   
    public void engadirpolbo(int x){
        polbo = x + polbo;
    }
    public void engadirpatacas(int y){
        patacas = y + patacas;
    }
    public void amosarpolbo(){
        System.out.println("A cantidade de polbo en almacén é: "+ polbo);
    }
    public void amosarpatacas(){
        System.out.println("A cantidade de patacas en almacén é: "+patacas);
    }
}
