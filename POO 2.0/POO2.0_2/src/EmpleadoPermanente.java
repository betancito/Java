public class EmpleadoPermanente extends Empleado{
    private String beneficios;
    public EmpleadoPermanente(){}
    public EmpleadoPermanente(String nombre, int edad, int id, int salario,String beneficios) {
        super(nombre, edad, id, salario);
        this.beneficios=beneficios;
    }
    //setters
    public void setBeneficios(String beneficios){
        this.beneficios=beneficios;
    }
    //getters
    public String getBeneficios(){
        return beneficios;
    }
    //toString

    @Override
    public String toString() {
        return "EmpleadoPermanente: " + " Nombre: " + getNombre() + " Edad: "+ getEdad() + " Salario: " + getSalario() + " Id: " + getId() + " Salario: "+ getSalario() + " Beneficios: "+ getBeneficios();
    }
}
