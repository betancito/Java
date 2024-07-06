package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación para determinar si un número es positivo, negativo o cero. Además si es par o impar");
        int num = scanner.nextInt();
        if (num<0){
            System.out.println("El número "+num+" es negativo");
        } else if (num>0) {
            System.out.println("El número "+num+" es positivo");
        } else if (num==0) {
            System.out.println("El número "+num+" es cero");
        }
        System.out.println("Además");
        if (num%2==0){
            System.out.println("El número "+num+" es par");
        }else{
            System.out.println("El número "+num+" es impar");
        }
    }
}