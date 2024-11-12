package Taller5_ModificadorPublic.utiliades;

public class MainUtilidades {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + Utilidades.suma(num1, num2));
        System.out.println("Resta: " + Utilidades.resta(num1, num2));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(num1, num2));

        System.out.println("División: " + Utilidades.division(num1, num2));

        System.out.println("División por cero: " + Utilidades.division(num1, 0));
    }
}