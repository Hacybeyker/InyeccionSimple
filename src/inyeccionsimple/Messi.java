/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inyeccionsimple;

/**
 *
 * @author
 * <AdvanceSoft - Osorio Perez Carlos Alfredo - advancesoft.trujillo@gmail.com>
 */
public class Messi {
    
    private Barcelona barcelona;
    
    public Messi(Barcelona barcelona){
        this.barcelona = barcelona;        
    }

    public void setBarcelona(Barcelona barcelona) {
        this.barcelona = barcelona;
    }    
    
    public void mostrarEquipo(){
        barcelona.mostrar();
    }
}
