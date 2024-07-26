import Classes.Curso;
import Classes.Estudiante;
import Classes.GestionCursos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Estudiante estudiante = new Estudiante(1,"Julian","xd@email.com");
        Estudiante estudiante2 = new Estudiante(2,"Sara","xdd@email.com");
        Estudiante estudiante3 = new Estudiante(3,"Jose","xddd@email.com");
        Curso Ingles = new Curso();
        Ingles.setNombre("Ingles");
        Ingles.setCodigo(2002);
        Curso Español = new Curso();
        Español.setNombre("Español");
        Español.setCodigo(2003);
        GestionCursos IEbarros = new GestionCursos();
        IEbarros.agregarCurso(Ingles);
        IEbarros.agregarCurso(Español);
        IEbarros.inscribirPorCodigo(2002, estudiante);
        IEbarros.inscribirPorCodigo(2003, estudiante2);
        IEbarros.inscribirPorCodigo(2003, estudiante3);
        IEbarros.inscribirPorCodigo(2002, estudiante3);
        IEbarros.inscribirPorCodigo(2003, estudiante);
//        IEbarros.enlistarEstudiantesDeCurso(2002);
        IEbarros.enlistarEstudiantesDeCurso(2003);
        boolean cond = false;
        while (!cond){
            System.out.println(Hello and welcome to the app to register );
        }
    }
}