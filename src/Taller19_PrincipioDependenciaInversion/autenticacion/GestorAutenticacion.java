package Taller19_PrincipioDependenciaInversion.autenticacion;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticarUsuario(String usuario, String credencial) {
        if (servicioAutenticacion.autenticar(usuario, credencial)) {
            System.out.println("Usuario autenticado correctamente.");
        } else {
            System.out.println("Error de autenticación.");
        }
    }
}