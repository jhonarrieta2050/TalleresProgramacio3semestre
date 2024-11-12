package Taller5_ModificadorPublic.Cuenta;

public class MainBanco {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890", 1000.0, "Ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("9876543210", -500.0, "Corriente"); // Intentar saldo negativo


        cuenta1.mostrarDetalles();
        System.out.println();

        cuenta2.mostrarDetalles();
        System.out.println();

        // System.out.println("Numero de cuenta: " + cuenta1.numeroCuenta); // Error de compilación: numeroCuenta tiene acceso privado

        cuenta1.setSaldo(2000.0);
        System.out.println("Saldo actualizado de cuenta1: " + cuenta1.getSaldo());

        cuenta2.setSaldo(-200);
        System.out.println("Saldo actual de cuenta2: " + cuenta2.getSaldo());
    }
}