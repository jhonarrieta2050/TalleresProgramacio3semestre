package Taller8_HerenciaSimple.Empleado;

public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carlos García", 3500);

        Gerente gerente = new Gerente("Ana Martínez", 5500, "Ventas");

        System.out.println("Detalles del Empleado:");
        empleado.mostrarDetalles();
        System.out.println();

        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();
    }
}