package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Tarea 24
Crear un método "dobleOtriple" que se le pase por parámetro un número y evalúe si es par o impar.

Si es par el método devolverá un entero con el doble de su valor y si es impar devolverá el triple de su valor.

En el método main recogeremos por teclado un valor e invocaremos al método "dobleOtriple". Se pintará el valor devuelto por el método.

Preguntar al usuario si quiere volver a introducir otro valor o no. El programa terminará cuando el usuario responda "NO".


 */

public class Tarea24 {
	
	public static int dobleOtriple(int numero) {
		int num = 0;
		
		if (numero% 2 == 0){
			System.out.println("El numero "+numero+" es un numero PAR. ");
			num = numero*2;
			System.out.print("El doble de "+numero+" es: ");
		}else {
			System.out.println("El numero "+numero+" es un numero IMPAR. ");
			num = numero*3;
			System.out.print("El triple de "+numero+" es: ");
		}
		
	return num;
	}
	
	public static int correcInt() {
		int numero=0;
		Boolean valido = false;
	
		Scanner sc = new Scanner (System.in);
		
		do {
			try {
				numero = sc.nextInt();
				valido = true;
				
			}catch(InputMismatchException ex) {
				
				System.err.print("ERROR. Seleccione un numero valido: ");
				sc.next();
			}
			
		}while(valido==false);
		
		return numero;
	}

	public static void main(String[] args) {
		
		Scanner scInt = new Scanner (System.in);
		Scanner scString = new Scanner (System.in);
		
		String respuesta = "";
		int numero = 0;
		
		System.out.println("----- BIENVENIDO AL PROGRAMA -----");
		do {
			System.out.print("Dime un numero: ");
			numero = correcInt();
			
			System.out.println(dobleOtriple(numero)+"\n");
			
			System.out.print("Desea introducir otro valor? Escriba SI/NO: ");
			respuesta = scString.next().trim();
			
		}while (respuesta.equalsIgnoreCase("si"));
		
		System.out.println("\nHa salido del programa correctamente, hasta la proxima.\nFIN.");
	}

}
