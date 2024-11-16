package Taller18_Segregacion.mantenimiento;

public class Coche implements Reparable, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Reparando el coche...");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el coche...");
    }
}