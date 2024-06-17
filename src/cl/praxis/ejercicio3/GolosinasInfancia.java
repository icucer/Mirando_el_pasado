package cl.praxis.ejercicio3;

import java.util.Map;
import java.util.TreeMap;

public class GolosinasInfancia {
    public static void main(String[] args) {

        // Paso 1
        Map<String, Integer> golosinas = new TreeMap<>();

        // Paso 2
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tableton", 5);

        // Paso 3
        System.out.println("\nGolosinas con precio menor a 100 pesos:");
        for (Map.Entry<String, Integer> entry : golosinas.entrySet()) {
            if (entry.getValue() < 100) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " pesos");
            }
        }
    }
}
