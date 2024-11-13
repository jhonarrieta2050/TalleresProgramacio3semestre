package Taller11_clasesAbstractas.Figuras;

public class Main {
    public static void main(String[] args) {

        Figura figura1 = new Circulo(5);
        figura1.mostrarArea();


        Figura figura2 = new Rectangulo(4, 6);
        figura2.mostrarArea();
    }
}