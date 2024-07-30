package com.library.entities;

public class libro {
    private Integer id;
    private String titulo;
    private Integer año_publicacion;
    private Integer precio;
    private Integer id_autor;

    //constructores
    public libro() {}
    public libro(Integer id, String titulo, Integer año_publicacion, Integer precio, Integer id_autor) {
        this.id = id;
        this.titulo = titulo;
        this.año_publicacion=año_publicacion;
        this.precio=precio;
        this.id_autor=id_autor;
    }

    //setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño_publicacion(Integer año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
    }

    //getters

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAño_publicacion() {
        return año_publicacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getId_autor() {
        return id_autor;
    }

    //toString

    @Override
    public String toString() {
        return "libro[" + "id=" + id + "\n" + " titulo= " + titulo + "\n" + ", año_publicacion=" + año_publicacion + "\n" + " precio=" + precio + "\n" + " id_autor=" + id_autor + ']';
    }
}
