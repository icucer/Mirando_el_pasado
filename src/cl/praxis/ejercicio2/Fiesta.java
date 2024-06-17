package cl.praxis.ejercicio2;

import java.util.TreeSet;
import java.util.Set;

public class Fiesta {
    public static void main(String[] args) {

        // Paso 1
        Set<String> invitados = new TreeSet<>();

        // Paso 2
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        // Paso 3
        Set<String> posiblesInvitados = new TreeSet<>();

        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);

        System.out.println("\nListado combinado de invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        // Paso 4
        boolean eliminado = invitados.remove("Jorge");
        if (eliminado) {
            System.out.println("\n'Jorge' se eliminó correctamente.");
        } else {
            System.out.println("\n'Jorge' no se encontró en el listado.");
        }

        System.out.println("\nListado final de invitados:");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }
}
