package unidad3;
/*
 * Tarea 11
Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas 
por teclado como número de ventas se hayan indicado. 
Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

import java.util.Scanner;

public class Tarea11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero_ventas=0;
		
		System.out.println("Dime un numero de ventas: ");
		numero_ventas = sc.nextInt();
		
		double sumaVentas = 0;
		
		for(int i=1;i<=numero_ventas;i++) {
			System.out.println("Introduce la ganancia de la venta #"+i +": ");
			double venta = sc.nextDouble();
			sumaVentas = sumaVentas+venta;
		}
		System.out.println("La ganancia de todas las ventas es: "+sumaVentas+"€");

	}

}
