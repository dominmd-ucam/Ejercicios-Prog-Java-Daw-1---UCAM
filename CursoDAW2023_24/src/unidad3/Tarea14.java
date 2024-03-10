/**
 * @author Domingo Martinez Diaz
 * Tarea 14 - Calculadora
Crear un método Calcular con tres parámetros de entrada . Dos números y un símbolo que indique la operación. El método nos devolverá un String con la operación y el resultado.
 */

package unidad3;

import java.util.Scanner;

public class Tarea14 {
	
	public static String Calcular(int numero1, int numero2, char op) {
		int resultado = 0;
		String total = "";
		switch(op){
		
		case '+': 
			System.out.println("Has seleccionado la operacion SUMA");
			resultado = numero1 + numero2;
			total = "La suma "+numero1 +"+"+numero2 +"="+resultado;
			
			break;
			
		case '-': 
			System.out.println("Has seleccionado la operacion RESTA");
			resultado = numero1 - numero2;
			total = "La resta "+numero1 +"-"+numero2 +"="+resultado;
			
			break;
			
		case '*': 
			System.out.println("Has seleccionado la operacion MULTIPLICACION");
			resultado = numero1 * numero2;
			total = "La multiplicacion "+numero1 +"*"+numero2 +"="+resultado;
			
			break;
			
		case '/': 
			System.out.println("Has seleccionado la operacion DIVISION");
			resultado = numero1 / numero2;
			total = "La division "+numero1 +"/"+numero2 +"="+resultado;
			
			break;
		default: System.out.println("ERROR"); break;
		}
		return total;
	} 


	public static void main(String[] args) {
		
		Scanner scNumeros = new Scanner(System.in);
		Scanner scLetras = new Scanner(System.in);
		
		int num1=0, num2=0;
		
		
		System.out.println("Siendo los simbolos: | + SUMA | - RESTA | * MULTIPLICACION | / DIVISION |");
		System.out.print("Indicame la operacion deseada: ");
		char operacion = scLetras.next().charAt(0);
		System.out.print("Escribe el primer numero de la operacion: ");
		num1 = scNumeros.nextInt();
		System.out.print("Escribe el segundo numero de la operacion: ");
		num2 = scNumeros.nextInt();
		
		System.out.println(Calcular(num1, num2, operacion));
		
		scNumeros.close();
		scLetras.close();
	}


}
