package unidad3;

/**
 * Tarea 25
Solicitar una cadena de texto por teclado y mostrar el siguiente menú con las opciones:

1) Contar. Invocar al método "contar" y mostrar resultado. Para esto crear un método "contar" que devuelva un entero con todas las letras "a" que contiene el texto recogido por teclado (tanto mayúsculas como minúsculas), este texto se pasará como parámetro de entrada. 

2) Sustituir. Crear un método "sustituir" que pasándole el texto recogido por parámetro nos pinte el texto sustituyendo todas las letras "a" por la letra "e". 

3) Mostrar en letras mayúsculas la primera y última palabra recogidas por teclado.

4) Mostrar la longitud de la cadena de texto introducida.

5) Mostrar la longitud de la cadena de texto introducida pero sin contar los espacios en blanco.

6) Salir.
 */

import java.util.Scanner;

public class Tarea25 {

	public static void main(String[] args) {

		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);

		String menu = "1) Contar todas las letras 'a' que contiene el texto.\n2) Sustituir las letras 'a' por la letra 'e'.\n3) Mostrar en letras mayusculas la primera y ultima palabra introducida en el texto.\n4) Mostrar la longitud del texto introducida.\n5) Mostrar la longitud de la cadena de texto introducida pero sin contar los espacios en blanco.\n6) Salir.";

		String texto = "";
		String salir = "";
		Boolean salida = false;
		int opcion = 0;

		System.out.print("Introduce una frase: ");
		texto = scString.nextLine().trim();

		do {

			System.out.println(menu);
			System.out.print("Introduce una opcion: ");
			opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("La cantidad de letras 'a' es : " + contar(texto));
				System.out.println("");
				break;

			case 2:
				System.out.println(sustituir(texto));
				System.out.println("");

				break;

			case 3:

				String mayusPrimera = texto.toUpperCase().substring(0, texto.indexOf(" "));
				System.out.println(mayusPrimera);

				String mayusUltima = texto.toUpperCase().substring(texto.lastIndexOf(" ") + 1, texto.length());
				System.out.println(mayusUltima);
				
				System.out.println("");

				break;

			case 4:
				System.out.println("El tamaño de la cadena de texto es de: " + texto.length());
				System.out.println("");
				break;

			case 5:
				System.out.println(
						"El tamaño de la cadena de texto SIN ESPACIOS es de: " + texto.replace(" ", "").length());
				System.out.println("");
				break;

			case 6:
				System.out.println("¡Usted ha finalizado el programa!");
				salida = true;
				break;
			default:
				System.err.println("ERROR. Introduce una de las opciones del menu.\n");
				break;

			}
		} while (salida == false);

	}

	public static String sustituir(String texto) {

		String nuevoTexto = texto.replace('a', 'e');

		return nuevoTexto;
	}

	public static int contar(String texto) {
		int contadorA = 0;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
				contadorA++;
			}
		}

		return contadorA;
	}

}
