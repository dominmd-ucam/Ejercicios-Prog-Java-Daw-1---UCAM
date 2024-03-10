package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;

		System.out.print("Introduzca un numero: ");

		try {
			numero = sc.nextInt();
			System.out.println("Numero recogido " + numero);
		} catch (InputMismatchException ex) {
			System.err.println("No ha introducido un numero.");
			ex.printStackTrace();
			sc.next();
		} catch (Exception ex) {

		}

		System.out.println("Fin.");
	}

}
