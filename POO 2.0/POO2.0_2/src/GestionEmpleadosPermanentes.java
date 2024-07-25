import java.util.ArrayList;

public class GestionEmpleadosPermanentes extends GestionEmpleados {
    ArrayList<EmpleadoPermanente> empleadosPermanentes;

    public GestionEmpleadosPermanentes() {
        this.empleadosPermanentes = new ArrayList<>();
    }
    //Add
    public void Agregar(EmpleadoPermanente empleadoPermanente) {
        empleadosPermanentes.add(empleadoPermanente);
    }
    //Delete
    public void Eliminar(EmpleadoPermanente empleadoPermanente) {
        empleadosPermanentes.remove(empleadoPermanente);
    }
    //Show
    @Override
    public void Mostrar() {
        for (EmpleadoPermanente empleadoPermanente : empleadosPermanentes) {
            System.out.println(empleadoPermanente);
        }
    }
}
