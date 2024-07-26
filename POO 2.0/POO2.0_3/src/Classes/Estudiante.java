package Classes;

import java.io.PushbackInputStream;

public class Estudiante {
    //Atributes
    Integer id;
    String nombre;
    String email;
    //Constructor
    public Estudiante (){ }
    public Estudiante(Integer id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    //setter
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //getters
    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    //tostring
    public String toString() {
        return "Estudiante [id=" + getId() + ", nombre=" + getNombre() + ", email=" + getEmail() + "]";
    }
}
