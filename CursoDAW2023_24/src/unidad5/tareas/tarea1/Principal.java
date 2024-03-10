package unidad5.tareas.tarea1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un menú que nos permita:
 * 
 * 1) Insertar contactos (personas) en la agenda.
 * 
 * 2) Buscar un contacto por nombre en la agenda.
 * 
 * 3) Eliminar contacto de la agenda.
 * 
 * 4) Mostrar todos los contactos de la agenda.
 * 
 * 5) Salir.
 */

public class Principal {
	public static Contacto buscarContacto(ArrayList<Contacto> lista, String msn) {

		Scanner sc = new Scanner(System.in);
		System.out.println(msn);
		String nombre = sc.nextLine();

		for (Contacto contacto : lista) {
			return contacto;
		}

		return null;
	}

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);

		ArrayList<Contacto> agenda = new ArrayList<>();

		int opcion = 0;

		do {
			System.out.println("OPCIONES: \n1) Insertar \n2) Buscar \n3) Eliminar \n4) Mostrar \n5) Salir");
			opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduzca su nombre: ");
				String nombre = scString.nextLine();

				System.out.println("Introduzca su telefono: ");
				int tlf = scString.nextInt();

				Contacto c = new Contacto(nombre, tlf);
				agenda.add(c);
				break;
			case 2:
				Contacto cBuscar = buscarContacto(agenda, "Introduzca el nombre del contacto que desea buscar: ");
				if (cBuscar != null) {
					System.out.println("Nombre: " + cBuscar.getNombre() + " - Telefono: " + cBuscar.getTelefono());
				}else {
					System.out.println("Contacto NO encontrado.");	
				}
				break;
			case 3:
				
				Contacto cEliminar = buscarContacto(agenda, "Introduzca  el nombre que desea eliminar: ");
				
				if(cEliminar  !=null ) {
					agenda.remove(cEliminar);
				}else {
					System.out.println("Contacto NO eliminado. No existe ese contacto en la agenda.");
				}
				
			case 4:
				for (Contacto contacto : agenda) {
					System.out.println("Nombre: " + contacto.getNombre() + "- Telefono: " + contacto.getTelefono());
				}
				break;
			case 5:
				break;
			}
		} while (opcion != 5);
	}
}
