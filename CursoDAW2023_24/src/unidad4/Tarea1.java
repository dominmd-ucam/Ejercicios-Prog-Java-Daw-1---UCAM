package unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		int sumaTotal = 0;
		Boolean salida = false;

		System.out.println("Indica 5 numeros entre 0 y 50:");

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.print("Numero " + (i + 1) + " : ");
				int numero = sc.nextInt();
				if (numero >= 0 && numero <= 50) {
					numeros[i] = numero;
					sumaTotal = sumaTotal + numeros[i];
					salida = true;
				} else {
					System.err.println("ERROR. Numero no valido. Indique un numero entre 0 y 50");
					i--;
					salida = false;
				}

			} catch (InputMismatchException ex) {
				System.err.println("ERROR. No se deben introducir letras, intentalo con numeros entre 0 y 50.");
				sc.next();
				i--;
			}
		}

		System.out.print("La suma total de todos los numeros del Array es: " + sumaTotal);

	}

}
