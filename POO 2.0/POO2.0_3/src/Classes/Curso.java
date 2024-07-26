package Classes;

import java.util.ArrayList;

public class Curso {
    private Integer codigo;
    private String nombre;
    private ArrayList<Estudiante> ListaEstudiantes;
    public Curso() {
        this.ListaEstudiantes = new ArrayList<>();
    }
    //Setters
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getters
    public Integer getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    //Inscirbir estudiante
    public void inscribirEstudiante(Estudiante estudiante) {
        ListaEstudiantes.add(estudiante);
    }
    public void listarEstudiantes() {
        for (Estudiante estudiante : ListaEstudiantes) {
            System.out.println(estudiante);
        }
    }
    public int length() {
        int count = 0;
        for (Estudiante estudiante : this.ListaEstudiantes) {
            count = count +1;
        }
        return count;
    }
    //toString
    public String toString(){
        return "Curso || Nombre: " + getNombre() + "|| Código: " + getCodigo();
    }
}
