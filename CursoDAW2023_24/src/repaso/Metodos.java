package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {
	
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

	public static void main(String[] args) {
		
		//MENU
		//SELECCIONA UNA OPCION:
		
		int opcion = 0;
		
		System.out.print("Dime un numero:");
		opcion = corrInt();
		
		
		//CASE 1
		// CASE 2
		
	}

}