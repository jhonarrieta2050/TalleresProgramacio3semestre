package Taller18_Segregacion.vehiculos;

public class Camion implements Conducible, TransportadorMercancia {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un camión.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando mercancía de " + peso + " kg en el camión.");
    }
}