package Taller19_PrincipioDependenciaInversion.autenticacion;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        if ("admin".equals(usuario) && "1234".equals(contraseña)) {
            System.out.println("Autenticación local exitosa.");
            return true;
        }
        System.out.println("Autenticación local fallida.");
        return false;
    }
}