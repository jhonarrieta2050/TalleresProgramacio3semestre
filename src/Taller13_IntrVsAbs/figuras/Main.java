package Taller13_IntrVsAbs.figuras;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 3);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        Triangulo triangulo = new Triangulo(4, 6);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}