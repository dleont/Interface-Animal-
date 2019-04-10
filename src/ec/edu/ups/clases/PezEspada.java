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
public class PezEspada extends Animal implements Acciones {

    public PezEspada() {
    }

    public PezEspada(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }

    //metodos abstractos que heredan de la clase padre, Acciones.   
    @Override
    public void comer() {
        System.out.println("El pez " + this.getNombre() + "esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El pez " + this.getNombre() + "tambien duerme ");
    }

    @Override
    public void moverse() {
        System.out.println("El pez " + this.getNombre() + "puede desplazarse a una gran velocidad devido a sus " + this.getPeso() + "kg");
    }

    @Override
    public void jugar() {
        System.out.println("El pez al llegar a sus " + this.getEdad() + "años, ya no juega.");
    }

    @Override
    public void reproducir() {
        System.out.println("El pez " + this.getSexo() + "es el mas rapido");
    }

}
