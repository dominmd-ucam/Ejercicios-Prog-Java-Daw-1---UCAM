package unidad4;

import java.util.Scanner;

/**
 * El cálculo de la letra del Documento Nacional de Identidad (DNI) es un proceso matemático sencillo que se basa en obtener el resto de la división entera del número de DNI y el número 23. A partir del resto de la división, se obtiene la letra seleccionándola dentro de un array de letras.

El array de letras es:

char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};

Por tanto si el resto de la división es 0, la letra del DNI es la T y si el resto es 3 la letra es la A. Con estos datos, elaborar un pequeño script que:

Almacene en una variable el número de DNI indicado por el usuario y en otra variable la letra del DNI que se ha indicado.

En primer lugar se debe comprobar si el número es menor que 0 o mayor que 99999999. Si ese es el caso, se muestra un mensaje al usuario indicando que el número proporcionado no es válido y el programa no muestra más mensajes.

Si el número es válido, se calcula la letra que le corresponde según el método explicado anteriormente.

Una vez calculada la letra, se debe comparar con la letra indicada por el usuario. Si no coinciden, se muestra un mensaje al usuario diciéndole que la letra que ha indicado no es correcta. En otro caso, se muestra un mensaje indicando que el número y la letra de DNI son correctos.

**  Crear un método calcularLetra que pasándole por parámetro de entrada el número del dni te devuelva la letra que correspondería a ese número.


 */

public class Tarea5 {
	
	public static char calcularLetra(int numero_dni) {
		Scanner scChar = new Scanner (System.in);
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		
		int numero_letra;
		
		System.out.print("Indicame su letra del DNI para comprobarla: ");
		char letra = scChar.nextLine().toUpperCase().charAt(0);
		
		numero_letra = numero_dni % 23;
		
		
		if(letra == letras[numero_letra] ) {
			System.out.println("Letra y numeros introducidos correctamente.");
		}else {
			System.out.println("ERROR. La letra introducida no coincide.");
		}
		
		return letras[numero_letra];
	}

	public static void main(String[] args) {
		Scanner scInt = new Scanner (System.in);
		
		int numero_dni = 0, numero_letra = 0;
		char letra;
		
		System.out.print("Dime el numero de tu DNI: ");
		numero_dni = scInt.nextInt();
		
		System.out.print("La letra correspondiente al numero introducido es: "+calcularLetra(numero_dni));
		
	}


}
