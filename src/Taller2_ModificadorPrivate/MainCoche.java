package Taller2_ModificadorPrivate;

public class MainCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.setMarca("Toyota");
        coche.setModelo("Corolla");
        coche.setVelocidadMaxima(180);

        coche.acelerar(20);

        System.out.println(coche.getMarca());
        System.out.println(coche.getModelo());
        System.out.println(coche.getVelocidadMaxima());
    }
}