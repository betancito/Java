package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Ejemplo Libros
        Libro libro1 = new Libro("Satanás","Mario Mendoza","2002",false);
        libro1.isPrestado();
        libro1.prestar();
        libro1.isPrestado();
        libro1.devolver();
        libro1.isPrestado();

        //Ejamplo Gestion empleados
        Empleado empleado1 = new Empleado(1, "Javier","TImanager", 2300);
        System.out.println(empleado1.salario);
        empleado1.incremento(20);
        System.out.println(empleado1.salario);

        //Ejemplo cuenta bancaria
        cuentaBancaria nuevaCuenta = new cuentaBancaria("Jeronimo", 2000);
            //actualizar balance
        System.out.println(nuevaCuenta.getBalance());
        nuevaCuenta.ingresarDinero(200);
        System.out.println(nuevaCuenta.getBalance());
            //ejemplo retiro
        nuevaCuenta.retiroDinero(20000);
        nuevaCuenta.retiroDinero(200);

        //Ejemplo figuras geometricas
        figurasGeometricas circulo1 = new Circulo(5);
        System.out.println("Area circulo1: "+circulo1.calcularArea());
        figurasGeometricas cuadrado1 = new Cuadrado(2);
        System.out.println("Area cuadrado1: "+cuadrado1.calcularArea());
        figurasGeometricas rectangulo1 = new Rectangulo(2,5);
        System.out.println("Area rectangulo1: "+rectangulo1.calcularArea());

        //Ejemplo control de Stock
        Producto producto1 = new Producto(1,"leche","lacteo",12);
        producto1.addStock(15);
        producto1.howManyStock();
        producto1.releaseStock(5);
        producto1.howManyStock();

        //Ejemplo Estudiantes
        Estudiante estudiante1 = new Estudiante("Jeronimo");
        estudiante1.agregarNota(7);
        estudiante1.agregarNota(10);
        estudiante1.agregarNota(5);
        estudiante1.vernotas();
        System.out.println(estudiante1.promNotas());
    }

}
