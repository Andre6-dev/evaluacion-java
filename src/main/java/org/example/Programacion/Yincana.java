package org.example.Programacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase del ejercicio 1
 */
public class Yincana {
    public static List<List<String>> organizarYincana(List<String> equipos) {
        // Si el número de equipos es impar, uno descansará en cada ronda
        if (equipos.size() % 2 == 1) {
            equipos.add("Descansa");
        }

        // Ordenamos los equipos aleatoriamente
        Collections.shuffle(equipos);

        // Inicializamos la lista de rondas
        List<List<String>> rondas = new ArrayList<>();

        // Recorremos los equipos
        for (int i = 0; i < equipos.size(); i++) {
            // Si el equipo actual es el equipo que descansa, pasamos al siguiente
            if (equipos.get(i).equals("Descansa")) {
                continue;
            }

            // Creamos una nueva ronda con el equipo actual y el siguiente
            List<String> ronda = new ArrayList<>();
            ronda.add(equipos.get(i));
            ronda.add(equipos.get((i + 1) % equipos.size()));

            // Agregamos la ronda a la lista de rondas
            rondas.add(ronda);
        }

        return rondas;
    }

    public static void main(String[] args) {
        // Creamos un ejemplo de equipos impares
        List<String> equiposImpares = new ArrayList<>();
        equiposImpares.add("Equipo azul");
        equiposImpares.add("Equipo verde");
        equiposImpares.add("Equipo rosado");

        // Imprimimos el listado de rondas para equipos impares
        System.out.println("Equipos impares:");
        List<List<String>> rondasImpares = organizarYincana(equiposImpares);
        for (List<String> ronda : rondasImpares) {
            System.out.println(ronda);
        }

        // Creamos un ejemplo de equipos pares
        List<String> equiposPares = new ArrayList<>();
        equiposPares.add("Equipo verde");
        equiposPares.add("Equipo rosado");
        equiposPares.add("Equipo azul");
        equiposPares.add("Equipo turquesa");

        // Imprimimos el listado de rondas para equipos pares
        System.out.println("Equipos pares:");
        List<List<String>> rondasPares = organizarYincana(equiposPares);
        for (List<String> ronda : rondasPares) {
            System.out.println(ronda);
        }
    }
}
