/*
 * @author: Domingo Martinez Diaz
 * 
 * Tarea 23
Crear un método "numerosImpares" que pasándole por parámetro un número entero pinte esa cantidad en números impares a partir del 5. 

Por ejemplo, si se introduce 3 se pintará por pantalla 5, 7, 9 ó si se introduce 10 pintará 5, 7, 9, 11, 13, 15, 17, 19, 21, 23.  
El método no devolverá nada.


 */

package unidad3;

import java.util.Scanner;

public class Tarea23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		Boolean valido = false;

		do {
			try {
				System.out.println("Introduce un numero entero:");
				cantidad = sc.nextInt();
				
			}catch(Exception ex) {
				System.err.println("Introduzca un numero correctamente");
				sc.nextInt();
			}
			
		}while(valido==false);
		

		numerosImpares(cantidad);

	}

	public static void numerosImpares(int cantidad) {
		int impar = 5;

		for (int i = 0; i < cantidad; i++) {
			if (impar % 2 == 1) {
				System.out.println(impar);
				impar++;
			} else if (impar % 2 == 0) {
				i--;
				impar++;
			} else {
				System.err.println("ERROR");
			}
		}

	}

}
