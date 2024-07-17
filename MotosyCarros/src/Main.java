import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a MutualMotors software ");
        System.out.println("Por favor Ingrese el numero de mecanicos disponibles para los trabajos");
        int maxEmployees = scanner.nextInt();
        //Creacion array tridimensional
        String[][][] works = new String[maxEmployees][2][4];
        boolean cond = false;
        int numWork = 0;
        //Ingreso empleados y número de trabajos
        while (cond != true) {
            System.out.println("Ingrese el numero de trabajos a registrar, recuerde que no debe de exeder el numero de mecanicos");
            numWork = scanner.nextInt();
            if (numWork <= maxEmployees && numWork != 0) {
                cond = true;
            } else {
                System.out.println("Numero de trabajos introducido no valido o exede el numero de mecanicos");
                cond = false;
            }
        }
        //Bucle ingreso de informacion dependiendo el numero de trabajos a ingresar
        for (int i = 0; i < numWork; i++) {
            //Agregar mech al array
            System.out.println("Ingrese el nombre del mecánico");
            String mechName = scanner.next();
            scanner.nextLine();
            System.out.println();

            //Seleccionar tipo vehiculo
            System.out.println("Ingrese el tipo de vehiculo Moto/Carro");
            String typeVeh = scanner.next();
            scanner.nextLine();
            int type = typeVeh.equalsIgnoreCase("Moto") ? 0 : 1;
            System.out.println();


            //Asignar marca al vehiculo
            System.out.println("Ingrese la Marca");
            String brandVeh = scanner.next();
            scanner.nextLine();
            works[i][type][0] = brandVeh;
            System.out.println();

            //Asignar modelo vehiculo
            System.out.println("Ingrese el modelo");
            String modVeh = scanner.next();
            scanner.nextLine();
            works[i][type][1] = modVeh;
            System.out.println();

            //Asignar año del veh
            System.out.println("Ingrese el año");
            String yearVeh = scanner.next();
            scanner.nextLine();
            works[i][type][2] = yearVeh;
            System.out.println();

            //Estado veh
            System.out.println("Ingrese el estado Pendiente/En reparación/Reparado)");
            String status = scanner.next();
            scanner.nextLine();
            works[i][type][3] = status;
            System.out.println();
        }

        //Mostrar tabla de información
        System.out.println("Agenda de trabajos MutualMotors");
        System.out.println("| Tipo | Marca | Modelo | Año | Estado |");
        System.out.println("|------|-------|--------|-----|--------|");
        for (int i = 0; i <numWork ; i++) {
                if (works[i][0][0] != null) {
                    String type = "Moto";
                System.out.printf("| %s | %s | %s | %s | %s |\n", type, works[i][0][0], works[i][0][1], works[i][0][2], works[i][0][3]);
                } else if (works[i][1][0] != null) {
                    String type = "Carro";
                    System.out.printf("| %s | %s | %s | %s | %s |\n", type, works[i][1][0], works[i][1][1], works[i][1][2], works[i][1][3]);
            }
        }
        System.out.println();
        boolean chose = false;
        while (!chose) {
            System.out.println("Ingrese que desea hacer \n1.Buscar vehiculo \n2.Acualizar vehiculo \n3.Salir");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                //Buscar Vehiculo
                System.out.println("Ingrese la marca del vehiculo a buscar");
                String brandVeh = scanner.next();
                scanner.nextLine();

                System.out.println("Ingrese el modelo del vehiculo a buscar");
                String modVeh = scanner.next();
                scanner.nextLine();

                boolean found = false;
                while (!found) {
                    for (int i = 0; i < numWork; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (works[i][j][0] != null && works[i][j][0].equalsIgnoreCase(brandVeh) && works[i][j][1].equalsIgnoreCase(modVeh)) {
                                System.out.printf("Vehículo encontrado: %s %s %s %s\n", works[i][j][0], works[i][j][1], works[i][j][2], works[i][j][3]);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Vehiculo no encontrado");
                        }
                    }
                }
                    break;
                case 2:
                    //Actualizar estado vehiculo
                    System.out.println("Ingrese la marca del vehiculo a Actualizar el estado");
                    String brandVeh1 = scanner.next();
                    scanner.nextLine();

                    System.out.println("Ingrese el modelo del vehiculo a Actualizar el estado");
                    String modVeh1 = scanner.next();
                    scanner.nextLine();
                    boolean found1 = false;
                    while (!found1) {
                        for (int i = 0; i < numWork; i++) {
                            for (int j = 0; j < 2; j++) {
                                if (works[i][j][0] != null && works[i][j][0].equalsIgnoreCase(brandVeh1) && works[i][j][1].equalsIgnoreCase(modVeh1)) {
                                    System.out.println("Ingrese el nuevo estado del vehiculo ingresado");
                                    String newStatus = scanner.next();
                                    works[i][j][3] = newStatus;
                                    System.out.printf("Estado de vehiculo actualizado: %s %s %s %s\n", works[i][j][0], works[i][j][1], works[i][j][2], works[i][j][3]);
                                    found1 = true;
                                }
                            }
                            if (!found1) {
                                System.out.println("Vehiculo no encontrado");
                            }
                        }
                    }
                    break;
                case 3:
                    chose = true;
            }
        }
    }
}
