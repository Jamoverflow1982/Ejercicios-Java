/*3. Determinar si un número es par o impar. */
package practicas;

import java.util.Scanner;

public class Ejercicio_1_3 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("3. Determinar si un número es par o impar.");
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        if (num%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        }
}
