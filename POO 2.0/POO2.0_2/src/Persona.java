import java.security.PrivateKey;

public class Persona {
    private String nombre;
    private Integer edad;
    //Constructor Persona
    public Persona(){};
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }
    public Integer getEdad(){
        return this.edad;
    }
    //setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    //toString
    @Override
    public String toString() {
        return "Persona: "+"Nombre: "+ getNombre() + "Edad: "+ getEdad();
    }
}
