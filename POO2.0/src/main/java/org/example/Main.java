package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//    Producto producto1 = new Producto(0,"leche",2300);
//    Producto producto2 = new ProductoEspecifico(1, "Jamon",5000,"carne fria","zenu");
//    Producto producto3 = new Producto(2, "Condones", 7000);
//    Inventario nevera = new Inventario();
//    nevera.agregarProducto(producto1);
//    nevera.agregarProducto(producto2);
//    nevera.agregarProducto(producto3);
//    nevera.listarProductos();
//        System.out.println();
//    nevera.eliminarProducto(producto1);
//    nevera.listarProductos();
//        System.out.println();
//    nevera.buscarPorNombre("Jamon");
//    nevera.buscarPorNombre("Leche");
//    nevera.buscarPorCategoria("carne fria");
//    nevera.buscarPorCategoria("Lacteo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicacion de gestión de inventario a continuación ingrese el numero de productos que desea agregar (Los ids se asignaran automaticamente a medida que agregue productos):");
        int numProd = scanner.nextInt();
        //definir arraylist inventario para almacenar productos a ingresar
        Inventario inventario = new Inventario();

        for (int i = 1; i <= numProd; i++) {
            System.out.println("INGRESE EL TIPO DE PRODUCTO \n1. Producto normal \n2. Producto detallado");
            int type = scanner.nextInt();
            switch (type){
                case 1:
                    //recolectar nombre producto
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = scanner.next();
                    scanner.nextLine();
                    System.out.println();
                    //Recolectar precio
                    System.out.println("Ingrese el precio del producto");
                    int precio = scanner.nextInt();
                    System.out.println();
                    //ingresar producto al arraylist
                    Producto producto = new Producto(i,nombre,precio);
                    inventario.agregarProducto(producto);
                    break;
                case 2:
                    //recolectar nombre producto
                    System.out.println("Ingrese el nombre del producto:");
                    String nombreDetallado = scanner.next();
                    scanner.nextLine();
                    System.out.println();
                    //Recolectar precio
                    System.out.println("Ingrese el precio del producto");
                    int precioDetallado = scanner.nextInt();
                    System.out.println();
                    //Recolectar categoria
                    System.out.println("Ingrese la categoría del producto");
                    String categoria = scanner.next();
                    scanner.nextLine();
                    System.out.println();
                    //Recolectar Marca
                    System.out.println("Ingrese la marca");
                    String marca = scanner.next();
                    scanner.nextLine();
                    System.out.println();
                    //ingresar producto al arraylist
                    Producto productoDetallado = new ProductoEspecifico(i,nombreDetallado,precioDetallado,categoria,marca);
                    inventario.agregarProducto(productoDetallado);
                    break;
            }

        }
        boolean cond = true;
        while (cond){
            System.out.println("A continuación elija que quiere hacer \n0.Listar productos \n1.Buscar producto por nombre \n2.Buscar producto por categoría \n3.Eliminar producto  \n4. Salir");
            int op = scanner.nextInt();
            switch (op){
                case 0:
                    inventario.listarProductos();
                    break;
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    String name = scanner.next();
                    scanner.nextLine();
                    inventario.buscarPorNombre(name);
                    break;
                case 2:
                    System.out.println("Ingrese la categoria del producto");
                    String categoria = scanner.next();
                    scanner.nextLine();
                    inventario.buscarPorCategoria(categoria);
                    break;
                case 3:
                    System.out.println("Ingrese el id del producto a eliminar");
                    int id = scanner.nextInt();
                    inventario.eliminarProductoPorId(id);
                    break;
                case 4:
                    cond = false;
            }
        }

    }
}