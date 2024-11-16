package Taller8_HerenciaSimple.Empleado;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(salario);
        System.out.println("Departamento: " + departamento);
    }
}