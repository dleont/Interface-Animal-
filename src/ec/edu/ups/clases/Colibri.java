/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Acciones;

/**
 *
 * @author Darwin
 */
public class Colibri extends Animal implements Acciones {

    @Override
    public void comer() {
        System.out.println("Ese "+this.getNombre()+"come mucho");    
    }

    @Override
    public void dormir() {
        System.out.println("Esa ave al llegar a los "+this.getEdad()+" tienden a dormir muy poco");
         }

    @Override
    public void moverse() {
        System.out.println("Esa ave, al llegar a los "+this.getEdad()+" pierde su velocidad");
    }

    @Override
    public void jugar() {
        System.out.println("Las aves de "+this.getPeso() +"gramos son las mas juguetonas");
    }

    @Override
    public void reproducir() {
        System.out.println("Las aves "+this.getSexo()+"viven mas tiempo");
    }
    
    
}
