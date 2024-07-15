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
        for (int i = 0; i < numWork; i++) {
            System.out.println("Ingrese el nombre del empleado");
            String mechName = scanner.next();
            scanner.nextLine();
            System.out.println();
            System.out.println("");
        }

    }
}