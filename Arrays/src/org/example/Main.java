package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Este ejercicio propone la creación de un programa que presente al
        //usuario un menú interactivo para realizar operaciones matemáticas
        //básicas como suma, resta, multiplicación y división.
//        System.out.println("Hello and welcome to the simple calculator.\nNext up please select what you want to do:\n1. Addition\n2. Subtraction\n3. multiplication\n4. Division");
//        int op = scanner.nextInt();
//        System.out.println("Please provide the first operator");
//        int num1 = scanner.nextInt();
//        System.out.println("Please provide the second operator");
//        int num2 = scanner.nextInt();
//        float sol = 0;
//        switch (op){
//            case 1:
//                sol=num1+num2;
//                System.out.println(num1+"+"+num2+"="+sol);
//                break;
//            case 2:
//                sol=num1-num2;
//                System.out.println(num1+"-"+num2+"="+sol);
//                break;
//            case 3:
//                sol=num1*num2;
//                System.out.println(num1+"*"+num2+"="+sol);
//                break;
//            case 4:
//                sol=(float)num1/num2;
//                System.out.println(num1+"/"+num2+"="+sol);
//                break;
//        }
        //Un cliente realiza una compra en una tienda. El programa proporciona
        //un array de productos y un array de precios. Se requiere pedir al
        //usuario la cantidad de cada producto que desea comprar, para
        //posteriormente imprimir el valor total de la factura.
//        System.out.println("Hello and welcome to the cashier app. Next up you'll see the products list with each price");
//        String[] groceryProducts = {
//                "Apples",
//                "Milk",
//                "Bread",
//                "Eggs",
//                "Cheese",
//                "Chicken",
//                "Rice",
//                "Tomatoes",
//                "Bananas",
//                "Yogurt"
//        };
//        double[] groceryPrices = {
//                20.49,
//                10.99,
//                20.29,
//                30.49,
//                40.99,
//                70.99,
//                10.79,
//                10.69,
//                5.79,
//                9.99
//        };
//        for (int i = 0; i < groceryProducts.length; i++) {
//            String product = groceryProducts[i];
//            double price = groceryPrices[i];
//            System.out.println(i+" -"+product+" :: $"+price);
//        }
//        double total = 0;
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Next up please select what do you want to do \n1. Buy an item \n2. See total to pay \n3. Exit");
//            int op = scanner.nextInt();
//            if (op==1){
//                System.out.println("Please provide the index of the product to be bought");
//                int product = scanner.nextInt();
//                System.out.println("Please provide the amount of that following item");
//                int amount = scanner.nextInt();
//                total = total+(groceryPrices[product]*amount);
//            } else if (op==2) {
//                double totalDiscounted = 0;
//                double totalDiscount;
//                String discountAmnt = "";
//                if(total<200){
//                    totalDiscounted=total;
//                    discountAmnt = "0%";
//                } else if (total>=200 && total<300) {
//                    totalDiscount=(total*0.1);
//                    totalDiscounted = total-totalDiscount;
//                    discountAmnt = "10%";
//                }else if (total>=300 && total<500){
//                    totalDiscount=(total*0.15);
//                    totalDiscounted = total-totalDiscount;
//                    discountAmnt = "15%";
//                } else if (total>=500&&total<1000) {
//                    totalDiscount=(total*0.2);
//                    totalDiscounted = total-totalDiscount;;
//                    discountAmnt = "20%";
//                } else if (total>=1000) {
//                    totalDiscount=(total*0.25);
//                    totalDiscounted = total-totalDiscount;
//                    discountAmnt = "25%";
//                }
//                System.out.println("Your total is: $"+total+" but after a discount of "+discountAmnt+" Your new total will be $"+totalDiscounted);
//            }else{
//                break;
//            }
//        }
        //Crea un programa que calcula la calificación promedio que se necesita
        //obtener en las notas faltantes de un curso para aprobarlo,
        //considerando la cantidad de calificaciones totales, las calificaciones ya
        //obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
        //notas faltantes. Importante: el total de notas del curso será de 8 notas,
        //la calificación será de 0 a 100 y el promedio mínimo para aprobar el
        //curso es de 76
//        System.out.println("Hello and welcome to the app to see how much you'll have to score in order to pass the course");
//        double total = 0;
//        int totalNotas = 8;
//        int expectedTotal = 608;
//        for (int i = 1; i < 8; i++) {
//            System.out.println("Please select what you want to do \n1. Submit a grade \n2. See remaining notes you'll have to score in order to pass \n3. Exit \nIT'S IMPORTANT TO KNOW THAT YOU'LL NEED TO SUBMIT THE GRADES BEFORE SEEING THE REMAINING OTHERWISE IT WON'T WORK");
//            System.out.println();
//            int op = scanner.nextInt();
//            if (op == 1){
//                System.out.println("Please provide the grade:");
//                double grade = scanner.nextDouble();
//                total = total+grade;
//                System.out.println();
//            } else if (op==2){
//                    double remainingProm = expectedTotal-total;
//                    double remainingNotes = totalNotas-(i-1);
//                    double remainingGrades = remainingProm/remainingNotes;
//                    System.out.println("You'll have to score at least "+remainingGrades+" In each grade to achieve a prom of 76");
//                    break;
//            }else {
//                break;
//            }
        //Crea un programa que calcule los descuentos por compras(Ejercicio 2)
        //en una tienda, donde se aplica un porcentaje de descuento en función
        //del monto total de la compra, con rangos de precios personalizados.
                //Go back to exercise #2 and you'll find the discounts code being applied there

        //Un programa que permita al usuario ingresar un texto y luego le da la
        //opción de buscar una palabra específica, mostrando como resultado
        //el rango de posiciones donde se encontró la palabra exacta. (Sin darle
        //importancia a mayúsculas o minúsculas)
    }
}
