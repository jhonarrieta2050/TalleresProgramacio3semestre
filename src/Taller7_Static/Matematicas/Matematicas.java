package Taller7_Static.Matematicas;

public class Matematicas {

    public static int suma(int a, int b) {
        return a + b;
    }


    public static int resta(int a, int b) {
        return a - b;
    }


    public static int multiplicacion(int a, int b) {
        return a * b;
    }


    public static double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN;
        }
    }
}