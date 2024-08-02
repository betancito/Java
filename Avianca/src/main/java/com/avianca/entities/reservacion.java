package com.avianca.entities;

public class reservacion {
    private int id;
    private int id_pasajero;
    private int id_vuelo;
    private String fecha_reservacion;
    private String asiento;

    //constructor
    public reservacion() {}
    public reservacion(int id, int id_pasajero, int id_vuelo, String fecha_reservacion, String asiento) {
        this.id = id;
        this.id_pasajero = id_pasajero;
        this.id_vuelo = id_vuelo;
        this.fecha_reservacion = fecha_reservacion;
        this.asiento = asiento;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public void setFecha_reservacion(String fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    //getters
    public int getId() {
        return id;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public String getFecha_reservacion() {
        return fecha_reservacion;
    }

    public String getAsiento() {
        return asiento;
    }

    //toString

    @Override
    public String toString() {
        return "reservacion: " + "--id=" + id + " --id_pasajero=" + id_pasajero + " --id_vuelo=" + id_vuelo + " --fecha_reservacion=" + fecha_reservacion + " --asiento='" + asiento + "\n";
    }
}
