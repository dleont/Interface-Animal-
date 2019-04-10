/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.clases.Animal;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.PezEspada;

/**
 * Clase principal donde inicia la ejecucion del programa Llamamos a los metodos
 * abstractos de la clase padre.
 *
 * @author Darwin
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Animal chihuahua = new Animal("Chihuahua", 5, 1.3, "macho"); Animal
         * bulldog = new Animal("Bulldog", 2, 5.1, "hembra"); Animal boxer = new
         * Animal("Boxer", 10, 10.6, "macho");
         *
         * Animal tiburon = new Animal("Tiburon", 2, 15, "macho"); Animal espada
         * = new Animal("Espada", 1, 3.4, "hembra"); Animal gato = new
         * Animal("Gato", 3, 2.7, "hembra");
         *
         * Animal colibri = new Animal("Colibri", 3, 26, "hembra"); Animal
         * condor = new Animal("Condor", 10, 11.1, "hembra"); Animal aguila =
         * new Animal("Aguila", 4, 7.6, "macho");
         */

        //clase Perro
        Perro g = new Perro("pirulais", 5, 1.3, "macho");
        //System.out.println(chihuahua);
        g.comer();
        g.dormir();
        g.jugar();
        g.moverse();
        g.reproducir();

        Perro b = new Perro("Lazi", 2, 5.1, "hembra");
        System.out.println(" ");
        // System.out.println(bulldog);
        b.comer();
        b.dormir();
        b.jugar();
        b.moverse();
        b.reproducir();

        Perro b2 = new Perro("Tobi", 10, 10.6, "macho");
        System.out.println(" ");
        // System.out.println(boxer);
        b2.comer();
        b2.dormir();
        b2.jugar();
        b2.moverse();
        b2.reproducir();

        //clase PezEspada
        PezEspada tiburon = new PezEspada("Tiburon", 2, 15, "macho");
        System.out.println(" ");
        System.out.println(tiburon);
        tiburon.comer();
        tiburon.dormir();
        tiburon.jugar();
        tiburon.moverse();
        tiburon.reproducir();

        PezEspada espada = new PezEspada("Pez Espada", 1, 3.4, "hembra");
        System.out.println(" ");
        System.out.println(espada);
        espada.comer();
        espada.dormir();
        espada.jugar();
        espada.moverse();
        espada.reproducir();

        PezEspada gato = new PezEspada("Pez Gato", 3, 2.7, "hembra");
        System.out.println(" ");
        System.out.println(gato);
        gato.comer();
        gato.dormir();
        gato.jugar();
        gato.moverse();
        gato.reproducir();

    }

}
