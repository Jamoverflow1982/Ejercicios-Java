/*2. Pedir dos números e imprimir cuál es el mayor */
package practicas;

import java.util.Scanner;

public class Ejercicio_1_2 {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("2. Pedir dos números e imprimir cuál es el mayor");
        int num1, num2;
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca otro numero:");
        num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }
        sc.close();
    }

}
