package Taller15_Principio.usuario;

public class Main {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("juan123", "password123", "juan@example.com");

        // Autenticación
        AutenticacionService autenticacionService = new AutenticacionService();
        boolean autenticado = autenticacionService.autenticar(usuario, "juan123", "password123");
        System.out.println("Autenticación exitosa: " + autenticado);

        // Validación de email
        ValidacionService validacionService = new ValidacionService();
        boolean emailValido = validacionService.validarEmail(usuario);
        System.out.println("Email válido: " + emailValido);
    }
}
