/**
 * @author Domingo Martinez Diaz
 * Tarea 13 - Con métodos
Hacer la tarea anterior utilizando métodos.

Para ello nos crearemos un método "obtenerNotas" que tenga como parámetro de entrada el número de notas que tenemos que solicitar y nos devuelva una cadena de texto que indique los aprobados y suspensos.

Desde el método main tendremos que invocar al método y mostrar el resultado.
 */
package unidad3;

import java.util.Scanner;

public class Tarea13ConMetodos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero_notas = 0;

		System.out.print("Indica el numero de notas que va a introducir: ");
		numero_notas = sc.nextInt();

		String total_notas = obtenerNotas(numero_notas);
		System.out.println(total_notas);

	}
	

	public static String obtenerNotas(int cantidad_notas) {
		Scanner sc = new Scanner(System.in);
		String notas_total = "", notas_aprobadas = "", notas_suspensas = "", resultado = "";
		int i = 1, nota = 0, contador_aprobadas = 0, contador_suspensas = 0;

		do {
			System.out.print("Indicame las notas de los alumnos una a una:");
			nota = sc.nextInt();

			if (nota >= 5 && nota <= 10) {
				// Notas aprobadas
				contador_aprobadas++;
				notas_aprobadas = notas_aprobadas + ", " + nota;

			} else if (nota < 5 && nota >= 0) {
				// Notas suspensas
				contador_suspensas++;
				notas_suspensas = notas_suspensas + ", " + nota;
			} else {
				System.err.println("La nota introducida no es correcta."); //Este sysout saleen rojo por el .err.  (ERROR)
				i--;
			}

			notas_total = notas_total + "," + nota;

			i++;
		} while (i <= cantidad_notas);
		
		/*
		System.out.println("Las notas "+cantidad_notas +" indicadas son:" + notas_total.substring(1));
		System.out.println("De las cuales hay " + contador_suspensas + " notas suspensas y sus notas son:"+ notas_suspensas.substring(1));
		System.out.println("Y aprobadas hay " + contador_aprobadas + " aprobadas con las notas:" + notas_aprobadas.substring(1));
		*/
		resultado = "Tienes " +contador_aprobadas +" aprobados y " +contador_suspensas +" suspensos.";
		return resultado;
	}

}
