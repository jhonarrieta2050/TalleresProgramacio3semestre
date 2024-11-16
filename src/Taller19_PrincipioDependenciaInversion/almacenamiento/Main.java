package Taller19_PrincipioDependenciaInversion.almacenamiento;

public class Main {
    public static void main(String[] args) {

        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.guardar("local.txt", "Contenido local");
        gestorLocal.recuperar("local.txt");

        System.out.println("------------------------------");

        // Uso del almacenamiento en la nube
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.guardar("nube.txt", "Contenido en la nube");
        gestorNube.recuperar("nube.txt");
    }
}