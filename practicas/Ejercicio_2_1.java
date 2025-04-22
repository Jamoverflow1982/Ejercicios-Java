package practicas;
import java.util.Scanner;

public class Ejercicio_2_1 {
    public static void main(String[] args) {
        float num;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("1. Pedir un número e imprimir cuántos dígitos tiene.");
        System.out.print("Ingrese un numero: ");
        num = sc.nextFloat();
        for (int i = 1; i < 1000000000; i = i * 10) {
            if ( num/i >=1 ){
                cont++;
            }
        }
        System.out.println("El numero tiene " + cont + " digitos.");
    }
}
