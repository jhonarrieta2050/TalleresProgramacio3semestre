package Taller5_ModificadorPublic.Empleado;

public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Carlos", 5000);
        Empleado empleado2 = new Empleado("Ana", -1000);

        empleado1.mostrarInformacion();
        System.out.println();

        empleado2.mostrarInformacion();
        System.out.println();

        empleado1.setSalario(7000);
        System.out.println("Salario actualizado de Carlos: " + empleado1.getSalario());

        empleado2.setSalario(-500);
        System.out.println("Intento de asignar un salario negativo a Ana.");
        System.out.println("Salario actual de Ana: " + empleado2.getSalario());
    }
}