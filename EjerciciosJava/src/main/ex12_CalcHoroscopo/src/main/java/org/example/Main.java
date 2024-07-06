package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app para saber tu signo según tu día y mes de nacimiento");
        System.out.println("A continuación ingresa el mes en que naciste con valor numérico: ");
        int month = scanner.nextInt();
        System.out.println("A cotinuación ingresa el día en el que naciste: ");
        int day = scanner.nextInt();
        
        if (month==1&&day<=20){
            System.out.println("Tu signo es Capricornio");
        }else if (month==1&& day>=21){
            System.out.println("Tu signo es Acuario");
        } else if (month==2&&day<=19) {
            System.out.println("tu signo es Acuario");
        }else if (month==2&&day>=20){
            System.out.println("tu signo es Piscis");
        } else if (month==3&&day<=20) {
            System.out.println("tu signo es Piscis");
        } else if (month==3&&day>=21) {
            System.out.println("tu signo es Aries");
        } else if (month==4&&day<=20) {
            System.out.println("tu signo es Aries");
        } else if (month==4&&day>=21) {
            System.out.println("tu signo es Tauro");
        } else if (month==5&&day<=21) {
            System.out.println("tu signo es Tauro");
        } else if (month==5&&day>=22) {
            System.out.println("tu signo es Géminis");
        } else if (month==6&&day<=22) {
            System.out.println("tu signo es Géminis");
        } else if (month==6&&day>=23) {
            System.out.println("tu signo es Cáncer");
        } else if (month==7&&day<=23) {
            System.out.println("tu signo es Cáncer");
        } else if (month==7&&day>=24) {
            System.out.println("tu signo es Leo");
        } else if (month==8&&day<=23) {
            System.out.println("tu signo es Leo");
        } else if (month==8&&day>=24) {
            System.out.println("tu signo es virgo");
        } else if (month==9&&day<=23) {
            System.out.println("tu signo es virgo");
        } else if (month==9&&day>=24) {
            System.out.println("tu signo es Libra");
        } else if (month==10&&day<=23) {
            System.out.println("tu signo es Libra");
        } else if (month==10&&day>=24) {
            System.out.println("tu signo es Escorpio");
        } else if (month==11&&day<=22) {
            System.out.println("tu signo es Escorpio");
        } else if (month==11&&day>=23){
            System.out.println("tu signo es Sagitario");
        } else if (month==12&&day<=21) {
            System.out.println("tu signo es Sagitario");
        } else if (month==12&&day>=22) {
            System.out.println("Tu signo es Capricornio");
        }
    }   
}