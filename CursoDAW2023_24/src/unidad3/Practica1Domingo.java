/**
 * @author Domingo
 * 
 * Prueba de la practica 1 resuelta.
 * 
 * PRÁCTICA 1
Crear una aplicación "Libro recetas" que nos permita trabajar con recetas.

Trabajaremos con String NO con Arrays.

Al arrancar la aplicación se crearán datos ficticios (4 ó 5 recetas).

En las recetas se especificará el nombre y la dificultad (siendo 1 una receta fácil y 5 una receta difícil)

Crear un menú que permita:

1) Añadir nuevas recetas. Que te permita añadir una nueva receta no existente (controlar que no se repitan).

2) Mostrar recetas por dificultad. Se solicitará la dificultad y dependiendo de la dificultad introducida se mostrarán las recetas cuya dificultad coincida con la introducida.

3) Total recetas. Mostrará todos los nombres de las recetas y un mensaje final indicando el número total de recetas que hay.

4) Eliminar receta.

5) Fin.



OBLIGATORIO: 

** Esta práctica se realiza por parejas (especifica tu grupo en la excel)

** Tu aplicación debe tener control de errores.

** Utiliza bucles y métodos en el desarrollo de tu aplicación.

** Hacer un documento pdf con capturas del código y que explique funcionalidad de la aplicación. También se explicarán los métodos predefinidos que se han usado.

** Entrevista de prácticas para poder aprobar.
*
 */

package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practica1Domingo {

	public static int contarRecetas(String totalRecetas) {

		int contadorPalabras = 0;
		int p = 0;
		/*
		 * receta1\n
		 * receta2\n
		 * receta3\n
		 */

		do {
			p = totalRecetas.trim().indexOf("\n"); // Si no pones el .trim() sale una receta de mas, ¿De donde sale el
													// espacio que cuenta el .indexOf ?? DUDA !!!
			totalRecetas = totalRecetas.substring(p + 1);
			contadorPalabras++;
		} while (p != -1);
		return contadorPalabras;
	}

	public static String eliminarPalabra(String recetas, String palabraEliminar) {

		String recetasNueva = "";

		recetasNueva = recetas.replace(palabraEliminar, "");

		return recetasNueva;
	}

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scChar = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		int opcionMenu = 0;

		Boolean salir = false;
		Boolean errores = false;

		String alta = "RECETA1" + "\n" + "RECETA2" + "\n";
		String media = "RECETA3" + "\n" + "RECETA4" + "\n";
		String baja = "RECETA5" + "\n";

		System.out.println("BIENVENIDO A NUESTRO PROGRAMA");

		do {

			System.out.println("----- MENU -----");
			System.out.println("1) Anadir nuevas recetas.");
			System.out.println("2) Mostrar recetas por dificultad.");
			System.out.println("3) Total recetas.");
			System.out.println("4) Eliminar receta.");
			System.out.println("5) FIN.");

				try {
			System.out.print("Seleccione una de las opciones: ");
			opcionMenu = scInt.nextInt();
				}catch(InputMismatchException ex) {
					System.err.print("Tienes que utilizar un numero. Intentalo de nuevo: ");
					scInt.next();
				}catch (Exception ex) {
					System.err.println("Teclea una opcion correcta");
					scInt.next();
				}
			
			switch (opcionMenu) {
			case 1: // Añadir receta
				System.out.print("Escribe el nombre de la nueva receta a añadir: ");
				String nuevaReceta = scString.nextLine().trim();
				System.out.print("Que dificultad tiene esta receta? ALTA(A) / MEDIA(M) / BAJA(B): ");
				char opcionDificultad = scChar.nextLine().toUpperCase().trim().charAt(0);

				switch (opcionDificultad) {
				case 'A':
					alta = alta + nuevaReceta + "\n";
					System.out.println("Receta añadida correctamente a la dificultad ALTA.");
					break;
				case 'M':
					media = media + nuevaReceta + "\n";
					System.out.println("Receta añadida correctamente a la dificultad MEDIA.");
					break;
				case 'B':
					baja = baja + nuevaReceta + "\n";
					System.out.println("Receta añadida correctamente a la dificultad BAJA.");
					break;
				default:
					System.err.println("El numero seleccionado no es una opcion correcta.");
					scInt.next();
					break;

				}

				break;
			case 2: // Muestra las recetas en la dificultad indicada
				System.out.print("Dime la dificultad que deseas mostrar siendo ALTA(A) / MEDIA(M) / BAJA(B): ");
				char opcionLetra = scChar.nextLine().toUpperCase().trim().charAt(0);

				switch (opcionLetra) {
				case 'A':
					System.out.println("Las recetas en alta son:");
					System.out.println(alta);
					break;
				case 'M':
					System.out.println("Las recetas en media son:");
					System.out.println(media);
					break;
				case 'B':
					System.out.println("Las recetas en baja son:");
					System.out.println(baja);
					break;
				}

				break;
			case 3: // Muestra todas las recetas
				System.out.println("Todas las recetas de nuestro programa son: ");
				String totalRecetas = alta + media + baja;
				System.out.println(totalRecetas);
				contarRecetas(totalRecetas);
				System.out.println("Hay un total de " + contarRecetas(totalRecetas) + " recetas.");

				break;
			case 4:
				System.out.print("En que dificultad esta la receta que quieres eliminar? siendo ALTA(A) / MEDIA(M) / BAJA(B): ");
				char opcionEliminar = scChar.nextLine().toUpperCase().trim().charAt(0);

				switch (opcionEliminar) {
				case 'A':
					System.out.println("Que receta quieres eliminar?");
					System.out.println(alta);
					System.out.print("Escribe el nombre de la que quieras eliminar: ");
					String palabraEliminar = scString.nextLine().trim();
					alta = eliminarPalabra(alta, palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad ALTA:");
					System.out.println(alta);
					break;
				case 'M':
					System.out.println("Que receta quieres eliminar?");
					System.out.println(media);
					System.out.print("Escribe el nombre de la que quieras eliminar: ");
					palabraEliminar = scString.nextLine().trim();
					media = eliminarPalabra(media, palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad MEDIA:");
					System.out.println(media);
					break;
				case 'B':
					System.out.println("Que receta quieres eliminar?");
					System.out.println(baja);
					System.out.print("Escribe el nombre de la que quieras eliminar: ");
					palabraEliminar = scString.nextLine().trim();
					baja = eliminarPalabra(baja, palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad BAJA:");
					System.out.println(baja);
					break;
				}

				break;
			case 5:
				salir = true;
				System.out.println("FIN DEL PROGRAMA.");
				break;
			}

		} while (salir == false);

	}

}
