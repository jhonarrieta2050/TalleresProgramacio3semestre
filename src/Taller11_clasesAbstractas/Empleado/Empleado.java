package Taller11_clasesAbstractas.Empleado;

abstract class Empleado {
    private String nombre;
    private int edad;


    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + calcularSalario());
    }
}