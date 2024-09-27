package com.example.integrador2.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String facultad;
    private Integer duracion;

    @ManyToMany(mappedBy = "carreras")
    private List<Estudiante> estudiantes;

    // Constructor por defecto
    public Carrera() {}

    // Constructor con todos los atributos
    public Carrera(String nombre, String facultad, Integer duracion) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.duracion = duracion;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
