package Taller7_Static.Matematicas;

public class MainMatematicas {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int resultadoSuma = Matematicas.suma(a, b);
        int resultadoResta = Matematicas.resta(a, b);
        int resultadoMultiplicacion = Matematicas.multiplicacion(a, b);
        double resultadoDivision = Matematicas.division(a, b);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}