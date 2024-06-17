package cl.praxis.ejercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class JuegosInfancia {
    public static void main(String[] args) {

        // Paso 1
        Queue<String> juegos = new LinkedList<>();

        // Paso 2
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        // Paso 3
        System.out.println("\nCantidad de juegos: " + juegos.size() + ".");
    }
}
