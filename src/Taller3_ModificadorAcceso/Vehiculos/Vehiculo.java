package Taller3_ModificadorAcceso.Vehiculos;

public class Vehiculo {
    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarInfo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}