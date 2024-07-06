package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al prorama para pasar Km(Kilometros) a Mi(millas)");
        System.out.println("A continuación ingrese la distancia en Km: ");
        double km = scanner.nextDouble();
        double mi = km/1.60934;
        System.out.println("La distancia en Km de"+km+"Km es de: "+mi+"Mi");
        scanner.close();
    }
}