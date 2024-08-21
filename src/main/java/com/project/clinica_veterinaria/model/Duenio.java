package com.project.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Duenio {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id_duenio;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String celular;

    public Duenio() {
    }

    public Duenio(Long id_duenio, String identificacion, String nombre, String apellido, String celular) {
        this.id_duenio = id_duenio;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public Long getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(Long id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
