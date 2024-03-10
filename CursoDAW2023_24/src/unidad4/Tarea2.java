package unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * U4 - Tarea 2 Crear una aplicación que pida 7 valores numéricos, deben estar
 * dentro del rango [0,100] ambos incluidos y los meta en un array. Una vez
 * recogidos todos los valores recorra el array y muestre el más pequeño y el
 * más grande.
 * 
 * Para esto:
 * 
 * Crear un método obtenerNumero sin parámetros de entrada y que devuelva un
 * número entero. En el método solicitará por consola un número comprobará que
 * el número está dentro del rango permitido [0,100] y si es así hará un return
 * del valor obtenido y si no mostrará mensaje de error y volverá a solicitar el
 * número hasta que éste sea el correcto. Crear un método mostrarMaxMin al que
 * se le pasará por parámetro de entrada el array con los números recogidos
 * anteriormente. Éste método no devolverá nada, lo que hará será recorrer el
 * array y obtener el número máximo y mínimo y los mostrará por consola.
 * Importante tened en cuenta el control de errores.
 * 
 */

/**
 * ME FALLA CUANDO SACA EL MAX Y MINIMO DE NUMEROS QUE SUPERAN EL RANGO
 */
public class Tarea2 {
	public static void mostrarMaxMin(int[] MaxMin) {
		int max = 0;
		int min = 999;
		int num = 0;

		for (int i = 0; i < MaxMin.length; i++) {
			num = MaxMin[i];
			if (num >= max) {
				max = num;
			}
		}
		System.out.println("El numero Max es: " + max);

		for (int i = 0; i < MaxMin.length; i++) {
			num = MaxMin[i];
			if (num < min) {
				min = num;
			}
		}
		System.out.println("El numero Min es: " + min);

	}

	public static int obtenerNumero() {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		boolean salida = false;
		do {
			try {
				System.out.print("Numero: ");
				numero = sc.nextInt();
				if (numero >= 0 && numero <= 100) {
					salida = true;
				} else {
					System.err.println("Error. Por favor seleccione un numero dentro del Rango [0,100]");
					//System.out.println("Numero : ");
				}
			} catch (InputMismatchException ex) {
				System.err.println("ERROR. Introduzca un numero entero.");
				sc.next();
			}
		} while (salida == false);
		return numero;
	}

	public static void main(String[] args) {

		int[] numeros = new int[7];

		System.out.println("Indica 7 valores numericos dentro del rango [0,100]");

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = obtenerNumero();
		}

		mostrarMaxMin(numeros);
	}

}
