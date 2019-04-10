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
public class Perro  extends Animal implements Acciones {

    public Perro(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }
    
    //metodos abstractos que heradaron de la clase padre.
    @Override
    public void comer() { 
        System.out.println("El perro "+ this.getNombre() +" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro de "+this.getEdad()+" años duermen poco");
    }

    @Override
    public void moverse() {
        System.out.println("El peso del perro es "+this.getPeso()+" kg ");
    }

    @Override
    public void jugar() {
        System.out.println("El perro  "+this.getNombre()+" no se cansa de jugar");
    }

    @Override
    public void reproducir() {
        System.out.println("El perro de sexo "+this.getSexo()+" son mas lindos");
    }
    
}
