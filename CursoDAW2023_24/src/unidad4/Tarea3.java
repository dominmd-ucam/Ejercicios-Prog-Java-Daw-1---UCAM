package unidad4;

import java.util.Scanner;

/**
 * U4 - Tarea 3 Crear un array que tenga los nombres de todos los personajes de
 * la serie "Friends".
 * 
 * Hay que mostrar, para cada posición del array, nombre y la longitud del
 * nombre introducido.
 */

public class Tarea3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] nombres_friends = new String[6];
		int[] nombres_longitud = new int[6];

		String nombre = "";

		System.out.println("Escribeme los nombres de los 6 personajes principales de la serie Friends: ");

		for (int i = 0; i < nombres_friends.length; i++) {

			System.out.print("Nombre " + (i + 1) + ":");
			nombre = sc.nextLine().trim();

			nombres_friends[i] = nombre;
			nombres_longitud[i] = nombre.length();

		}

		for (int i = 0; i < nombres_friends.length; i++) {
			System.out.println("El nombre de: " + nombres_friends[i] + " tiene una longitud de: " + nombres_longitud[i]+" letras.");
		}

	}

}
