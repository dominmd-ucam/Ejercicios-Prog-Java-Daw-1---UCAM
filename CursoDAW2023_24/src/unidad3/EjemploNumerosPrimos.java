package unidad3;

import java.util.Scanner;

public class EjemploNumerosPrimos {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número máximo: ");
        int maximo = scanner.nextInt();

        System.out.println("Números primos hasta " + maximo + ":");

        for (int i = 2; i <= maximo; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}
