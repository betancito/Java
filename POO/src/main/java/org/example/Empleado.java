package org.example;

public class Empleado {
    public String nombre;
    public String posicion;
    public double salario;
    public int id;

    public Empleado(int id, String nombre, String posicion, double salario){
        this.id=id;
        this.nombre=nombre;
        this.posicion=posicion;
        this.salario=salario;
    }
     void incremento(double porcentaje){
        porcentaje = porcentaje/100;
        this.salario+= (this.salario*porcentaje);
    }
    void setNombre(String nombre){
        this.nombre  = nombre;
    }
    void setPosicion(String posicion){
        this.posicion = posicion;
    }
    void  setSalario(double salario){
        this.salario = salario;
    }
    void setId(int id){
        this.id = id;
    }
}

