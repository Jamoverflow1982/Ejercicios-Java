/*6. Pedir tres notas y calcular el promedio. Decir si aprobó (>=6). */

package practicas;
import java.util.Scanner;

public class Ejercicio_1_6 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("6. Pedir tres notas y calcular el promedio. Decir si aprobó (>=6).");
        int num1, num2, num3, promedio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("Introduzca el tercer numero: ");
        num3 = sc.nextInt();
        promedio = (num1 + num2 + num3) / 3;
        if (promedio >= 6) {
            System.out.println("El alumno aprobo con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno reprobo con un promedio de: " + promedio);
        }
        sc.close();
    }
}
