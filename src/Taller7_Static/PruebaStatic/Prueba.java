package Taller7_Static.PruebaStatic;

public class Prueba {
    private int valor;


    public void modificarValor() {
          valor = 10; // Error de compilación: 'valor' es un atributo no estático
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.modificarValor();
        System.out.println(prueba.valor);
    }
}