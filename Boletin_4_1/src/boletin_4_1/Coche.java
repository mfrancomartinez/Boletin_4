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
public class Coche {
    private int velocidade;
    
    public Coche(){
        velocidade=0;
    }

    public int getVelocidade() {
        System.out.println("Velocidade= "+velocidade);
        return velocidade;        
    }
    
    public void acelerar (int valor){
        velocidade = velocidade+valor;
    }
    
    public void frenar (int menos){
        velocidade = velocidade - menos;
        
        
    }

  
}
