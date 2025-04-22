/*9. Calcular la suma de los primeros N números naturales.*/

package practicas;
import java.util.Scanner;

public class Ejercicio_1_9 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("9. Calcular la suma de los primeros N números naturales.");
        int num,suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        for (int i =1; i<=num; i++){
            System.out.println("El numero " + i + " mas el total parcial " + suma + " es: " + (i+suma));
            suma+=i;
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
}
