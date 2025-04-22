package practicas;

public class Ejercicio_2_8 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("8. Mostrar los múltiplos de 3 entre 1 y 100 que no sean múltiplos de 5.");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("El numero " + i + " es multiplo de 3 y no de 5");
            }
            }
        }
}
