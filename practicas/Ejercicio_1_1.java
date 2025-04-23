/*1. Pedir un número al usuario y decir si es positivo, negativo o cero */
package practicas;

import java.util.Scanner;

public class Ejercicio_1_1 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("1. Pedir un número al usuario y decir si es positivo, negativo o cero");
        int num;
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        if (num > 0){
            System.out.println("El numero es positivo");
        } else if (num < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        sc.close();
    }
}
