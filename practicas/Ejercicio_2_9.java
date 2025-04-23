package practicas;
import java.util.Scanner;

public class Ejercicio_2_9 {
    public static void main(String[] args) {
        int saldo = 10000;
        int cantidad = 0;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("9. Simular un cajero automático con saldo inicial y opciones de retiro, depósito y salida.");
        System.out.println("");
        while (opcion != 3) {
            System.out.println("Seleccione una opcion: 1) Retirar dinero 2) Depositar dinero 3) Salir.");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese la cantidad a retirar: ");
                cantidad = sc.nextInt();
                if (cantidad > saldo) {
                    System.out.println("No tiene suficiente saldo para retirar esa cantidad.");
                } else {
                    saldo -= cantidad;
                    System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese la cantidad a depositar: ");
                cantidad = sc.nextInt();
                saldo += cantidad;
                System.out.println("Deposito exitoso. Saldo actual: $" + saldo);
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el cajero!!!");
            } else {
                System.out.println("Opcion Incorrecta");                
            }
        }
        sc.close();
    }   
}
