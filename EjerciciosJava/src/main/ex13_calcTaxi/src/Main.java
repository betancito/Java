import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la app para determinar la tarifa d taxi en base a los km recorridos");
        System.out.println("A continuación ingrese la cantidad de Km recorridos,  \ncabe aclarar que la tarifa minima es de $7000COP  \ny si exede los 5km tendrá una tarifa de $5000COP por Km");
        float km = scanner.nextFloat();
        float price = 7000;
        if (km>5){
            price = price+(5000*(km-5));
        }
        System.out.println("El valor de su carrera de un total de "+km+"Km es de: $"+price+"COP");
    }
}