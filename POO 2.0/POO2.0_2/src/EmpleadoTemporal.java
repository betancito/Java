public class EmpleadoTemporal extends Empleado{
    String duracionContrato;
    public EmpleadoTemporal(){}
    public EmpleadoTemporal(String nombre, int edad, int id, int salario, int numeroContrato) {
        super(nombre, edad, id, salario);
        this.numeroContrato=numeroContrato;
    }
    //setters
    public void setDuracionContrato(String duracionContrato){
        this.duracionContrato=duracionContrato;
    }
    //getter
    public String getDuracionContrato(){
        return this.duracionContrato;
    }
    //toString
    @Override
    public String toString() {
        return "EmpleadoPermanente: " + " Nombre: " + getNombre() + " Edad: "+ getEdad() + " Salario: " + getSalario() + " Id: " + getId() + " Salario: "+ getSalario() + " Duracion contrato: "+ getDuracionContrato();
    }
}
