package Taller17_Liskov.transporte;

public class Bicicleta extends Transporte {

    public Bicicleta(int capacidad) {
        super("Bicicleta", capacidad);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta está pedaleando.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de transporte ecológico.");
    }
}