package com.avianca.entities;

public class avion {
    private int id;
    private String modelo;
    private int capacidad;

    public avion(){}
    public avion(int id, String modelo, int capacidad) {
        this.id = id;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //toString

    @Override
    public String toString() {
        return "--avion: " + " --id=" + id + " --modelo='" + modelo + " --capacidad='" + capacidad  + "\n";
    }
}
