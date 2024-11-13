package Taller11_clasesAbstractas.Empleado;

public class Main {
    public static void main(String[] args) {

        Empleado gerente = new Gerente("Carlos", 45, 5000, 2000);
        gerente.mostrarDetalles();
        System.out.println();

        Empleado vendedor = new Vendedor("Ana", 30, 3000, 800);
        vendedor.mostrarDetalles();
    }
}