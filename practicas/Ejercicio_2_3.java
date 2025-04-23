package practicas;
import java.util.Scanner;

public class Ejercicio_2_3 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("3. Pedir una contraseña al usuario y permitirle 3 intentos.");
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        while (cont < 3){
            System.out.print("Ingrese su contraseña: ");
            String pass = sc.next();
            if (pass.equals("Hola")) {
                System.out.println("Acceso concedido");
                cont = 3;
            } else {
                System.out.println("Acceso denegado");
                cont++;
                System.out.println("Intentos restantes: " + (3 - cont));
            }
        }
        sc.close();
    }
}
