package org.example;

import java.util.ArrayList;

public class Inventario{
    private ArrayList<Producto> productos;
    public Inventario(){
        this.productos = new ArrayList<>();
    }
    public void agregarProducto (Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto (Producto producto){
        productos.remove(producto);
    }
    public void eliminarProductoPorId (int id){
        boolean encontrado = false;
        for (Producto producto:productos){
            int idProd = producto.getId();
            if (id==idProd){
                productos.remove(producto);
                System.out.println("Producto eliminado satisfactoriamente!");
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("Producto no encontrado");
        }
    }
    public void listarProductos() {
        for (Producto producto : productos) {
            if (producto instanceof ProductoEspecifico) {
                System.out.println("id:" + producto.getId() + " |Nombre: " + producto.getNombre() + " |Precio: $" + producto.getPrecio() + " |Marca: " + ((ProductoEspecifico) producto).getMarca() + " |Categoria: " + ((ProductoEspecifico) producto).getCategoria());
            } else {
                System.out.println("id:" + producto.getId() + " |Nombre: " + producto.getNombre() + " |Precio: $" + producto.getPrecio());
            }
        }
    }

    public void buscarPorNombre(String nombre){
        boolean encontrado = false;
        for (Producto producto:productos) {
            String name = producto.getNombre();
            if (name.equalsIgnoreCase(nombre)){
                System.out.println("Producto encontrado! |id:" +producto.getId()+ " |Nombre: "+producto.getNombre()+" |Precio: $"+producto.getPrecio() );
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("El producto con nombre "+ nombre+" no fue encontrado en el inventario");
        }
    }
    public void buscarPorCategoria (String categoria){
        boolean encontrado = false;
        for (Producto producto:productos) {
            if (producto instanceof ProductoEspecifico){
                ProductoEspecifico especifico = (ProductoEspecifico) producto;
                if (especifico.getCategoria().equalsIgnoreCase(categoria)){
                    System.out.println("El preoducto con categoria "+ categoria +" ha sido encontrado ");
                    System.out.println("|id:" +producto.getId()+ " |Nombre: "+producto.getNombre()+" |Precio: $"+producto.getPrecio()+ " |Marca: "+ ((ProductoEspecifico) producto).getMarca()+" |Categoria: "+ ((ProductoEspecifico) producto).getCategoria());
                    encontrado=true;
                }
            }

        }
        if (!encontrado){
            System.out.println("El proucto con categoria "+categoria+" no ha sido encontrado");
        }
    }
}
