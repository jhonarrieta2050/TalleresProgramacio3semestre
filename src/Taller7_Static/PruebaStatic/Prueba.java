package Taller7_Static.PruebaStatic;

public class Prueba {
    private int valor;


    public static void modificarValor() {
        //  valor = 10; // Error de compilación: 'valor' es un atributo no estático
    }

    public static void main(String[] args) {
        modificarValor();
    }
}