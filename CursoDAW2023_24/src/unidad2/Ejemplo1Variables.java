package unidad2;

/**
 * @author Domingo Martinez Diaz
 * Ejercicio de variables hecho en clase.
 */

public class Ejemplo1Variables {

	public static void main(String[] args) {
		
		final String SALUDO_INICIAL="Bienvenidos al curso 2023/24";
		int numAlumnos = 30 ;
		byte curso = 0;
		float nota = 9.8f;
		double salario = 5000;
		char LetraA = 'A';
		
		char comilla = '\'';
		char barra = '\\';
		
		System.out.println(SALUDO_INICIAL);
		System.out.println(barra);
		System.out.println("\"Buenos días\" \n\t Hoy es lunes!!");
		
		
		//System.out.println(SALUDO_INICIAL);
		
		//System.out.println(numAlumnos);
		
		numAlumnos = 40;
		
		System.out.print("Numero de Alumnos: ");
		System.out.println(numAlumnos);
		
		
	}

}
