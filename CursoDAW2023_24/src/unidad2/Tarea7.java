package unidad2;
/**
 * @author Domingo Martínez Díaz
 * Tarea 7
Crear una variable de tipo String que almacene el título de un libro. 

Mostrar por consola el título en mayúsculas. 

Mostrar por consola el carácter que hay en la posición 3.

Mostrar la longitud de la palabra. 

Decir si contiene la palabra Hola. 

Muestra todos los datos bien formateados. 
 * 
 * 
 */

public class Tarea7 {

	public static void main(String[] args) {
		
		String titulo = "Mike Tyson - Toda la verdad.";
		
		System.out.println("Titulo en mayusculas -> "+titulo.toUpperCase());
		System.out.println("Caracter de la posicion 3: "+titulo.charAt(2));
		System.out.println("Longitud del titulo: "+titulo.length());
		System.out.println("El titulo contiene la palabra \"Hola\" ? "+titulo.contains("hola"));
		

	}

}
