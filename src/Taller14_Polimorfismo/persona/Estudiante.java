package Taller14_Polimorfismo.persona;

public class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }

    public void presentarse2() {
        System.out.println("Hola, soy un estudiante.");
    }
}