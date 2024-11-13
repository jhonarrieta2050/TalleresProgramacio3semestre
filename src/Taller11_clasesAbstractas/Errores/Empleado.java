package Taller11_clasesAbstractas.Errores;

abstract class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public double calcularSalario() {
        return 0;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + calcularSalario());
    }
}

class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}

class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(String nombre, int edad, double salarioBase, double comision) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 45, 5000, 2000);
        gerente.mostrarDetalles();

        Vendedor vendedor = new Vendedor("Ana", 30, 3000, 800);
        vendedor.mostrarDetalles(); // Mostrará salario como 0 porque no se sobrescribió
    }
}