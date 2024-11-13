package Taller15_Principio.usuario;

public class ValidacionService {
    public boolean validarEmail(Usuario usuario) {
        // Validación del email
        return usuario.getEmail().contains("@");
    }
}