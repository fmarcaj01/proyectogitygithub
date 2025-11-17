import java.util.Scanner;

public class login {

    public static void main (String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tu usuario");
    String usuario = sc.nextLine();
    System.out.println("Bienvenido " + usuario + " introduce tu contraseña");
    String contrasena = sc.nextLine();
    sc.close();
    }
}
