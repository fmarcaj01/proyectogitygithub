import java.util.Scanner;

public class Calculadora {
    
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 2 números");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("La suma de los números es " + (a+b));
        System.out.println("La resta de los números es " + (a-b));
        System.out.println("La multiplicación de los números es " + (a*b));
        if (b != 0) {
            System.out.println("La división de los números es " + (a/b));
        } else {
            System.out.println("Estos números no son divisibles");
        }
        }
    }