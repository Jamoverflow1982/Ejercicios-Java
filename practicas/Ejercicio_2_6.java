package practicas;

import java.util.Scanner;

public class Ejercicio_2_6 {
    public static void main(String[] args) {
        int mayor = 0, menor = 0;
        System.out.println("");
        System.out.println("6. Leer 10 números e imprimir el mayor y el menor.");
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<11; i++) {
            System.out.print("Introduzca un numero (" + i + "/10): ");
            int num = sc.nextInt();
            if (i == 1) {
                mayor = num;
                menor = num;
            } else {
                if (num > mayor) {
                    mayor = num;
                } else if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
