package practicas;

public class Ejercicio_2_10 {
    public static void main(String[] args) {
        int cont = 0;
        System.out.println("");
        System.out.println("10. Contar cuántos números entre 1 y 1000 son divisibles por 3 o por 7 pero no por ambos.");
        System.out.println("");
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                if (i % 3 == 0 && i % 7 == 0) {
                } else {
                    cont++;
                    System.out.println("El numero " + i + " es multiplo de 3 o de 7 y no de ambos");
                }   
            }
        }
        System.out.println("Hay " + cont + " multiplos de 3 o 7");
    }
}
