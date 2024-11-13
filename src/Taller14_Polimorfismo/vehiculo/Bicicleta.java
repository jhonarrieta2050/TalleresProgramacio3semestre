package Taller14_Polimorfismo.vehiculo;

public class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta está siendo pedaleada por el ciclista.");
    }
}