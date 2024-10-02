package Verificador;

public class VerificadorContrasena {
    private String contrasenaAlmacenada;

    // Constructor
    public VerificadorContrasena(String contrasena) {
        this.contrasenaAlmacenada = contrasena;
    }

    // Método para verificar la contraseña
    public boolean verificar(String contrasenaUsuario) {
        return contrasenaUsuario.equals(contrasenaAlmacenada);
    }

}
