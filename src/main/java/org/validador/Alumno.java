package org.validador;

import java.sql.Array;
import java.util.*;

public class Alumno {

    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean cumpleCorrelativas(Materia materia) {
        return materiasAprobadas.containsAll(materia.getMateriasCorrelativas());
    }

}