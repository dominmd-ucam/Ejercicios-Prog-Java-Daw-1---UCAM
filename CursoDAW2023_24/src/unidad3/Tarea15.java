package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz
 * Tarea 15 - Control de errores
Utilizando la tarea 1:

Crea una aplicación que muestre el nombre del cliente y la cantidad de artículos comprados.

Evaluar el número de artículos comprados y según esto mostrar un mensaje indicando cómo deberá pagar el cliente:

Si la cantidad es menor de 5 pagara en efectivo,
si es mayor de 5 y menor de 12 pagara con tarjeta, 
si es mayor de 13 pagara con cheque.
METE CONTROL DE ERRORES DE MANERA QUE SI LA CANTIDAD DE ARTICULOS NO ES UN VALOR NUMÉRICO MUESTRE ERROR Y DEJE VOLVER A SOLICITAR ESTE DATO.

 */
/*
public class Tarea15 {

	public static void main(String[] args) {
		
		Scanner scNombre = new Scanner(System.in);
		Scanner scCantidadArticulos = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		String nombre = scNombre.nextLine();
		boolean valido = false;
		
		System.out.println("Cuantos articulos has comprado? ");
		
		do {
			if(scCantidadArticulos.hasNextInt()) {
				
				int CantidadArticulos = scCantidadArticulos.nextInt();
				valido = true;
			
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
				else {
				System.err.println("La cantidad de articulos tiene que ser numerica.");
				System.out.println("Introduzca de nuevo  la cantidad de articulos comprados: ");
				scCantidadArticulos.next();
				}
		}while(!valido);
		
			
		}
}
*/
//PRUEBAS
public class Tarea15 {

	public static void main(String[] args) {
		
		Scanner scNombre = new Scanner(System.in);
		Scanner scCantidadArticulos = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = scNombre.nextLine();
		boolean valido = false;
		
		System.out.print("Cuantos articulos has comprado? ");
		
		do {
			valido = scCantidadArticulos.hasNextInt();
			if(valido) {
				
				int CantidadArticulos = scCantidadArticulos.nextInt();
			//	valido = true;
			
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
				else {
					
				System.err.println("La cantidad de articulos tiene que ser numerica.");
				System.out.print("Introduzca de nuevo  la cantidad de articulos comprados: ");
				scCantidadArticulos.next();
				
				}
		}while(!valido);
		
			
		}
}
