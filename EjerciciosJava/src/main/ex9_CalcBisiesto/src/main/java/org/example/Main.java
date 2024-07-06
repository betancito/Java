package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app para saber si el año ingresado es bisiesto");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("es un año bisiesto");
        } else {
            System.out.println("no es un año bisiesto");
        }
    }
}