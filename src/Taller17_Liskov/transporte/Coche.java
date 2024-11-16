package Taller17_Liskov.transporte;

public class Coche extends Transporte {
    private String combustible;

    public Coche(int capacidad, String combustible) {
        super("Coche", capacidad);
        this.combustible = combustible;
    }

    @Override
    public void mover() {
        System.out.println("El coche está conduciendo.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de combustible: " + combustible);
    }
}