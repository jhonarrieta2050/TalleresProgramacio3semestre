package Taller17_Liskov.transporte;

public abstract class Transporte {
    protected String tipo;
    protected int capacidad;

    public Transporte(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public abstract void mover() ;

    public void mostrarDetalles() {
        System.out.println("Tipo de transporte: " + tipo);
        System.out.println("Capacidad: " + capacidad);
    }
}