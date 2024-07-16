import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a MutualMotors software ");
        System.out.println("Por favor Ingrese el numero de mecanicos disponibles para los trabajos");
        int maxEmployees = scanner.nextInt();
        String[][][] works = new String[maxEmployees][2][4];
        boolean cond = false;
        int numWork = 0;
        //Ingreso empleados y número de trabajos
        while (cond != true) {
            System.out.println("Ingrese el numero de trabajos a registrar, recuerde que no debe de exeder el numero de mecanicos");
            numWork = scanner.nextInt();
            if (numWork <= maxEmployees && numWork != 0){
                cond = true;
            }else{
                System.out.println("Numero de trabajos introducido no valido o exede el numero de mecanicos");
                cond = false;
            }
        }
        //Ingreso información
        for (int i = 0; i < numWork; i++) {
            System.out.println("Ingrese el nombre del empleado");
            String mechName = scanner.next();
            scanner.nextLine();
            System.out.println();
            System.out.println("Ingrese el tipo de vehiculo Moto/Carro");
            String typeVeh= scanner.next();
            scanner.nextLine();
            System.out.println();
            System.out.println("Ingrese la Marca");
            String brandVeh = scanner.next();
            scanner.nextLine();
            System.out.println();
            System.out.println("Ingrese el modelo");
            String modVeh = scanner.next();
            scanner.nextLine();
            System.out.println();
            System.out.println("Ingrese el año");
            String yearVeh = scanner.next();
            scanner.nextLine();
            System.out.println();
            System.out.println("Ingrese el estado Pendiente/En reparación/Reparado)");
            String status = scanner.next();
            scanner.nextLine();
            System.out.println();
        }

    }
}