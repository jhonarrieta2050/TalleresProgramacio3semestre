package Taller17_Liskov.banco;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        cuenta1.mostrarDetalles();

        System.out.println();


        CuentaBancaria cuenta2 = new CuentaAhorros(2000, 5);
        cuenta2.depositar(1000);
        cuenta2.retirar(500);
        cuenta2.mostrarDetalles();


        if (cuenta2 instanceof CuentaAhorros) {
            ((CuentaAhorros) cuenta2).aplicarInteres();
            cuenta2.mostrarDetalles();
        }
    }
}