package Taller11_clasesAbstractas.Empleado;

class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(String nombre, int edad, double salarioBase, double comision) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}