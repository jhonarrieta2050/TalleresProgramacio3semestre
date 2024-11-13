package Taller11_clasesAbstractas.Errores;

abstract class Animal {

    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }

    // Método abstracto que debe implementarse en clases derivadas
    public abstract void hacerSonido();
}

public class Main {
    public static void main(String[] args) {
        // Intentar crear una instancia de la clase abstracta Animal
        // Animal animal = new Animal("Desconocido"); // ERROR: No se puede instanciar
        //animal.mostrarEspecie();
    }
}
