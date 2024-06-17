package cl.praxis.ejercicio1;

import java.util.ArrayList;

public class ListaDeMarcas {
    public static <marcas> void main(String[] args) {
        // Paso 1
        ArrayList<String> marcas = new ArrayList<>();

        // Paso 2
        marcas.add("Kodak");
        marcas.add("Nokia");
        marcas.add("Atari");
        marcas.add("MySpace");
        marcas.add("Palm");
        marcas.add("Compaq");
        marcas.add("Netscape");
        marcas.add("Sega");
        marcas.add("BlackBerry");
        marcas.add("Polaroid");

        System.out.println("\nListado de marcas inicial:");

        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 3
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.println("\nListado de marcas después de agregar las recordadas por la amiga:");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 4
        int indiceBlokbaster = marcas.indexOf("Blokbaster");
        if (indiceBlokbaster != -1) {
            marcas.set(indiceBlokbaster, "Blockbuster");
        }

        System.out.println("\nListado de marcas después de corregir 'Blokbaster' a 'Blockbuster':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 5
        boolean eliminado = marcas.remove("Carrefour");
        if (eliminado) {
            System.out.println("\n'Carrefour' se eliminó correctamente.");
        } else {
            System.out.println("\n'Carrefour' no se encontró en el listado.");
        }

        System.out.println("Verificamos si es verdadero o falso el valor de la variable: " + eliminado + ".");

        System.out.println("\nListado de marcas después de remover 'Carrefour':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 6
        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Yahoo");
        posiblesMarcas.add("AOL");
        posiblesMarcas.add("Toys 'R' Us");

        marcas.addAll(posiblesMarcas);

        System.out.println("\nListado de marcas después de incorporar 'posiblesMarcas':");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Paso 7
        System.out.println("\nTotal de marcas en el listado: " + marcas.size() + ".");
    }
}
