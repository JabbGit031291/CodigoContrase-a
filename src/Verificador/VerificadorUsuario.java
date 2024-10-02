package Verificador;

public class VerificadorUsuario {
    private String usuarioAlmacenada;

    // Constructor
    public VerificadorUsuario(String usuario) {
        this.usuarioAlmacenada = usuario;
    }

    // Método para verificar la contraseña
    public boolean verificar(String contrasenaUsuario) {
        return contrasenaUsuario.equals(usuarioAlmacenada);
    }
}
