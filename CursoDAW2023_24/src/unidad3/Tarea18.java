package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz Tarea 18 Crear una aplicación que solicite una
 *         frase y la almacene en una variable.
 * 
 *         A continuación se crear un menú con las siguientes opciones:
 * 
 *         1. Mostrar la longitud (muestra el número de caracteres que contiene la frase) 
 *         2. Número de palabras (cuenta el número de palabras que contiene la frase y muestra el resultado) 
 *         3. Cambiar frase (vuelve a solicitar que se introduzca otra frase) 
 *         4. Mostrar la primera palabra (muestra la primera palabra de la frase introducida) 
 *         5. Mostrar la última palabra (muestra la última palabra de la frase introducida)
 *         Fin (termina la ejecución del programa)
 */

public class Tarea18 {
	
	public static int contarPalabras(String aux) {

		int contadorPalabras = 0;
		int p = 0;

		do {
			p = aux.indexOf(" ");
			aux = aux.substring(p + 1);
			contadorPalabras++;
		} while (p != -1);
		return contadorPalabras;
	}
	

	public static void main(String[] args) {

		Scanner scfrase = new Scanner(System.in);
		Scanner sc = new Scanner (System.in);
		
		int numero=0;

		String frase = "";
		String salida = "";
		
		System.out.print("Introduce una frase: ");
		frase = scfrase.nextLine().trim();
		
		do {
			
			System.out.println("-----MENU----");
			System.out.println("1. Mostrar la longitud de la frase. ");
			System.out.println("2. Numero de palabras. ");
			System.out.println("3. Cambia frase. ");
			System.out.println("4. Mostrar la ultima palabra. ");
			System.out.println("5. Mostrar la primera palabra. ");
			try {
			System.out.print("Selecciona un numero: ");
			numero = sc.nextInt();
			}catch (InputMismatchException ex){
				System.out.println("Debe introducir numeros !!");
				sc.nextInt();
				numero = 0;
			}
			
			switch(numero){
			case 1:
				System.out.println("La longitud de la frase es de:"+frase.length());
				break;
			case 2:
				contarPalabras(frase);
				
			/*	String aux = frase;
				int contadorPalabras=0;
				int p=0;
				
				do {
				p = aux.indexOf(" ");
				aux = aux.substring(p+1);
				contadorPalabras++;
				}while(p != -1);
				
				System.out.println("El numero de palabras que contiene la frase es: "+contadorPalabras);
			*/	
				break;
			case 3:
				System.out.print("Escriba la nueva frase: ");
				frase = scfrase.nextLine().trim();
				break;
			case 4:
				System.out.println("La ultima palabra es: ");
				//System.out.println(frase.split(" ").length); //indexoff y substring
				System.out.println(frase.substring(frase.lastIndexOf(" ")+1));
				break;
			case 5:
				System.out.println("La primera palabra es: ");
				System.out.println(frase.substring(0,frase.indexOf(" ")));
			default:
				System.out.println("¡¡La opcion seleccionada no es valida!!");
			}
			System.out.println("Si quiere realizar otra consulta escriba CONTINUAR o si quiere salir escriba SALIR");
			salida = scfrase.nextLine().trim();
		}while (!salida.toUpperCase().equalsIgnoreCase("SALIR")); //Error igual al ejercicio 17, no se sale del programa correctamente
		
		System.out.println("FIN DEL PROGRAMA");

	}

}
