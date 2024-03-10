package unidad3;

import java.util.Scanner;

/*
 * Tarea 12
Realizar un programa que lea un número de teclado pedido al usuario y muestre la tabla de multiplicar de dicho número.
 */

public class Tarea12_v1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.print("De que numero quieres saber la tabla de multiplicar ?");
			numero = sc.nextInt();

			switch (numero) {

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				tabla_multiplicar(numero);
				break;
			default: System.out.println("El numero introducido no es correcto."); break;
			}

		} while (numero != -1);

	}

	public static void tabla_multiplicar(int numero) {
		System.out.println("La tabla que has seleccionado es la " + numero);
		int resultado_tabla = 0;

		for (int i = 1; i <= 10; i++) {
			resultado_tabla = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado_tabla);
		}
	}
}