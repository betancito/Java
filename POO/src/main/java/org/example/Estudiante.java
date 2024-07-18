package org.example;

import java.util.ArrayList;

public class Estudiante {
    String nombre;
    ArrayList<Integer> notas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    void agregarNota(int nota) {
        notas.add(nota);
    }

    void vernotas() {
        System.out.println(notas);
    }

    float promNotas() {
        int totNot = 0;
        for (int i = 0; i < notas.size(); i++) {
            totNot+=notas.get(i);
        }
        return (float) totNot /notas.size();
    }
}
