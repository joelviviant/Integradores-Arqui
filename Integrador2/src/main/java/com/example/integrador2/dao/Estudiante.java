package com.example.integrador2.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellido;
    private Integer edad;
    private String genero;
    private String documento;
    private String ciudadResidencia;
    private String numLibreta;
    private Boolean graduado;

    @ManyToMany
    @JoinTable(
            name = "matriculacion",
            joinColumns = @JoinColumn(name = "estudiante_id"),
            inverseJoinColumns = @JoinColumn(name = "carrera_id")
    )
    private List<Carrera> carreras;

    // Constructor por defecto
    public Estudiante() {}

    // Constructor con todos los atributos
    public Estudiante(String nombres, String apellido, Integer edad, String genero, String documento,
                      String ciudadResidencia, String numLibreta, Boolean graduado) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.ciudadResidencia = ciudadResidencia;
        this.numLibreta = numLibreta;
        this.graduado = graduado;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getNumLibreta() {
        return numLibreta;
    }

    public void setNumLibreta(String numLibreta) {
        this.numLibreta = numLibreta;
    }

    public Boolean getGraduado() {
        return graduado;
    }

    public void setGraduado(Boolean graduado) {
        this.graduado = graduado;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
}
