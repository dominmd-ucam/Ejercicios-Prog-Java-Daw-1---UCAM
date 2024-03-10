package unidad6.tareas.tarea2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static String pedirDificultad() {
		Scanner sc = new Scanner (System.in);
		String dificultad =  "";
		
		do {
			dificultad = sc.nextLine().trim().toLowerCase();
			
			if(Receta.validarDificultad(dificultad)) {
				System.out.println("Dificultad " +dificultad +"  seleccionada correctamente.");
			}else {
				System.out.println("Selecciona de nuevo la dificultad:");
				dificultad = sc.nextLine().trim();
			}
		}while(!Receta.validarDificultad(dificultad));
		
		return dificultad;
	}
	
	public static double pedirTiempo() {
		Scanner sc = new Scanner (System.in);
		
		double tiempo = 0;
		boolean valido = false;
		do {
			try {
				tiempo = sc.nextDouble();
				if(tiempo>=0) {
					System.out.println("Tiempo introducido correctamente.");
					valido=true;
				}else {
					System.err.println("No se puede introducir un tiempo negativo. ");
					System.out.print("Escribe de nuevo el tiempo de la receta: ");
				}
				
			}catch(InputMismatchException ex) {
				System.err.println("ERROR. Deben ser valores numericos y utilizando comas en numeros decimales: ");
				sc.next();
			}
		}while(!valido);
		
		return tiempo;
	}
	
	public static int corrInt() {
		Scanner scInt = new Scanner (System.in);
		boolean valido = false;
		int num = 0;
		do {
		try {
			num = scInt.nextInt();
			valido = true;
		}catch(InputMismatchException ex) {
			System.err.print("ERROR. No puedes poner letras:");
			scInt.next();
			valido = false;
		}
		}while(!valido);

		return num;
	}
	
	public static void menu() {
		
		System.out.println("1) Crear receta.\n"
				+ "2) Mostrar todas las recetas.\n"
				+ "3) Buscar receta.\n"
				+ "4) Mostrar receta por dificultad.\n"
				+ "5) Salir.");
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Receta.recetasDeEjemplo(); //Iniciamos todas las recetas de ejemplo.
		
		int opcion = 0;
		String dificultad = "";
		
		System.out.println("--- Bienvenido al programa ---");
		
		do {
			menu();
			System.out.print("Selecciona una opcion:");
			opcion = corrInt();
			switch (opcion) {
			case 1:
				
				Receta.crearReceta();
				
				break;
			case 2:
				
				Receta.mostrarRecetas();
				
				break;
			case 3:
				
				Receta.buscarReceta();
				
				break;
			case 4:  //CORREGIR, CUANDO PONES MAL DE PRIMERAS LA DIFICULTAD, NO SE HACE BIEN
				System.out.println("Dime la dificultad que desea buscar (facil/media/dificil): ");
				dificultad = sc.nextLine().toLowerCase().trim();
				Receta.validarDificultad(dificultad);
				Receta.mostrarRecetasDificultad(dificultad);
				
				break;
			case 5:
				break;
			default:
				System.err.println("error. selecciona una opcion del menu.");
				break;
			}
		}while(opcion !=5);
		
		
	}

}
