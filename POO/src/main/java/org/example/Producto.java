package org.example;

public class Producto {
    Integer id;
    String nombre;
    String descripcion;
    Integer stockAmount = 0;
    public Producto(int id, String nombre, String descripcion, int stockAmount){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.stockAmount=stockAmount;
    }

    void addStock(int amnt){
        this.stockAmount+=amnt;
    }
    void releaseStock(int amnt){
        this.stockAmount-=amnt;
    }
    void howManyStock(){
        System.out.println("The remaining on stock is "+this.stockAmount);
    }
}
