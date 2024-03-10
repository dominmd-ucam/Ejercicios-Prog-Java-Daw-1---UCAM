package unidad4;

import java.util.Scanner;
import java.util.ArrayList;
/*@author 
 * Crear una aplicación que solicite 5 nombres y los guarde en un array.

Una vez insertados todos los nombres vamos a crearnos un menú:

1) insertar otro nombre al array

2) Borrar un elemento del array indicando la posición del elemento a borrar.

3) Mostrar los elementos del array.

4) Salir.
 */
public class Tarea6Ramon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String MENU = "\n\t\t<<< ¿Qué quiere hacer?: >>>" + "\n1 - Insertar otro nombre."
				+ "\n2 - Borrar un nombre." + "\n3 - Mostrar todos los nombres." + "\n4 - Cerrar programa.";

		Scanner scNum = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String inputName = "";
		boolean valido = true;
		ArrayList<String> ListaNombres = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca el nombre para el índice nº" + i + " :");
			inputName = sc.nextLine();

			if (inputName.isEmpty() == true || inputName.matches(".*[0-9].*")) {
				System.err.println("Introduzca un nombre válido.");
				i--;
			} else {
				inputName = inputName.substring(0, 1).toUpperCase() + inputName.substring(1).toLowerCase();
				ListaNombres.add(inputName);
				System.out.println(ListaNombres);
			}
		}

		int opcion = 0;

		do {
			try {
				System.out.println("\n\t" + MENU);
				opcion = scNum.nextInt();

				switch (opcion) {

				case (1):
					do {
						System.out.println("Inserte el nuevo nombre: ");
						inputName = sc.nextLine();
						if (inputName.isEmpty() == true || inputName.matches(".*[0-9].*")) {
							System.err.println("Introduzca un nombre válido.");
							valido = false;
						} else {
							inputName = inputName.substring(0, 1).toUpperCase() + inputName.substring(1).toLowerCase();
							ListaNombres.add(inputName);
							valido = true;
							System.out.println("Nombre añadido correctamente.");
						}
					} while (valido == false);

					break;
				case (2):
					do {
						System.out.println("¿Qué nombre quiere borrar? :");
						inputName = sc.nextLine();
						if (inputName.isEmpty() == true || inputName.matches(".*[0-9].*")) {
							System.err.println("Introduzca un nombre válido.");
							valido = false;
						} else {
							inputName = inputName.substring(0, 1).toUpperCase() + inputName.substring(1).toLowerCase();
							ListaNombres.remove(inputName);
							valido = true;
							System.out.println("Nombre borrado correctamente.");
						}
					} while (valido == false);

					break;
				case (3):
					System.out.println("La lista actualizada es:");

					for (String nombre : ListaNombres) {
						System.out.println("- " + nombre);
					}
					break;
				case (4):
					System.out.println("Hasta la próxima!!");
					break;
				default:
					System.err.println("Escoja una opción disponible.");
					valido = false;
				}
			} catch (Exception ex) {
				System.err.println("Introduzca un valor correcto.");
				valido = false;
				scNum.next();
			}
		} while (opcion > 0 && opcion < 4 || valido == false);

	}

}
