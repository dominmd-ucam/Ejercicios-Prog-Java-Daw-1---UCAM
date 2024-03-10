package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz
 * Tarea 2
Crear una aplicación que solicite dos valores numéricos y mostrar cual es el número mayor introducido o si son iguales (indicándolo).
 */

public class Tarea2 {

	public static void main(String[] args) {
		
		Scanner scNumero1 = new Scanner(System.in);
		Scanner scNumero2 = new Scanner(System.in);
		
		System.out.println("Dime dos valores numericos.");
		System.out.println("Primer Numero:");
		int numero1 = scNumero1.nextInt();
		System.out.println("Segundo Numero:");
		int numero2 = scNumero2.nextInt();
		
		System.out.println("Los numeros son "+numero1 +" y "+numero2);
		
		if(numero1 == numero2) {
			System.out.println("Los numeros son iguales.");
		}else if(numero1 > numero2) {
			System.out.println("El primer numero es el mayor");
		}else {
			System.out.println("El segundo numero es el mayor");
		}
	}

}
