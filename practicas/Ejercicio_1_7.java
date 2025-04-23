/*7. Pedir un número e imprimir todos los números del 1 al ingresado. */

package practicas;
import java.util.Scanner;

public class Ejercicio_1_7 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("7. Pedir un número e imprimir todos los números del 1 al ingresado.");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.println("Numero: " + i);
        }
        sc.close();
    }
}
