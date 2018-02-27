/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_4_2;

/**
 *
 * @author mfrancomartinez
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
    
    public Satelite(){
        meridiano = paralelo = distanciaTerra = 0;
    }
    
    public Satelite(double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }
    
    public void verPosicion(){
        System.out.println("O satelite atopase no paralelo: "+paralelo+" meridiano: "+meridiano+"e a unha distancia da terra: "+ distanciaTerra);
    }
}
