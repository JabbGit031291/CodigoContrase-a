package Verificador;
import java.util.Scanner;
public class LogIn {


    VerificadorContrasena verificadorContrasena = new VerificadorContrasena("miContraseña123");
    VerificadorUsuario verificadorUsuario = new VerificadorUsuario("jbenav9");

    Scanner scanner = new Scanner(System.in);

    public void LogIng(){
        System.out.print("Introduce el Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Introduce la contraseña: ");
        String contrasenaUsuario = scanner.nextLine();


        if(verificadorUsuario.verificar(usuario) && verificadorContrasena.verificar(contrasenaUsuario)){
            System.out.println("Acceso concedido!");

        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }




    }


}
