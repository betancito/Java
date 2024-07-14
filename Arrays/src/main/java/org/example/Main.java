package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[][]traspose(int[][]matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                transMatrix[i][j]=matrix[j][i];
            }
        }
        return transMatrix;
    }
    public static boolean isSimetric(int[][]matrix,int[][]matrix2){
        if (matrix==matrix2){
            return true;
        }else {
            return false;
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

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
//        System.out.println("Hello and welcome to the app to enter a desired text and then find a word in within that text \nNext up Please provide the desired text");
//        String text = scanner.next().toLowerCase();
//        scanner.nextLine();
//        System.out.println();
//        System.out.println("Now type the word you want to find in within that text");
//        String word = scanner.next().toLowerCase();
//        System.out.println();
//        int index = text.indexOf(word);
//        int lastIndex = index+word.length()-1;
//        System.out.println("The first index of the world "+word+" is: "+index);
//        System.out.println("The last index of the world "+word+" is: "+lastIndex);
        //Crea un array de Strings (por ejemplo, nombres) y pide al usuario que
        //ingrese un nombre. Busca ese nombre en el array que imprima si se
        //encuentra la posición y si no un mensaje que no se encuentra.
//        String[] names = {
//                "Alice",
//                "Bob",
//                "Charlie",
//                "David",
//                "Emma",
//                "Frank",
//                "Grace",
//                "Henry",
//                "Isabella",
//                "Jack"
//        };
//        System.out.println("Hello and welcome to the app to find out if your name is on the list \nNext up Please provide your name");
//        String userName = scanner.next().toLowerCase();
//        boolean found = false;
//        for (String name:names) {
//            name=name.toLowerCase();
//            if (name.equals(userName)){
//                System.out.println("Your name is on the list, you can proceed to enter to the Party!");
//                found = true;
//            }
//        }
//        if (!found){
//            System.out.println("Your name is not on the list, go away please");
//        }
        //Crea un programa en Java que calcule la transpuesta de una matriz
        //(intercambiar filas por columnas).
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        System.out.println("Hello and welcome to the app to transpose a matrix");
//        System.out.println();
//        System.out.println("here you have the normal matrix: ");
//        printMatrix(matrix);
//        System.out.println();
//        System.out.println("Here you have the transposed matrix");
//        printMatrix(traspose(matrix));
//        //Crea un programa en Java que verifique si una matriz cuadrada es
//        //simétrica (igual a su transpuesta, Ejercicio 7).
//        int[][] symmetricalMatrix ={
//                {1,2,3},
//                {2,5,0},
//                {3,0,5}
//        };
//        System.out.println("Next up we have the following 2 matrix");
//        System.out.println("1");
//        printMatrix(matrix);
//        System.out.println();
//        System.out.println("2");
//        printMatrix(symmetricalMatrix);
//        System.out.println();
//        System.out.println("the first matrix is not symmetrical but the second one is. next up you'll see the matrix 2 transposed");
//        printMatrix(traspose(symmetricalMatrix));
        //Crea un programa que mire dentro de un array, si hay elementos
        //repetidos y los cuente e imprima en pantalla en orden del elemento
        //que más se repite al que menos.
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 14, 15, 2, 16, 17, 18};
//        int maxNum = array[0];
//        for (int num:array) {
//            if(num>maxNum){
//                maxNum=num;
//            }
//        }
//        int[] newArray = new int[maxNum];
//        for (int i = 0; i < maxNum; i++) { //DESPUÉS DE INTENTARLO MUCHAS VECES NO LOGRE QUE ACOMODARA LAS OCURRENCIAS DE MAYOR A MENOR
//            newArray[i] = i+1;
//        }
//        System.out.println(Arrays.toString(newArray));
//        int [][] counter = new int[maxNum][2];
//        for(int i=0;i<newArray.length;i++){
//            counter [i][0] = i+1;
//            int num = newArray[i];
//            for (int j = 0; j < array.length; j++) {
//                int value = array[j];
//                if (num== value){
//                    counter[i][1]=counter[i][1]+1;
//                }
//            }
//        }
//        printMatrix(counter);
        //Escribe un programa en Java que invierta el orden de los elementos
        //en un array de números enteros.(Sin métodos)
//        int [] numArray = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.print(numArray[i]+", ");
//        }
//        System.out.println();
//        int lenarr = numArray.length;
//        for (int i = 0; i < (lenarr/2) ; i++) {
//            int temp = numArray[i];
//            numArray[i] = numArray[lenarr-1-i];
//            numArray[lenarr-1-i] = temp;
//        }
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.print(numArray[i]+", ");
//        }
        //Investigar que es un arraylists y hacer ejemplos con los tipos de datos
        //que se han visto hasta el momento, también mirar los métodos que
        //tienen y hacer ejemplos.
            //forma base
//        ArrayList<tipoElemento>nombreArraylist=new ArrayList<>();
            //int
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//        System.out.println("Arraylist Int "+intList);
//            //Float
//        ArrayList<Float> floatList = new ArrayList<>();
//        floatList.add(1.0f);
//        floatList.add(2.0f);
//        floatList.add(3.0f);
//        System.out.println(floatList);
//            //double
//        ArrayList<Double> doubleList = new ArrayList<>();
//        doubleList.add(1.00);
//        doubleList.add(2.00);
//        doubleList.add(3.00);
//        System.out.println(doubleList);
//            //char
//        ArrayList<Character> charList = new ArrayList<>();
//        charList.add('a');
//        charList.add('b');
//        charList.add('c');
//        System.out.println(charList);
//            //string
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.add("aaa");
//        stringList.add("bbb");
//        stringList.add("ccc");
//        System.out.println(stringList);
//            //boolean
//        ArrayList<Boolean>booleanList = new ArrayList<>();
//        booleanList.add(true);
//        booleanList.add(false);
//        System.out.println(booleanList);
//    //Metodos
//        //add(E e): Añade un elemento al final del ArrayList.
//        //add(int index, E element): Añade un elemento en una posición específica.
//        //get(int index): Devuelve el elemento en la posición especificada.
//        //set(int index, E element): Reemplaza el elemento en la posición especificada con el elemento dado.
//        //remove(int index): Elimina el elemento en la posición especificada.
//        //size(): Devuelve el número de elementos en el ArrayList.
//        //clear(): Elimina todos los elementos del ArrayList.
//        //isEmpty(): Devuelve true si el ArrayList está vacío.
//        //contains(Object o): Devuelve true si el ArrayList contiene el elemento especificado.
//    //Ejemplos Metodos
//        //Obtener tamaño Arraylist
//        System.out.println("Arraylist Boolean size "+booleanList.size());
//        //Obtener un elemento
//        System.out.println("Arraylist char at index 1 "+ charList.get(1));
//        //Modificar elemeto
//        charList.set(2, 'p');
//        System.out.println("Arraylist char at index 2 "+ charList.get(2));
//        //Eliminar Elemento
//        charList.remove(2);
//        System.out.println(charList);
//        //Verificar si contiene elemento
//        System.out.println("Stringlist includes aaa "+ stringList.contains("aaa"));
//        //limpiar el arraylist
//        intList.clear();
//        System.out.println("is the arraylist for int cleared? "+intList.isEmpty());
        //Investigar que es un maps y hacer ejemplos con los tipos de datos que
        //se han visto hasta el momento, también mirar los métodos que tienen
        //y hacer ejemplos.
            //forma base
//        Map<tipoDato, tipoDato...> mimapa = new HashMap<>();
        //int, string
//        Map<Integer, String> mapa1=new HashMap<>();
//            //Agregar items
//        mapa1.put(1,"uno");
//        mapa1.put(2,"dos");
//        mapa1.put(3,"tres");
//            //acceder a elementos
//        System.out.println(mapa1.get(1));
//            //eliminar elementos
//        mapa1.remove(3);
//            //Verificar si clave existe
//        boolean existe = mapa1.containsKey(2);
//        System.out.println("¿Existe la clave 2? "+existe);
//            //obtener numero elementos
//        int size = mapa1.size();
//        System.out.println("Tamaño mapa: "+ size);
        //Abstracción
        //La abstracción consiste en simplificar la complejidad del mundo real al modelar objetos en términos de sus características esenciales, sin incluir detalles innecesarios. En OOP, esto se logra mediante la creación de clases que definen las propiedades y comportamientos comunes de los objetos.
        //abstract class Animal {
        //    String nombre;
        //    int edad;
        //abstract void hacerSonido();
        //}
        //
        //class Perro extends Animal {
        //    void hacerSonido() {
        //        System.out.println("Guau");
        //    }
        //}
        //ENCAPSULAMIENTO
        //El encapsulamiento es el principio de ocultar los detalles internos de un objeto y exponer solo lo necesario a través de métodos públicos. Esto protege los datos y asegura que los objetos se manipulen de manera controlada.
    //class CuentaBancaria {
        //    private double saldo;
        //
        //    public void depositar(double cantidad) {
        //        if (cantidad > 0) {
        //            saldo += cantidad;
        //        }
        //    }
        //
        //    public double obtenerSaldo() {
        //        return saldo;
        //    }
        //}

        //HERENCIA
        //La herencia permite crear nuevas clases basadas en clases existentes, reutilizando y extendiendo su funcionalidad. Esto facilita la creación de jerarquías de clases y promueve la reutilización de código.
        //class Vehiculo {
        //    String marca;
        //    int año;
        //}
        //
        //class Coche extends Vehiculo {
        //    int numeroDePuertas;
        //
        //    void mostrarDetalles() {
        //        System.out.println("Marca: " + marca + ", Año: " + año + ", Puertas: " + numeroDePuertas);
        //    }
        //}
        //POLIMORFISMO
        //El polimorfismo permite que los objetos de diferentes clases se traten como objetos de una clase común. Esto se logra mediante la sobrecarga y la sobrescritura de métodos, permitiendo que el mismo método tenga diferentes comportamientos según el objeto que lo invoque.
        //class Animal {
        //    void hacerSonido() {
        //        System.out.println("Sonido de animal");
        //    }
        //}
        //
        //class Gato extends Animal {
        //    void hacerSonido() {
        //        System.out.println("Miau");
        //    }
        //}
        //
        //public class Main {
        //    public static void main(String[] args) {
        //        Animal miAnimal = new Gato();
        //        miAnimal.hacerSonido();  // Salida: Miau
        //    }
        //}
    }
}


