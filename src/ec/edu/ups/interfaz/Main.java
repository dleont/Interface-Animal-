/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Perro;

/**
 * Clase principal donde inicia la ejecucion del programa
 *
 * @author Darwin
 */
public class Main {

    public static void main(String[] args) {
        Animal chihuahua = new Animal("Chihuahua", 5, 1.3, "macho");
        Animal bulldog = new Animal("Bulldog", 1, 5.1, "hembra");
        Animal boxer = new Animal("Boxer", 10, 10.6, "macho");

        Animal tiburon = new Animal("Tiburon", 2, 15, "macho");
        Animal espada = new Animal("Espada", 1, 3.4, "hembra");
        Animal gato = new Animal("Gato", 3, 2.7, "hembra");

        Animal colibri = new Animal("Colibri", 3, 26, "hembra");
        Animal condor = new Animal("Condor", 10, 11.1, "hembra");
        Animal aguila = new Animal("Aguila", 4, 7.6, "macho");
        
       Perro g = new Perro("pirulaisi", 5, 50.2, "macho");
       g.comer();
       g.dormir();
       g.jugar();
       g.moverse();
        
        
        System.out.println(chihuahua);
        System.out.println(bulldog);
        System.out.println(boxer);
        
        System.out.println(tiburon);
        System.out.println(espada);
        System.out.println(gato);
        
        System.out.println(colibri);
        System.out.println(condor);
        System.out.println(aguila);
        
        

    }

}
