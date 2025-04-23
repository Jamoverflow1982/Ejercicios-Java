package practicas;

public class Ejercicio_2_4 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("4. Imprimir los 10 primeros números de la serie de Fibonacci.");
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 0; i < 9; i++) {
            System.out.print(num1 + " , ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.print(num1);
    }
}
