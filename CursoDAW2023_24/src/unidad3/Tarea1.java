package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz
 * Tarea 1
Crea una aplicación que muestre el nombre del cliente y la cantidad de artículos comprados.

Evaluar el número de artículos comprados y según esto mostrar un mensaje indicando cómo deberá pagar el cliente:

Si la cantidad es menor de 5 pagara en efectivo,
si es mayor de 5 y menor de 12 pagara con tarjeta, 
si es mayor de 13 pagara con cheque.
 */

public class Tarea1 {

	public static void main(String[] args) {
		
		Scanner scNombre = new Scanner(System.in);
		Scanner scCantidadArticulos = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = scNombre.nextLine();
		
		System.out.println("Cuantos articulos has comprado? ");
		int CantidadArticulos = scCantidadArticulos.nextInt();
		
		if(CantidadArticulos < 5) {
			System.out.println("Tiene que pagar en efectivo.");
			
		} else if(CantidadArticulos >= 5 && CantidadArticulos <= 12){
			System.out.println("Tiene que pagar con tarjeta.");
			
		}else if(CantidadArticulos >= 13) {
			System.out.println("Tiene que pagar con cheque.");
		}else {
			System.out.println("ERROR !!!");
		}
}
	
}
