package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app para calcular la propina");
        System.out.println("a continuación ingrese el total de la venta");
        int tot = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println("a continuación ingrese el porcentaje deseado para la propina");
        double per = scanner.nextInt();
        double percentage = (per/100)*tot;
        System.out.println("El "+per+"% de su compra es de: "+percentage);

    }
}