package Taller15_Principio.libro;

public class PersistenciaLibro {
    public void guardar(Libro libro) {
        // Simulación de persistencia (esto podría ser un acceso a base de datos)
        System.out.println("Guardando el libro en la base de datos...");
        System.out.println("Libro guardado: " + libro.getTitulo());
    }

    public Libro cargar(String isbn) {
        // Simulación de carga (esto podría ser una consulta a base de datos)
        System.out.println("Cargando el libro con ISBN: " + isbn);
        return new Libro("Ejemplo de libro", "Autor Ejemplo", isbn, 2020);  // Simulación de un libro cargado
    }
}
