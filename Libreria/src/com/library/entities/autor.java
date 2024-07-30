package com.library.entities;

public class autor {
    private int id;
    private String nombre;
    private String nacionalidad;
    public autor() {}
    public autor(int id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    //toString

    @Override
    public String toString() {
        return "autor[" + " id=" + id + ", nombre='" + nombre + '\n' + ", nacionalidad='" + nacionalidad + '\n' + ']';
    }
}
