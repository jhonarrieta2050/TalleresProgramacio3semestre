package Taller19_PrincipioDependenciaInversion.autenticacion;

public interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contraseña);
}