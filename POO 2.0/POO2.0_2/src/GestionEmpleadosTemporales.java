import java.util.ArrayList;

public class GestionEmpleadosTemporales extends GestionEmpleados{
        ArrayList<EmpleadoTemporal> empleadoTemporales;
        //constructor
        public GestionEmpleadosTemporales() {
            this.empleadoTemporales = new ArrayList<>();
        }
        //Add
        public void Agregar(EmpleadoTemporal empleadoTemporal) {
            empleadoTemporales.add(empleadoTemporal);
        }
        //Delete
        public void Eliminar(EmpleadoTemporal empleadoTemporal) {
            empleadoTemporales.remove(empleadoTemporal);
        }
        //Show
        @Override
        public void Mostrar() {
            for (EmpleadoTemporal empleadoTemporal : empleadoTemporales ) {
                System.out.println(empleadoTemporal);
            }
        }
    }
