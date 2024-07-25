import java.util.ArrayList;

public abstract class GestionEmpleados {
    private ArrayList<Persona> personas;
    //constructor
    public GestionEmpleados() {
        personas = new ArrayList<>();
    }
    //Add
    public void Agregar(Persona persona) {
        personas.add(persona);
    }
    //Delete
    public void Eliminar(Persona persona) {
        personas.remove(persona);
    }
    //Show
    public void Mostrar() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
