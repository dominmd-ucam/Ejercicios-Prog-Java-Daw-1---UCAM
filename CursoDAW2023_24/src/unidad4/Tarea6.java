package unidad4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * U4 - Tarea 6
Crear una aplicación que solicite 5 nombres y los guarde en un array.

Una vez insertados todos los nombres vamos a crearnos un menú:

1) insertar otro nombre al array

2) Borrar un elemento del array indicando la posición del elemento a borrar.

3) Mostrar los elementos del array.

4) Salir.
 */

public class Tarea6 {

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int opcion_menu = 0;
		String nombre = "";

		ArrayList<String> Lista_nombres = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca 5 nombres:");
			System.out.print("Nombre " + (i + 1) + ":");
			nombre = sc.nextLine().trim();
			Lista_nombres.add(nombre);
		}

		System.out.println("---MENU---");
		System.out.println("1) Insertar otro nombre  en el array.");
		System.out.println("2) Borrar un elemento del array indicando la posicion");
		System.out.println("3) Mostrar los elementos del array.");
		System.out.println("4) Salir");
		System.out.println("5) Borrar por nombre.");

		do {
			try {
				System.out.println("Seleccione la opcion del menu que desea ejecutar: ");
				opcion_menu = scInt.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("ERROR. Introduzca solo numeros del 1 al 4");
				scInt.next();
			}

			switch (opcion_menu) {
			case 1:
				System.out.println("Inserta otro nombre para añadir: ");
				nombre = sc.nextLine().trim();
				Lista_nombres.add(nombre);

				break;
				/*
			case 2:
				System.out.println("Introduzca la posicion del elemento que desea borrar:");
				int pos = scInt.nextInt() - 1;
				
				if(pos>=0 && pos < Lista_nombres.size()) {
					Lista_nombres.remove(pos);
					System.out.println("Asi ha quedado la lista despues de borrar " + Lista_nombres.remove(pos));
					System.out.println(Lista_nombres);
				}else {
					System.out.println("ERROR: Noexiste elemento en la posicion indicada ");
				}
				
				break;*/
			case 2:
				System.out.println("Introduzca la posicion del elemento que desea borrar:");
				try {
					int pos = scInt.nextInt() - 1;
					
					System.out.println("Se ha borrado el nombre : "+Lista_nombres.remove(pos));
				}catch(IndexOutOfBoundsException ex) {
					
				}catch (InputMismatchException ex) {
					System.out.println("ERROR. Introduzca solo numeros del 1 al " +Lista_nombres.size());
					scInt.next();
				}catch(Exception ex) {
					System.out.println("ERROR.");
				}
				
				break;
				
			case 3:
				for(String nom: Lista_nombres) {
					System.out.println("Nombre: "+nom);
				}
				/*for(int i=0; i<Lista_nombres.size(); i++) {
					System.out.println("Nombre "+(i+1)+":" +Lista_nombres.get(i));
				}*/
				// System.out.println(Lista_nombres);
				break;
			case 4:
				System.out.println("Gracias por usar el programa.");
				System.out.println("FIN.");
				break;
			case 5:
				System.out.print("Introduzca el nombre que desea borrar: ");
				String nombreBorrar = sc.nextLine();
				
				if(Lista_nombres.remove(nombreBorrar)) {
					System.out.println("Borrado == "+nombreBorrar);
				}else {
					System.out.println("No encontramos  a "+nombreBorrar +" en la lista");
					
				}
				
				break;
				
				
			default:
				break;
				

			}
		} while (opcion_menu != 4);

	}

}
