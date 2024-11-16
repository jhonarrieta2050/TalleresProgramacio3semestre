package Taller19_PrincipioDependenciaInversion.almacenamiento;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> baseDatosLocal = new HashMap<>();

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        baseDatosLocal.put(nombre, contenido);
        System.out.println("Archivo guardado localmente: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return baseDatosLocal.getOrDefault(nombre, "Archivo no encontrado");
    }
}