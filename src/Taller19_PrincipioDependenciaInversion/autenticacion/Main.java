package Taller19_PrincipioDependenciaInversion.autenticacion;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(authLocal);
        gestorLocal.autenticarUsuario("admin", "1234");

        System.out.println("------------------------------");

        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(authOAuth);
        gestorOAuth.autenticarUsuario("usuarioOAuth", "tokenValido");
    }
}