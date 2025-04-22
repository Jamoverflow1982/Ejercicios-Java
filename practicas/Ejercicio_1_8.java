/* 8. Pedir dos números e imprimir los pares entre ellos usando for.*/

package practicas;
import java.util.Scanner;

public class Ejercicio_1_8 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("8. Pedir dos números e imprimir los pares entre ellos usando for.");
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("Reordenando los numeros...");
            num3 = num1;
            num1 = num2;
            num2 = num3;
        }
        for (int i = num1; i <= num2; i++){
            if (i%2 == 0){
                System.out.println("El numero " + i + " es par entre " + num1 + " y " + num2);
            }
        }
    }
}
