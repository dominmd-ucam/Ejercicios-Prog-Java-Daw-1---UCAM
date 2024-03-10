package unidad3;
/*
 * @author Domingo Martinez Diaz
 * Tarea 5
Hacer un programa que lea 10 números y que diga si se ha introducido algún número negativo.

Muestra los valores negativos que se han introducido.
 */

import java.util.Scanner;

public class Tarea5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		String numNegativos = "";

		/*
		 * METODO CON BUCLE FOR for(int i=0;i<=10;i++) {
		 * System.out.print("Escribe un numero:"); int numero = sc.nextInt(); if
		 * (numero<0) { System.out.println("Este numero es negativo"); }
		 * 
		 * }
		 */
		/*
		 * METODO CON BUCLE WHILE int i=0; while(i<10) {
		 * 
		 * System.out.print("Escribe un numero:"); int numero = sc.nextInt();
		 * 
		 * if (numero<0) { System.out.println("El numero es negativo."); } i++; }
		 */

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca el numero: ");
			numero = sc.nextInt();

			if (numero < 0) {
				numNegativos = numNegativos + ", " + numero;

			}
		}
		if (!numNegativos.isEmpty()) { // numNegativos.isEmpty() == false
			System.out.println("Los numeros negativos son: " + numNegativos.substring(1));
		} else {
			System.out.println("Todos los numeros son positivos.");
		}
		System.out.println("FIN.");
	}
}
