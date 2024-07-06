package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app para calcular tu promedio");
        System.out.println("A continuación ingresa la primera nota");
        double n1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("A continuación ingresa la segunda nota");
        double n2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("A continuación ingresa la tercera nota");
        double n3 = scanner.nextDouble();
        double prom = (n1+n2+n3)/3;
        if (prom >= 6){
            System.out.println("Usted ha aprobado con un promediod de "+ prom);
        }else {
            System.out.println("usted ha reprobado con un promerio de "+ prom);
        }
    }
}