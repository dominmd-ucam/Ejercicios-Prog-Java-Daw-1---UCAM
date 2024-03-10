package unidad4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * U4 - Tarea 7
Crear un ArrayList agenda que contenga en cada una de sus posiciones un array de dos elementos donde el primer elemento será el nombre y el segundo será el teléfono.

                  String[] persona = new String[2];   // [nombre][telefono]

  ArrayList<String[]> agenda = new ArrayList<>();

Crear un menú que nos permita:

1) Insertar contactos (personas) en la agenda.

2) Buscar un contacto por nombre en la agenda.

3) Eliminar contacto de la agenda.

4) Mostrar todos los contactos de la agenda.

5) Salir.
 */

public class Tarea7 {
	
	public static void MENU () {
			
		System.out.println("1) Insertar contactos (personas) en la agenda.");
		System.out.println("2) Buscar un contacto por nombre en la agenda.");
		System.out.println("3) Eliminar contacto de la agenda.");
		System.out.println("4) Mostrar todos los contactos de la agenda.");
		System.out.println("5) Salir.");
		
	}
	
	public static String[] crearContacto() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el nombre del contacto: ");
		String nombre= sc.nextLine();
		
		System.out.print("Introduzca el telefono del contacto: ");
		String tlf = sc.nextLine();
		
		String[] persona =  {nombre, tlf};
		
		return persona;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		ArrayList <String[]> agenda = new ArrayList<>();
		int opcion_menu = 0;
		
		System.out.println("--- Bienvenido al programa ---");
		
		MENU();
		
		do {
		
		System.out.print("Seleccione una opcion: ");
		
		opcion_menu = scInt.nextInt();
		
		switch(opcion_menu){
		
		case 1:
			
			String[] p = crearContacto();
			agenda.add(p);
			System.out.println("Contacto añadido correctamente.");
			
			
			break;
			
		case 2:
			break;
			
		case 3:
			
			System.out.print("Introduzca el nombre que desea borrar: ");
			String nombreBorrar = sc.nextLine();
			
			/*
			if(agenda.remove(nombreBorrar)) { //Probar con for each y comparar contacto[0] con nombreBorrar
				System.out.println(nombreBorrar +" Borrado correctamente.");
			}else {
				System.out.println("No encontramos  a "+nombreBorrar +" en la lista");
				
			}*/
			
			
			break;
			
		case 4:
			
			for (String [] contacto : agenda) {
				System.out.println("Nombre: "+contacto[0]+" - Telefono: "+contacto[1]);
			}
			
			break;
			
		case 5:
			break;
			
		}
		
	}while(opcion_menu != 5);
		
		

	}

}
