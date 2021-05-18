package com.example.accessingdatajpa;

import java.util.List;

/**
 * Project name: DAM20/PACKAGE_NAME
 * Filename:
 * Created:  14/11/2020 / 13:47
 * Description:
 * Revision:
 *
 * @Author: Ismael - fmartin@nigul.cide.es
 * @Version:
 */

public class AlumnoDto {
    private String nombre;
    private int edad;
    private List<AsignaturaDto> asignaturaDtos;

    public AlumnoDto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nota) {
        this.edad = nota;
    }

    public List<AsignaturaDto> getAsignaturas() {
        return asignaturaDtos;
    }

    public void setAsignaturas(List<AsignaturaDto> asignaturaDtos) {
        this.asignaturaDtos = asignaturaDtos;
    }
}
