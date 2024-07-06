package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la aplicación donde puedes ingresar tu edad para validar si eres mayor de edad o no.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int age = scanner.nextInt();
        scanner.close();
        if (age > 17 ){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }
    }
}