package practicas;
import java.util.Scanner;

public class Ejercicio_2_2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("2. Verificar si un número es primo.");
        int num, cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= 1000000; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
        sc.close();
    }
}
