package org.example;

public abstract class figurasGeometricas {
    abstract double calcularArea();


}
class Circulo extends figurasGeometricas{
    double radio;
    public Circulo (double radio){
        this.radio = radio;
    }
    @Override
    double calcularArea() {
        return 3.14*(radio*radio);
    }

}
class Rectangulo extends figurasGeometricas{
    double base;
    double altura;
    public Rectangulo (double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    double calcularArea() {
        return base*altura;
    }
}
class Cuadrado extends figurasGeometricas{
    double lado;

    public Cuadrado (double lado){
        this.lado=lado;
    }
    @Override
    double calcularArea() {
        return lado*2;
    }
}
