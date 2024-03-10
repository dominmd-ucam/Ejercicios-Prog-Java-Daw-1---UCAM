package unidad4;

import java.util.Scanner;

/**
 * U4 - Tarea 4
Crear un array multidimensional de 3x2 de char, darle valores y mostrarlos. Utilizar bucles para recorrerlo.

Crea un método que solicite un caracter y lo busque dentro de la matriz. Si lo encuentra o no mostrar mensaje indicándolo. 

Utilizar el método en la clase principal.
 */

public class Tarea4 {

	public static void main(String[] args) {
		int x=0;
		int i=0;
		
		Scanner sc = new Scanner (System.in);
		
		char letra ;
		
		char array [][] = new char [3][2];
		
		array[0][0] = 'a';
		array[0][1] = 'b';
		
		array[1][0] = 'c';
		array[1][1] = 'd';
		
		array[2][0] = 'e';
		array[2][1] = 'f';
		
		System.out.print("Dime una letra para buscarla: ");
		letra = sc.next().trim().charAt(0);
		
		for ( i=0; i<array.length ;i++) {
			
			for (x=0; i<array[i].length;i++) {
				
				if(array[i][x] == letra ) {
					System.out.println("La letra se encuentra en la posicion de la matriz: "+i+"-"+x);
				}else {
					System.err.println("Esa letra no se encuentra en ninguna posicion de la matriz. ");
				}
				
			}
		}	
			
		}

	}
