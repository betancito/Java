package com.avianca.entities;

import java.awt.*;

public class vuelo {
    private int id;
    private String destino;
    private String fecha_salida;
    private int hora_salida;
    private int id_avion;

    //constructor
    public vuelo(){}
    public vuelo(int id, String destino, String fecha_salida, int hora_salida, int id_avion){
        this.id = id;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.id_avion = id_avion;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public int getId_avion() {
        return id_avion;
    }

    //toString

    @Override
    public String toString() {
        return "vuelo: " + "--id=" + id + " --destino='" + destino + " --fecha_salida=" + fecha_salida + " --hora_salida=" + hora_salida + " --id_avion=" + id_avion + "\n";
    }
}
