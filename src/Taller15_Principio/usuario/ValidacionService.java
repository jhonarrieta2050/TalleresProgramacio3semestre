package Taller15_Principio.usuario;

public class ValidacionService {
    public boolean validarEmail(Usuario usuario) {

        return usuario.getEmail().contains("@");
    }
}