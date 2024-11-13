package Taller14_Polimorfismo.vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo miCoche = new Coche();
        miCoche.mover();


        Vehiculo miBicicleta = new Bicicleta();
        miBicicleta.mover();


        Vehiculo vehiculoGenerico = new Vehiculo();
        vehiculoGenerico.mover();
    }
}