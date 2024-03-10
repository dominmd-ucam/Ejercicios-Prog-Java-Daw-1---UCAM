package unidad2;

/**
 * @author Domingo Martínez Díaz
 * 
 * Tarea 4
	Declara e inicializa las variables que necesites de manera que te permitan realizar las operaciones aritméticas básicas 
	(suma, resta, multiplicación, división y el módulo de la división).

	Pinta por consola la operación con su resultado.

 */

public class Tarea4 {

	public static void main(String[] args) {
		
		int suma = 0, resta = 0, multiplicacion = 0, a = 0, b = 0;
		float division = 0f, modulo = 0f;
		
		a = 2;
		b = 4;

		suma = a + b;
		resta = b - a;
		multiplicacion = a * b;
		division = b/a;
		modulo  = b%a;
		
		System.out.println("El resultado de la suma es: "+suma);
		System.out.println("El resultado de la resta es: "+resta);
		System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
		System.out.println("El resultado de la division es: "+(int)division);
		System.out.println("El modulo es: "+(int)modulo);
		
	}

}
