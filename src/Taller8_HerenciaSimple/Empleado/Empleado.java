package Taller8_HerenciaSimple.Empleado;

public class Empleado {
    private String nombre;
    protected double salario;


    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }


    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}