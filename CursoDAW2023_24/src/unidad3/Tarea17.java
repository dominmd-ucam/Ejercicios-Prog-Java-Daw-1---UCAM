package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz
 * Tarea 17
Realizar un programa en el que leamos una palabra
y tiene que salir por consola lo siguiente:

    Si leo "Hola"
    Consola:
    Letra 1: H
    Letra 2: o
    Letra 3: l
    Letra 4: a

** Mejora: El programa no termine hasta que la palabra introducida sea "Fin"
 */

public class Tarea17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String palabra = "";
		String salida = "";
		
		do {
			System.out.print("Dime una palabra para descifrarla letra por letra: ");
			palabra = sc.nextLine().trim();
			for(int i = 0; i<palabra.length(); i++) {
				
				System.out.println("Letra "+(i+1)+": "+palabra.charAt(i));
			}
			System.out.println("Quieres Continuar ? Escribre SEGUIR/FIN: ");
			salida = sc.nextLine().trim();
		}while(!salida.toUpperCase().equalsIgnoreCase("FIN")); 
		
		System.out.println("FIN DEL PROGRAMA");

	}

}