package Taller4_ModificadorProtected.Banco;

public class MainBanco {
    public static void main(String[] args) {

        Banco cuenta = new Banco(1000);
        cuenta.mostrarSaldo();

        cuenta.saldo = 5000;
        cuenta.mostrarSaldo();
    }
}