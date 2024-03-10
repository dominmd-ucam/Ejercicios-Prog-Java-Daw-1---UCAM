package unidad3;

import java.util.InputMismatchException;

import java.util.Scanner;


public class Practica1Natalia_Domingo {

	public static int contarRecetas(String totalRecetas) {

		int contadorPalabras = 0;
		int posicion = 0;

		do {
			posicion = totalRecetas.trim().indexOf("\n"); 
			
			totalRecetas = totalRecetas.substring(posicion + 1);
			contadorPalabras++;
		} while (posicion != -1);
		return contadorPalabras;
	}

	public static String eliminarPalabra(String recetas, String palabraEliminar) {

		String recetasNueva = "";

		recetasNueva = recetas.replace(palabraEliminar, "");

		return recetasNueva;
	}

	public static String correccionErr() {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		String frase = "";

		do {
			try {
				frase = sc.nextLine().trim().toLowerCase();

				valido = true;
			} catch (InputMismatchException ex) {
				System.err.print("Error, introduzca una opcion valida: ");
				sc.next();
			}
		} while (valido == false);
		
		return frase;
		
	}

	public static int correccionErrInt() {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		int opcion = 0;

		do {
			try {
				opcion = sc.nextInt();
				valido = true;
			} catch (InputMismatchException ex) {
				System.err.print("Error, introduzca un numero: ");
				sc.next();
			}
		} while (valido == false);
		return opcion;
	}

	public static void main(String[] args) {

		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int dificultad = 0;
		String nuevaReceta = "";
		int opcion = 0;
		String dif1 = "lomo" + "\nhuevo";
		String dif2 = "milanesa";
		String dif3 = "asado";
		String dif4 = "tartar";
		String dif5 = "paella";
		String sumaTotal = " ";
		boolean salida = false;
		String MENU = ("\n\tMENU" + "\n1) Añadir nuevas recetas" + "\n2) Mostrar recetas por dificultad"
				+ "\n3) Total recetas" + "\n4) Eliminar receta" + "\n5) FIN" + "\nSeleccione una de las opciones: ");

		do {
			System.out.print(MENU);
			opcion = correccionErrInt();

			switch (opcion) {

			case 1:// añadir nuevaReceta
				System.out.print("Cual es el nombre de la receta que quieres anadir? :");
				nuevaReceta = correccionErr();

				System.out.println("¿Que dificultad tiene esta receta?");
				System.out.println("Seleccione el tipo de dificultad siendo 5 la mas dificil y 1 la mas facil");
				dificultad = correccionErrInt();
				switch (dificultad) {
				case 1:
					dif1 = dif1.toLowerCase() + "\n" + nuevaReceta;
					System.out.println("Las nuevas recetas de dificicultad 1 son: \n" + dif1);
					break;
				case 2:
					dif2 = dif2.toLowerCase() + "\n" + nuevaReceta;
					System.out.println("Las nuevas recetas de dificicultad 2 son: \n" + dif2);
					break;
				case 3:
					dif3 = dif3.toLowerCase() + "\n" + nuevaReceta;
					System.out.println("Las nuevas recetas de dificicultad 3 son: \n" + dif3);
					break;
				case 4:
					dif4 = dif4.toLowerCase() + "\n" + nuevaReceta;
					System.out.println("Las nuevas recetas de dificicultad 4 son: \n" + dif4);
					break;
				case 5:
					dif5 = dif5.toLowerCase() + "\n" + nuevaReceta;
					System.out.println("Las nuevas recetas de dificicultad 5 son: \n" + dif5);
					break;
				}

				break;
			case 2:// mostrar recetas por dificultad
				System.out.println("Seleccione el tipo de dificultad siendo 5 la más difícil y 1 la más fácil");
				dificultad = correccionErrInt();
				switch (dificultad) {
				case 1:
					System.out.println("Has seleccionado dificultad '1'.");
					System.out.println("Las recetas de dificicultad 1 son: \n" + dif1);
					break;
				case 2:
					System.out.println("Has seleccionado dificultad '2'.");
					System.out.println("Las recetas de dificicultad 2 son: \n" + dif2);
					break;
				case 3:
					System.out.println("Has seleccionado dificultad '3'.");
					System.out.println("Las recetas de dificicultad 3 son: \n" + dif3);
					break;
				case 4:
					System.out.println("Has seleccionado dificultad '4'.");
					System.out.println("Las recetas de dificicultad 4 son: \n" + dif4);
					break;
				case 5:
					System.out.println("Has seleccionado dificultad '5'.");
					System.out.println("Las recetas de dificicultad 5 son: \n" + dif5);
					break;
				}

				break;
			case 3:// mostrar todas las recetas
				sumaTotal = dif1 + "\n" + dif2 + "\n" + dif3 + "\n" + dif4 + "\n" + dif5;
				System.out.println("\n\tTOTAL RECETAS" + "\n" + sumaTotal + "\n");
				System.out.println("Hay un total de " + contarRecetas(sumaTotal) + " recetas.");

				break;
			case 4:// eliminar receta
				System.out.println("Recetas dificultad 1:\n" + dif1 + "\n");
				System.out.println("Recetas dificultad 2:\n" + dif2 + "\n");
				System.out.println("Recetas dificultad 3:\n" + dif3 + "\n");
				System.out.println("Recetas dificultad 4:\n" + dif4 + "\n");
				System.out.println("Recetas dificultad 5:\n" + dif5 + "\n");
				System.out.println("Seleccione el tipo de dificultad para eliminar una receta: ");
				dificultad = correccionErrInt();
				switch (dificultad) {
				case 1:
					System.out.println("Has seleccionado dificultad '1'.");
					System.out.println(dif1);
					System.out.println("Que receta deseas eliminar? Escribe el nombre:");
					String palabraEliminar = correccionErr();
					dif1 = eliminarPalabra(dif1.toLowerCase(), palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad 1:");
					System.out.println(dif1);
					break;
				case 2:
					System.out.println("Has seleccionado dificultad '2'.");
					System.out.println(dif2);
					System.out.println("Que receta deseas eliminar? Escribe el nombre:");
					palabraEliminar = correccionErr();
					dif2 = eliminarPalabra(dif2.toLowerCase(), palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad 1:");
					System.out.println(dif2);

					break;
				case 3:
					System.out.println("Has seleccionado dificultad '3'.");
					System.out.println(dif3);
					System.out.println("Que receta deseas eliminar? Escribe el nombre:");
					palabraEliminar = correccionErr();
					dif3 = eliminarPalabra(dif3.toLowerCase(), palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad 1:");
					System.out.println(dif3);

					break;
				case 4:
					System.out.println("Has seleccionado dificultad '4'.");
					System.out.println(dif4);
					System.out.println("Que receta deseas eliminar? Escribe el nombre:");
					palabraEliminar = correccionErr();
					dif4 = eliminarPalabra(dif4.toLowerCase(), palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad 1:");
					System.out.println(dif4);

					break;
				case 5:
					System.out.println("Has seleccionado dificultad '5'.");
					System.out.println(dif5);
					System.out.println("Que receta deseas eliminar? Escribe el nombre:");
					palabraEliminar = correccionErr();
					dif5 = eliminarPalabra(dif5.toLowerCase(), palabraEliminar);
					System.out.println("Palabra eliminada correctamente.");
					System.out.println("Asi quedan las recetas con dificultad 1:");
					System.out.println(dif5);

					break;
				}
				break;
			case 5: 
				System.out.println("¡Usted ha finalizado el programa!");
				salida = true;
				break;

			default:
				break;
			}
		} while (salida == false);
		
	}
}
