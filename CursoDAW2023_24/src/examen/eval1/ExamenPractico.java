package examen.eval1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 49248504 - Domingo Martinez Diaz Examen practico: - Crear una
 *         aplicacion que inicialmente muestre un menu con 4 opciones y solicite
 *         que se introduzca una de las opciones indicadas. Cada una de las
 *         opciones se identificaran con un caracter. A. Obtener Antonimos B.
 *         Obtener el triple C. Calcular paga. D. Salir.
 * 
 */

public class ExamenPractico {

	public static String obtenerAntonimo(String palabra, String listaPalabras) {
		String antonimo = "";
		String respuesta = "";

		if (listaPalabras.toLowerCase().contains(palabra.toLowerCase())) {
			switch (palabra.toLowerCase()) {
			case "claro":
				antonimo = "Oscuro";
				respuesta = "El antonimo de " + palabra + " es \"" + antonimo + "\"";
				break;
			case "bonito":
				antonimo = "Feo";
				respuesta = "El antonimo de " + palabra + " es \"" + antonimo + "\"";
				break;
			case "grande":
				antonimo = "Pequeño";
				respuesta = "El antonimo de " + palabra + " es \"" + antonimo + "\"";
				break;
			case "alto":
				antonimo = "Bajo";
				respuesta = "El antonimo de " + palabra + " es \"" + antonimo + "\"";
				break;
			case "feliz":
				antonimo = "Triste";
				respuesta = "El antonimo de " + palabra + " es \"" + antonimo + "\"";
				break;
			}

		} else {
			System.err.println("NO tenemos antonimo para la palabra \"" + palabra + "\"");
		}

		return respuesta;
	}

	public static String calcularPaga(int horasTrabajadas) {
		final double precio = 12.50;

		double ganado = horasTrabajadas * precio;

		String respuesta = "Usted ha trabajado " + horasTrabajadas + " y ha ganado " + ganado + " euros.";

		return respuesta;
	}

	public static Boolean salirSiNo() {
		Scanner sc = new Scanner(System.in);
		Boolean salir = false;

		System.out.println("Desea salir del programa ? Indique SI o NO: ");
		String respuesta = sc.next().trim();
		do {
			if (respuesta.equalsIgnoreCase("SI")) {
				System.out.println("Gracias por usar el programa, cerrando ...");
				System.out.println("FIN DEL PROGRAMA");
				salir = true;
			} else if (respuesta.equalsIgnoreCase("NO")) {
				salir = false;
			} else {
				System.out.println("Tienes que introducir SI o NO: ");
				respuesta = sc.next().trim();
			}
		} while (respuesta == null);

		return salir;
	}

	public static int correccionErrInt() {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		int numero = 0;

		do {
			try {
				numero = sc.nextInt();
				valido = true;
			} catch (InputMismatchException ex) {
				System.err.print("Error, introduzca un numero: ");
				sc.next();
			}
		} while (valido == false);
		return numero;
	}

	public static void main(String[] args) {

		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scChar = new Scanner(System.in);

		Boolean salirPrograma = false;

		String menu = "A.\tObtener Antonimos.\nB.\tObtener el triple.\nC.\tCalcular paga.\nD.\tSalir.";

		System.out.println("----- BIENVENIDO AL PROGRAMA -----");
		System.out.println(menu);

		do {

			System.out.print("Seleccione la opcion a realizar indicando su letra (A/B/C/D): ");
			char opcionMenu = scChar.next().trim().toUpperCase().charAt(0);
			

			switch (opcionMenu) {
			case 'A':
				String listaPalabras = "- Claro\n- Bonito\n- Grande\n- Alto\n- Feliz";
				System.out.println("OPCION 'A': Obtener Antonimos");
				System.out.println(listaPalabras);
				System.out.print("Escriba una palabra de estas la cual desea sacar el antonimo: ");
				String palabra = scString.nextLine().trim();
				System.out.println(obtenerAntonimo(palabra, listaPalabras));

				salirPrograma = salirSiNo();

				break;
			case 'B':
				Boolean repetir = true;

				System.out.println("OPCION 'B': Obtener el triple");
				System.out.print("Escriba un numero entero para obtener su triple: ");
				int numero = correccionErrInt();
				do {
					if (numero >= 1 && numero <= 100) {
						double triple = 0;
						triple = Math.pow(numero, 3);
						System.out.println("El " + numero + " elevado a 3 es \"" + (int) triple + "\"");
						repetir = false;
					} else if (numero == 0) {
						System.err.println("Operacion Cancelada.");
						break;
					} else {
						System.out.print("Seleccione un numero que se encuentre entre 1 y 100: ");
						numero = correccionErrInt();
					}
				} while (repetir == true);
				
				salirPrograma = salirSiNo();

				break;
			case 'C':
				int horasTrabajadas = 0;

				System.out.println("OPCION 'C': Calcular paga");

				System.out.print("Indique las horas trabajadas para calcular su paga: ");
				horasTrabajadas = correccionErrInt();

				if (horasTrabajadas > 0) {
					System.out.println(calcularPaga(horasTrabajadas));
				} else {
					System.err.println("ERROR. Las horas trabajadas no pueden ser un numero menor o igual a 0.");
				}
				
				salirPrograma = salirSiNo();

				break;
			case 'D':
				System.out.println("Gracias por usar el programa, cerrando ...");
				System.out.println("FIN DEL PROGRAMA");
				salirPrograma = true;
				break;
			default:
				System.err.println("Indique una de las opciones correctamente");

				break;
			}

		} while (salirPrograma == false);

	}

}
