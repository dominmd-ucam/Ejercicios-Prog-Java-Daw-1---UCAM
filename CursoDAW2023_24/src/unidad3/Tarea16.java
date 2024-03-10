package unidad3;

import java.util.InputMismatchException;

/**
 * @author Domingo Martinez Diaz
 * Tarea 16Tarea Excepciones
Solicita un número por teclado que sea positivo.

Una vez introducido el número muestra un contador donde aparezcan todos los números desde el número indicado al número 0.

** Utiliza excepciones para controlar los errores.
 */

import java.util.Scanner;

public class Tarea16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean numPositivo = true;
		do {
			try {
				System.out.print("Introduce un numero Positivo:");
				num = sc.nextInt();

			} catch (InputMismatchException ex) {
				System.err.println("ERROR.");
				sc.next();
			} catch (Exception ex) {
				System.err.println("Error: Introduzca un numero!!");

			}
			if (num > 0) {
				System.out.println("El numero introducido es positivo. ");

				for (int i = 0; num >= i; i++) {
					System.out.println(num - i);
				}
				numPositivo = true;

			} else {
				numPositivo = false;
				System.err.println("No es un numero positivo, prueba de nuevo.");
			}

		} while (!numPositivo);

		System.out.println("FIN.");

	}
}
