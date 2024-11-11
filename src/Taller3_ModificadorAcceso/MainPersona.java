package Taller3_ModificadorAcceso;

public class MainPersona {
    public static void main(String[] args) {

        Persona persona = new Persona("Carlos", 25);

        System.out.println("Edad: " + persona.edad);

        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Andres");
        System.out.println("Nuevo Nombre: " + persona.getNombre());

        // persona.nombre = "Juan";
    }
}