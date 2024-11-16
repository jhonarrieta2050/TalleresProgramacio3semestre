package Taller18_Segregacion.operacion;

public interface OperacionBancaria {
    void transferir(double monto);
    void retirar(double monto);
    void pagarFactura(double monto);
}
