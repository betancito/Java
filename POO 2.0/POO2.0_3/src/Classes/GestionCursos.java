package Classes;

import java.util.ArrayList;

public class GestionCursos {
    private ArrayList<Curso> listaCursos;
    public GestionCursos() {
        this.listaCursos = new ArrayList<>();
    }

    //add student to the course
    public void agregarCurso(Curso curso) {
        this.listaCursos.add(curso);
    }

    // Sign student into a coure by course code
    public void inscribirPorCodigo(Integer codigo, Estudiante estudiante) {
        for (Curso curso : this.listaCursos) {
            if (curso.getCodigo().equals(codigo)) {
                curso.inscribirEstudiante(estudiante);
            }
        }
        System.out.println("Curso no encontrado");
    }

    //Enlistar estudiantes de curso
    public void enlistarEstudiantesDeCurso(Integer codigo) {
        for (Curso curso : this.listaCursos) {
            if (curso.getCodigo().equals(codigo)) {
                curso.listarEstudiantes();
            }
        }
    }
}
