package Taller12_HerenciaMultiple.ave;

public class Ave implements Volador, Cantante {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando.");
    }

    public void mostrarDetalles() {
        System.out.println("Ave: " + nombre);
    }
}