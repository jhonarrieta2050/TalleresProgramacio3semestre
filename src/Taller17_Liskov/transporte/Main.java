package Taller17_Liskov.transporte;

public class Main {
    public static void main(String[] args) {

        Transporte[] transportes = {
                new Bicicleta(1),
                new Coche(5, "Gasolina")
        };

        for (Transporte transporte : transportes) {
            transporte.mover();
            transporte.mostrarDetalles();
            System.out.println();
        }
    }
}