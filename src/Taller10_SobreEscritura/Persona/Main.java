package Taller10_SobreEscritura.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();


        Persona p1 = new Estudiante();
        Persona p2 = new Profesor();


        p1.presentarse();
        p2.presentarse();

        // Llamadas directas
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}