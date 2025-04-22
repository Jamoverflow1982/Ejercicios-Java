package practicas;
import java.util.*;

public class Ejercicio_2_5 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("5. Leer 5 números y mostrar cuántos son positivos, negativos y ceros.");
        int numpos = 0, numneg = 0, cero = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<6; i++) {
            System.out.print("Introduzca un numero (" + i + "/5): ");
            int num = sc.nextInt();
            if (num > 0) {
                numpos++;
                System.out.println("El numero es positivo");
            } else if (num < 0) {
                numneg++;
                System.out.println("El numero es negativo");
            } else {
                cero++;
                System.out.println("El numero es cero");
            }
        }
        System.out.println("Hay " + numpos + " numeros positivos, " + numneg + " numeros negativos y " + cero + " ceros.");
    }   
}
