package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz
 * tarea 4
Solicita un número por teclado.

Una vez introducido el número muestra un contador donde aparezcan todos los números desde el 0 al número indicado.

¿Qué pasa si el número introducido es negativo? Vuestro programa debe funcionar con números positivos y negativos.


 */

public class Tarea4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Indica un numero: ");
		double numero = sc.nextInt();
		
		System.out.println("Resultado:");
		
		int i;
		
		if(numero>0) {
		for (i=0;i<=numero;i++) {
			System.out.println(" "+i);
		}
		}else {
		
		for (i=0; i>=numero ; i--) {
			System.out.println(""+i);
		}
		}

	}

}
