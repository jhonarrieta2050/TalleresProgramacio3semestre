package Taller11_clasesAbstractas.figura;

abstract class Figura {

    public abstract double calcularArea();


    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
