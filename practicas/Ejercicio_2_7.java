package practicas;
import java.util.Scanner;

public class Ejercicio_2_7 {
    public static void main(String[] args) {
        int num, total = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("7. Calcular el factorial de un número.");
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println("El factorial de " + num + " es: " + total);
        sc.close();
    }
}