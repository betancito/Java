import Classes.Curso;
import Classes.Estudiante;
import Classes.GestionCursos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Estudiante estudiante = new Estudiante(1,"Julian","xd@email.com");
//        Estudiante estudiante2 = new Estudiante(2,"Sara","xdd@email.com");
//        Estudiante estudiante3 = new Estudiante(3,"Jose","xddd@email.com");
//        Curso Ingles = new Curso();
//        Ingles.setNombre("Ingles");
//        Ingles.setCodigo(2002);
//        Curso Español = new Curso();
//        Español.setNombre("Español");
//        Español.setCodigo(2003);
//        GestionCursos IEbarros = new GestionCursos();
//        IEbarros.agregarCurso(Ingles);
//        IEbarros.agregarCurso(Español);
//        IEbarros.inscribirPorCodigo(2002, estudiante);
//        IEbarros.inscribirPorCodigo(2003, estudiante2);
//        IEbarros.inscribirPorCodigo(2003, estudiante3);
//        IEbarros.inscribirPorCodigo(2002, estudiante3);
//        IEbarros.inscribirPorCodigo(2003, estudiante);
////        IEbarros.enlistarEstudiantesDeCurso(2002);
//        IEbarros.enlistarEstudiantesDeCurso(2003);
        System.out.println("Bienvenido a la app para manejar tus estudiantes y cursos.");
        Scanner scanner = new Scanner(System.in);
        GestionCursos gestion = new GestionCursos();
        boolean cond = false;
        while (!cond){
            System.out.println("A continuación ingrese que desea hacer \n0. Registrar cursos \n1. Registrar estudiantes dentro de un curso");
            int op = scanner.nextInt();
            switch (op){
                case 0:
                    System.out.println("Defina la cantidad de cursos a ingresar");
                    int amnt = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < amnt; i++) {
                        //Recolectar codigo curso
                        System.out.println("Ingrese el codigo del curso: ");
                        int code = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();
                        //Recolectar Nombre curso
                        System.out.println("Ingrese el nombre del curso: ");
                        String name = scanner.next();
                        scanner.nextLine();
                        //Set curso
                        Curso curso = new Curso();
                        curso.setCodigo(code);
                        curso.setNombre(name);
                        //add curso to gestion
                        gestion.agregarCurso(curso);
                    }
                    gestion.listarCursos();
                case 1:
//                    System.out.println("Ingrese la cantidad de estudiantes a ingresar (los ids serán asignados automaticamente): ");
//                    int count = scanner.nextInt()+ gestion.length();
//                    for (int i = gestion.length(); i < count+ gestion.length(); i++) {
//                        //Recolectar nombre
//                        System.out.println("Ingrese el nombre del estudiante: ");
//                        String name = scanner.next();
//                        scanner.nextLine();
//                        System.out.println();
//
//                        //Recolectar email
//                        System.out.println("Ingrese el email del estudiante: ");
//                        String email = scanner.next();
//                        scanner.nextLine();
//                        System.out.println();
//                        System.out.println("--Siguiente estudiante--");
//                        Estudiante estudiante = new Estudiante(i,name,email);
//                        System.out.println(estudiante);
                    }
            }
        }
    }