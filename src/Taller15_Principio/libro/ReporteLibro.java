package Taller15_Principio.libro;

public class ReporteLibro {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del Libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Año de Publicación: " + libro.getAnioPublicacion());
    }
}