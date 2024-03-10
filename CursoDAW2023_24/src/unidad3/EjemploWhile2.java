package unidad3;

import java.util.Scanner;

public class EjemploWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre = "";
		
		int cont =0;
		
		do {
			System.out.println("Introduzca su nombre:");
			nombre = sc.nextLine();
			
			System.out.println("Nombre recogido "+nombre);
			cont++;
			}
		while(!nombre.equalsIgnoreCase("Pepe") && cont < 3);
		
		/*
		while (!nombre.equalsIgnoreCase("Pepe")) {
			System.out.println("Introduzca su nombre:");
			nombre = sc.nextLine();
			
			System.out.println("Nombre recogido "+nombre);
		}
		 */
	}

}
