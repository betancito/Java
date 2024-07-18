package org.example;
public class Libro {
    public String titulo;
    public String autor;
    public String añoPublicacion;
    public Boolean prestado = false;




     public Libro(String titulo, String autor, String añoPublicacion, boolean prestado){
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        this.prestado = prestado;
    }
    void prestar(){
         this.prestado=true;
    }
    void devolver(){
         this.prestado=false;
    }
    void isPrestado(){
         if (this.prestado){
             System.out.println("El libro ya está prestado");
         } else if (!this.prestado) {
             System.out.println("El libro no está prestado");
         }
    }
}
