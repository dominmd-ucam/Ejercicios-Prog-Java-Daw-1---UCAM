package unidad3;

import java.util.Scanner;

public class PRACTICA1 {

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scChar = new Scanner (System.in);
		
		//char opcionLetra = ' ';
		
		String alta = "RECETA1 RECETA2";
		String media = "RECETA3 RECETA4";
		String baja = "RECETA5";

		System.out.println("BIENVENIDO A NUESTRO PROGRAMA");

		System.out.println("----- MENU -----");
		System.out.println("1) Anadir nuevas recetas.");
		System.out.println("2) Mostrar recetas por dificultad.");
		System.out.println("3) Total recetas.");
		System.out.println("4) Eliminar receta.");
		System.out.println("5) FIN.");
		System.out.print("Seleccione una de las opciones: ");
		int opcionMenu = scInt.nextInt();

		switch (opcionMenu) {
		case 1:
			
			break;
		case 2:
			System.out.println("Dime la dificultad que deseas mostrar siendo ALTA(A) / MEDIA(M) / BAJA(B): ");
			char opcionLetra = scChar.nextLine().charAt(0);
			
			switch(opcionLetra) {
			case 'A': 
				break;
			case 'M': 
				break;
			case 'B': 
				break;
			}
			
		
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		}

	}

}
