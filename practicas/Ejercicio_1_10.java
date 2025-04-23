/*10. Mostrar la tabla de multiplicar del 5. */

package practicas;
import java.util.Scanner;

public class Ejercicio_1_10 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("10. Mostrar la tabla de multiplicar del 5.");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        System.out.println("Se muestra la tabla de multiplicar del " + num);
        for (int i = 0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        sc.close();
    }
}
