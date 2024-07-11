package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static boolean Prime(int num){
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Crea un programa e imprima los primeros “n” números primos.
//        System.out.println("Hello and welcome to the program to print the amount of prime numbers you want \nNext up please provide the amnout of prime numbers you want:");
//        int n = scanner.nextInt();
//        int count = 0;
//        int num = 2;
//        boolean cond = false;
//        while (count < n) {
//            if (Prime(num)) {
//                System.out.println(num);
//                count ++;
//            }
//                num ++;
//        }
        //Crea un programa que pida al usuario un número e imprima la tabla
        //de multiplicar del 1 al 10 del número ingresado.
//        System.out.println("Hello and welcome to the program to print the multiplication table from 1 tru 10 of the desired number \nNext up please provide the desired number");
//        int n = scanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            int sol = n*i;
//            System.out.printf("%d * %d = %d \n",n,i,sol);
//        }
        //Crea un programa e imprima los primeros “n” números de Fibonacci.
        System.out.println("Hello and welcome to the program to print the desired amount of Fibonacci numbers \nNext up provide the desired amount of Fibonacci numbers");
        int amnt = scanner.nextInt();
        int i = 0;
        int f = 1;
        int s = 0;
        int e = 0;
        while (e<amnt){
            s = i+f;
            i = f;
            f = s;
            e++;
            System.out.println(f);
        }
    }
}