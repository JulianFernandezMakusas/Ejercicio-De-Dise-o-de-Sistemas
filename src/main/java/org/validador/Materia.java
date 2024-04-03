package org.validador;

import java.util.*;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}