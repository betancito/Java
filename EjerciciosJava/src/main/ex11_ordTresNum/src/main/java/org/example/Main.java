package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sorteador de numeros");
        System.out.println("a continuación ingrese el primer número");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("a continuación ingrese el segundo número");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("a continuación ingrese el tercer número");
        int n3 = scanner.nextInt();
        scanner.nextLine();
        if (n1<n2 & n2<n3){
            System.out.println("la combinacion de menor a mayor es la siguiente: "+n1+", "+n2+", "+n3);
        } else if (n1<n3 & n3<n2){
            System.out.println("la combinacion de menor a mayor es la siguiente: "+n1+", "+n3+", "+n2);
        }else if (n2<n1 & n1<n3){
            System.out.println("la combinacion de menor a mayor es la siguiente: "+n2+", "+n1+", "+n3);
        }else if (n2<n3 & n3<n1){
            System.out.println("la combinacion de menor a mayor es la siguiente: "+n2+", "+n3+", "+n1);
        } else if (n3<n1 & n1<n2) {
            System.out.println("la combinacion de menor a mayor es la siguiente: "+n3+", "+n1+", "+n2);
        } else if (n3<n2 & n2<n1) {
            System.out.println("la combinacion de menor a mayor es la siguiente: "+n3+", "+n2+", "+n1);
        }

        //método ternario
        int min = (n1<n2 && n1<n3)?n1:(n2<n1 && n2<n3)?n2:n3;
        int mid = (n1 > n2)? ((n1 < n3) ? n1 : (n2 > n3) ? n2 : n3): ((n2 < n3) ? n2 : (n1 > n3) ? n1 : n3);
        int max = (n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3)?n2:n3;
        System.out.println("de mayor a menor a travez del modo ternario es " +min+", "+mid+", "+max);
    }
}