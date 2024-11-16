package Taller15_Principio.libro;

public class LibroNormal {
    private String titulo;
    private String autor;
    private double precio;

    public LibroNormal(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }


    public String obtenerDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", Precio: $" + precio;
    }


    public void generarReporte() {
        System.out.println("Generando reporte del libro...");
        System.out.println(obtenerDetalles());
    }


    public void guardarEnArchivo() {
        System.out.println("Guardando libro en archivo...");

    }
}