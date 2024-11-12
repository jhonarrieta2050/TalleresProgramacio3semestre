package Taller6_This.Estudiantes;

public class Estudiante {
    private String nombre;
    private int edad;


    public Estudiante() {
        this("Nombre desconocido", 18);
    }


    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void mostrarDetalles() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad);
    }
}