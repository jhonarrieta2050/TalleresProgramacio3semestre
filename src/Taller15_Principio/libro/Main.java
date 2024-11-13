package Taller15_Principio.libro;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("El Gran Libro", "Autor Famoso", "123-456-789", 2022);

        // Generar un reporte
        ReporteLibro reporteLibro = new ReporteLibro();
        reporteLibro.generarReporte(libro);

        // Guardar el libro en la persistencia
        PersistenciaLibro persistenciaLibro = new PersistenciaLibro();
        persistenciaLibro.guardar(libro);

        // Cargar un libro desde la persistencia
        Libro libroCargado = persistenciaLibro.cargar("123-456-789");
        reporteLibro.generarReporte(libroCargado);
    }
}