package org.example;

public class Producto {
    private Integer id;
    private String nombre;
    Integer precio;

    //Constructor producto
    public Producto (int id, String nombre, int precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
    }

    //getter para id
    public int getId(){
        return this.id;
    }

    //getter para nombre
    public String getNombre(){
        return this.nombre;
    }

    //getter para precio
    public int getPrecio(){
        return this.precio;
    }

    //setter para id
    public void setId(int id){
        this.id=id;
    }

    //setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //setter precio
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
