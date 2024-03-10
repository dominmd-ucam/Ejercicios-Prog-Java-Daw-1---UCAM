package unidad2;
/**
 * @author Domingo Martinez Diaz
 * Tarea 6
Declara una variable de tipo String que contenga tu nombre completo.

Busca un método que te ayude a pintar por consola la longitud de tu nombre, es decir cuantos caracteres tiene.

Con la ayuda de los métodos de la clase String:

Pinta por consola la longitud de tu nombre.
Muestra el primer carácter de tu nombre.
Muestra el último carácter de tu nombre.
Indicar si vuestro nombre contiene la letra 'a'. .contain char sequences
 */
public class Tarea6 {

	public static void main(String[] args) {
		
		
		
		String nombre = "Domingo Martinez Diaz";
		int longitud = nombre.length();		
		System.out.println("El tamano de mi nombre es: "+longitud);
		
		System.out.println("El primer caracter de mi nombre es: "+nombre.substring(0 , 1)); //Lo mismo que abajo
		System.out.println("El primer caracter de mi nombre es: "+nombre.charAt(0)); //Lo mismo que el de arriba
		
		System.out.println("El ultimo caracter de mi nombre es: .."+nombre.substring(20, 21));
		System.out.println("El ultimo caracter de mi nombre es: "+nombre.substring(longitud -1));
		System.out.println(nombre.substring(longitud-1));
		System.out.println(nombre.charAt(longitud-1));
		System.out.println("El tamano de mi nombre es: "+longitud);
		
		System.out.println("Mi nombre contiene la letra a ? " +nombre.contains("a"));
		
		
		
		
		

	}

}
