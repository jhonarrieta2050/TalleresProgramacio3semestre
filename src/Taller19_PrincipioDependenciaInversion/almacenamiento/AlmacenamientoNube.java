package Taller19_PrincipioDependenciaInversion.almacenamiento;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento {
    private Map<String, String> baseDatosNube = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        baseDatosNube.put(nombre, contenido);
        System.out.println("Archivo guardado en la nube: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return baseDatosNube.getOrDefault(nombre, "Archivo no encontrado en la nube");
    }
}