/**
 * U5 - Tarea 2
Realizar un proyecto en Java que permita gestionar coches.

Crear una clase Coche con los atributos matrícula, color, alerones, marca, modelo y debemos de saber si está alquilado o no.

Crear mínimo un constructor por defecto y otro en el que se le pasen todos los parámetros.

Crear los métodos get/set para todos los atributos.

Crear otra clase, Principal donde en el método main crearemos 2 objetos Coche con datos ficticios. Uno alquilado y otro no alquilado.

¿Qué haríamos si viene un cliente y quiere devolver el coche alquilado?
 */

package unidad5.tareas.tarea2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		
		ArrayList<Coche> listaCoches = new ArrayList<>();
		
		int opcion = 0;
		int i = 1;
		Boolean encontrado = false;
		
		Coche c1 = new Coche("49248504F","AZUL",2,"Tesla","Model Y", false);
		Coche c2 = new Coche("12345678A","ROJO",0,"Citroen","F600", true);
		
		listaCoches.add(c1);
		listaCoches.add(c2);
		do {
		System.out.println("--- Bienvenido al programa ---\n1) Devolver coche\n2) Mostrar todos los coches\n3) salir.\nSeleccione una Opcion: ");
		opcion = scInt.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Escriba la matricula del coche que desee devolver: ");
			String cocheDevolver = scString.nextLine();
			
			for (Coche coche : listaCoches) {
				if (cocheDevolver.equalsIgnoreCase(coche.getMatricula())) {
					encontrado = true;
					coche.setAlquilado(false);
					
					System.out.println("Su coche ha sido devuelto correctamente.");
				}
			}
			if (encontrado == false) {
				System.out.println("Coche NO encontrado.");
			}
			
			break;
		case 2:
			System.out.println("Todos los coches que hay es: ");
			for (Coche coche : listaCoches) {
					
				System.out.print("--- Coche "+i+"--- \n");
					coche.getVercoches();
					i++;
			}
			
			break;
		case 3:
			System.out.println("FIN DEL PROGRAMA.");
			break;
		}
	}while(opcion != 3);
		
	}

}
