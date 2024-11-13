package Taller15_Principio.usuario;

public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String username, String password) {
        // Lógica de autenticación
        return usuario.getUsername().equals(username) && usuario.getPassword().equals(password);
    }
}