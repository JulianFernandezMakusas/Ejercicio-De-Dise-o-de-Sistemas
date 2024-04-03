package org.validador;

import java.util.*;

public class Inscripccion {

    private Alumno alumno;
    private ArrayList<Materia> materias;

    public Inscripccion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public boolean aprobada() {
        return materias.stream().allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }
}