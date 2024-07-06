package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvcenido al programa mes-día ingresa el numero del mes que quieras saber elnumero de días que tiene");
        int NumDia=0;
        String mes="";
        int num = scanner.nextInt();
        switch (num){
            case 1:
                NumDia=31;
                break;
            case 2:
                NumDia=28;
                break;
            case 3:
                NumDia=31;
                break;
            case 4:
                NumDia=30;
                break;
            case 5:
                NumDia=31;
                break;
            case 6:
                NumDia=30;
                break;
            case 7:
                NumDia=31;
                break;
            case 8:
                NumDia=31;
                break;
            case 9:
                NumDia=30;
                break;
            case 10:
                NumDia=31;
                break;
            case 11:
                NumDia=30;
                break;
            case 12:
                NumDia=31;
                break;
        }
        switch (num){
            case 1:
                mes="Enero";
                break;
            case 2:
                mes="Febrero";
                break;
            case 3:
                mes="Marzo";
                break;
            case 4:
                mes="Abril";
                break;
            case 5:
                mes="Mayo";
                break;
            case 6:
                mes="Junio";
                break;
            case 7:
                mes="Julio";
                break;
            case 8:
                mes="Agosto";
                break;
            case 9:
                mes="Septiembre";
                break;
            case 10:
                mes="Octubre";
                break;
            case 11:
                mes="Noviembre";
                break;
            case 12:
                mes="Diciembre";
                break;
        }
        System.out.printf("El mes %d correspondiente a %s tiene una cantidad de %d días", num, mes, NumDia);
    }
}