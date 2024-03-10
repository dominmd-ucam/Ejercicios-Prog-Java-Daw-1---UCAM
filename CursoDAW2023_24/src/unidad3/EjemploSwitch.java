package unidad3;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero del 1-3: ");
		int numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Escribiste el 1.");
			break;
		case 2:
			System.out.println("Escribiste el 2.");
			break;
		case 3:
			System.out.println("Escribiste el 3.");
			break;

		default:
			System.out.println("ERROR. Numero no contemplado.");
			break;
		}

	}

}
