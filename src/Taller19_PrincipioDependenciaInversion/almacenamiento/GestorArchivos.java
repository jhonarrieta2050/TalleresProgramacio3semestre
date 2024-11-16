package Taller19_PrincipioDependenciaInversion.almacenamiento;

public class GestorArchivos {
    private Almacenamiento almacenamiento;


    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public void recuperar(String nombre) {
        String contenido = almacenamiento.recuperarArchivo(nombre);
        System.out.println("Contenido del archivo: " + contenido);
    }
}