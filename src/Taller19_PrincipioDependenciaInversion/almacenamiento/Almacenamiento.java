package Taller19_PrincipioDependenciaInversion.almacenamiento;

public interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}