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
        libro1.autor = "pene";

    }

}
