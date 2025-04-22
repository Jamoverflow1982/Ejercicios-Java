/*5. Pedir la edad del usuario y verificar si es mayor de edad (>= 18). */

package practicas;
import java.util.Scanner;

public class Ejercicio_1_5 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("5. Pedir la edad del usuario y verificar si es mayor de edad (>= 18).");
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese para su edad: ");
        edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }else
        {
            System.out.println("Usted es menor de edad");
        }
    }
    }

