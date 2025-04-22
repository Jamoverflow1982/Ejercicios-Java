package practicas;

public class Ejercicio_2_2_plus {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("2 Plus. Numeros primos.");
        int cont;
        for (int j = 1; j <= 100; j++) {
            cont = 0;
            for (int i = 1; i <= 1000000; i++) {
                if (j % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("El numero " + j + " es primo");
            }
        }
    }
}