package Taller14_Polimorfismo.figura;

public class Main {
    public static void main(String[] args) {

        Figura figura1 = new Circulo(5.0);
        figura1.calcularArea();

        Figura figura2 = new Rectangulo(4.0, 3.0);
        figura2.calcularArea();
    }
}