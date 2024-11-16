package Taller17_Liskov.banco;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depositado: $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }


    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retirado: $" + monto);
        } else {
            System.out.println("Fondos insuficientes o monto no válido.");
        }
    }


    public double consultarSaldo() {
        return saldo;
    }


    public void mostrarDetalles() {
        System.out.println("Saldo actual: $" + saldo);
    }
}