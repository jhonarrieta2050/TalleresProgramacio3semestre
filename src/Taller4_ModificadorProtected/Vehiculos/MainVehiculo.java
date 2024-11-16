package Taller4_ModificadorProtected.Vehiculos;

public class MainVehiculo {
    public static void main(String[] args) {

        Moto moto = new Moto("Motocicleta", "Yamaha", 600);

         System.out.println("Tipo: " + moto.tipo);
         System.out.println("Marca: " + moto.marca);
    }
}