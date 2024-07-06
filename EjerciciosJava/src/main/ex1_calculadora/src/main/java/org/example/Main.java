package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de calculadora simple, a continuación ingrese dos numeros para obtener la suma, resta multiplicación y división");
        System.out.println("A continuación ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("A continuación ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        double sum = num1+num2;
        double res = num1-num2;
        double mul = num1*num2;
        double div = num1/num2;
        System.out.println("El rsultado de la suma es: " + sum);
        System.out.println("El rsultado de la resta es: " + res);
        System.out.println("El rsultado de la multiplicación es: " + mul);
        System.out.println("El rsultado de la división es: " + div);
    }
}