package unidad3;
/**
 * @author Domingo Martinez Diaz
 * Tarea 7
	Id solicitando números y sumando hasta que el número introducido sea 0.
	Cuando se introduzca el 0 no seguimos pidiendo más números y mostramos todos los números separados por coma. 
	Mostrar también el resultado de la suma final.

 */

import java.util.Scanner;

public class Tarea7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero=0, suma_numeros=0;
		String cadena_numeros = "";
		
		do {
			System.out.print("Ecribe un numero: ");
			numero = sc.nextInt();
			suma_numeros = suma_numeros + numero;
			cadena_numeros = cadena_numeros +", "+ numero;
		}
		while(numero!=0);
		
		System.out.println("La suma de todos los numeros es: "+suma_numeros);
		System.out.println("Los numeros son: "+cadena_numeros.substring(1, cadena_numeros.length()-3));

		

	}

}
