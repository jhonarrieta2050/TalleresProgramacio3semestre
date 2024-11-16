package Taller18_Segregacion.operacion;

public class CuentaCorriente implements Tranferible, Retirable {
    @Override
    public void transferir(double monto) {
        System.out.println("Transfiriendo $" + monto + " desde la cuenta corriente.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " desde la cuenta corriente.");
    }
}