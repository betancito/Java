package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación para calcular su IMC(indice de masa corporal");
        System.out.println("A continuación ingrese su peso en Kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("A continuación ingrese su altura en Metros: ");
        double est = scanner.nextDouble();
        scanner.close();
        double imc = peso/(est*est);
        System.out.println("Su IMC es de: " + imc);
        if (imc<18.5){
            System.out.println("Te encuentras en un IMC bajo, considera cambiar tu dieta para subir unos kilos(Posible desnutrición)");
        }else if (imc>=18.5 & imc<=24.9){
            System.out.println("Te encuentras en un IMC ideal (peso saludable)");
        } else if (imc>=25 & imc<=29.9) {
            System.out.println("Te encuentras en un IMC sobre el ideal. consulta tu medico para saber si es necesario bajarlo (sobrepeso)");
        } else if (imc>30) {
            System.out.println("Te encuentras en un IMC Alto, consulta a tu medico (obesidad)");
        }
    }
}