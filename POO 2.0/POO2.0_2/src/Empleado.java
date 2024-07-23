public class Empleado extends Persona{
    private Integer id;
    private Integer salario;
    //constructor empleado
    public Empleado(){};
    public Empleado(String nombre, int edad, int id, int salario){
        super(nombre,edad);
        this.id = id;
        this.salario = salario;
    }
    //getters
    public Integer getId(){
        return this.id;
    }
    public Integer getSalario(){
        return this.salario;
    }
    //setters

    public void setId(int id){
        this.id=id;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    //toString
    @Override
    public String toString() {
        return "Empleado: "+ " Nombre: "+getNombre() +" Edad: "+getEdad()+ " Id: "+ getId()+ " Salario: "+ getSalario();
    }
}
