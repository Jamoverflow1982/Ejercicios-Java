/*4. Verificar si un número es divisible por 3 y por 5. */

package practicas;
import java.util.Scanner;

public class Ejercicio_1_4 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("4. Verificar si un número es divisible por 3 y por 5.");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        if (num%3 == 0 && num%5 == 0){
            System.out.println("El numero " + num + " es divisible por 3 y por 5");
        }else{
            System.out.println("El numero " + num + " no es divisible por 3 y por 5");
        }
        sc.close();
    }
}
