package Classes;

import java.util.ArrayList;

public class GestionCursos {
    ArrayList<Curso> listaCursos;

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
    }

    //Enlistar estudiantes de curso
    public void enlistarEstudiantesDeCurso(Integer codigo) {
        for (Curso curso : this.listaCursos) {
            if (curso.getCodigo().equals(codigo)) {
                curso.listarEstudiantes();
            }
        }
    }

    //Enlistar Curso
    public void listarCursos(){
        for (Curso curso : this.listaCursos){
            System.out.println(curso.toString());
        }
    }
    //Buscar Curso
    public Curso buscarCursoPorCodigo(Integer codigo){
        Curso curso1 = null;
        for (Curso curso : this.listaCursos) {
            if (curso.getCodigo().equals(codigo)) {
                curso1 = curso;
            }
        }
        return curso1;
    }
}