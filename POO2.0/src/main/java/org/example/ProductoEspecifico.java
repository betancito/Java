package org.example;

public class ProductoEspecifico extends Producto {
    private String categoria;
    private String marca;

    public ProductoEspecifico(int id, String nombre, int precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    //getter categoría
    public String getCategoria(){
        return this.categoria;
    }

    //getter marca
    public String getMarca(){
        return this.marca;
    }

    //setter categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //setter marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
