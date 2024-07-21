public class Empleado extends Persona{
    private Integer id;
    private Integer salario;
    //constructor empleado
    public Empleado(String nombre, int edad, int id, int salario){
        super(nombre,edad);
        this.id = id;
        this.salario = salario;
    }
}
