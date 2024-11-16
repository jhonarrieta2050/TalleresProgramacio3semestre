package Taller19_PrincipioDependenciaInversion.autenticacion;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String token) {
        if ("usuarioOAuth".equals(usuario) && "tokenValido".equals(token)) {
            System.out.println("Autenticación OAuth exitosa.");
            return true;
        }
        System.out.println("Autenticación OAuth fallida.");
        return false;
    }
}
