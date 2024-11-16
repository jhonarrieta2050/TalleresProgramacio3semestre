package Taller17_Liskov.banco;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }


    public void aplicarInteres() {
        double interes = saldo * tasaInteres / 100;
        saldo += interes;
        System.out.println("Interés aplicado: $" + interes);
    }


    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tasa de interés: " + tasaInteres + "%");
    }
}