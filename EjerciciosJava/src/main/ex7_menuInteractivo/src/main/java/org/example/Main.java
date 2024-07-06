package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app interactiva");
        System.out.println("Ingrese 1 para sumar");
        System.out.println("Ingrese 2 para restar");
        System.out.println("Ingrese 3 para multiplicar");
        System.out.println("Ingrese 4 para dividir");

        int op = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A continuación ingrese el primer número");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A continuación ingrese el segundo número");
        int num2 = scanner.nextInt();
        scanner.close();
        double solution = 0;
        switch (op){
            case 1:
                solution = num1+num2;
                break;
            case 2:
                solution = num1-num2;
                break;
            case 3:
                solution = num1*num2;
                break;
            case 4:
                solution = num1/num2;
                break;
        }
        System.out.println("EL resultado de la operacion es "+ solution);
    }
}