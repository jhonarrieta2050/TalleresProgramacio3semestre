package Taller4_ModificadorProtected;

public class MainEmpleado {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan", 3000);
        empleado.mostrarInformacion();

        Gerente gerente = new Gerente("Ana", 5000, "Marketing");
        gerente.mostrarInformacion();
    }
}