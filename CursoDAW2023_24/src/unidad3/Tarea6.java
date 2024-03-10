package unidad3;

/**
 * @author Domingo Martinez Diaz Tarea 6 Mostrar los números impares del 1 al
 *         100 utilizando el bucle for.
 */

public class Tarea6 {

	public static void main(String[] args) {

		int numero = 0;
		int guardar_numero=0;
		String numeros_negativos = "";

		for (int i = 0; i <= 10; i++) {
			guardar_numero = i;
			numero = i % 2;
			if (numero == 1) {
				System.out.println("El "+i + " es un numero impar.");
				numeros_negativos = numeros_negativos +guardar_numero +", ";
			} /* 		//Esto es para poner tambien los pares.
				else {
				System.out.println(+i + " Es un numero par.");
			}*/

		}
		
		System.out.println("\n"+"Todos los numeros negativos son: "+numeros_negativos +".");

	}
}
