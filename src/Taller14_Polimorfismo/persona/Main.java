package Taller14_Polimorfismo.persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.presentarse();


        Persona estudiante = new Estudiante();
        estudiante.presentarse();


        Persona profesor = new Profesor();
        profesor.presentarse();
    }
}