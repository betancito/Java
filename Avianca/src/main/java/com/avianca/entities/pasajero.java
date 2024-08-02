package com.avianca.entities;

public class pasajero {
    private int id;
    private String nombre;
    private String apellido;
    private String documento_identidad;

    //constructores
    public pasajero() {}
    public pasajero(String nombre, String apellido, String documento_identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento_identidad = documento_identidad;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    //toString

    @Override
    public String toString() {
        return "--pasajero:" + " --id=" + id + " --nombre='" + nombre + " --apellido='" + apellido + " --documento_identidad='" + documento_identidad + "\n";
    }
}
