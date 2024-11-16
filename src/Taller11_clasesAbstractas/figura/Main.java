package Taller11_clasesAbstractas.figura;

public class Main {
    public static void main(String[] args) {

        Figura circulo = new Circulo(5);
        circulo.mostrarArea();


        Figura rectangulo = new Rectangulo(4, 6);
        rectangulo.mostrarArea();
    }
}