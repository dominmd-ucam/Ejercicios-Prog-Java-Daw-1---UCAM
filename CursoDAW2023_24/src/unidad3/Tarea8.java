package unidad3;
/*Tarea 8
Crear una aplicación que solicite números hasta que la suma total de los números introducidos sea 100 o mayor de 100.

Mostrar por consola la operación que se ha realizado y su resultado.

Por ejemplo: 30 + 15 + 65 = 110
 * 
 */

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero=0, sumatotal = 0;
		String cadena = "";
		
		do {
		System.out.print("Introduce numeros hasta que sumen 100 o mas: ");
		numero = sc.nextInt();
		
		sumatotal = sumatotal + numero;
		cadena = cadena + numero + " + ";
		
		}
		while(sumatotal<100);
		
		System.out.println("Todos los numeros teclados son: "+cadena.substring(0,cadena.length()-2) +" = "+sumatotal);

	}

}
