package practicas;
import java.util.Scanner;

public class WhileValStr {
    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equalsIgnoreCase("salir")) {
            System.out.print("Ingresá algo ('salir' para terminar): ");
            input = sc.nextLine();
            System.out.println("Ingresaste: " + input);
        }
        sc.close();
    }
}
