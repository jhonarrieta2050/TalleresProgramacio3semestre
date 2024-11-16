package Taller17_Liskov.figuras;

public class Main {
    public static void main(String[] args) {

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        circulo.mostrarArea();
        rectangulo.mostrarArea();


        Figura[] figuras = {circulo, rectangulo};
        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}