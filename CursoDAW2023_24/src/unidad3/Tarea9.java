package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz
 * Tarea 9
Solicitar un número entero por teclado e indicar si es par o impar.

Seguir haciendo esto hasta que el usuario introduzca el valor -1, en ese caso mostraremos un mensaje y finalizaremos el programa.

 */

public class Tarea9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		
		do {
		System.out.print("Dime un numero:");
		numero = sc.nextInt();
			if (numero % 2 == 1) {
				System.out.println("El numero indicado "+numero +" es Impar.");
				
			}
			else if(numero < 0){
				System.out.println("El numero " +numero +" es un numero negativo.");
				
			}else if (numero % 2 == 0) {
				System.out.println("El numero indicado "+numero +" es Par.");
			}else {
				System.out.println("El numero introducido no es correcto.");
			}
		}
		
		while( numero != -1);
		System.out.println("FIN.");
		

	}

}





