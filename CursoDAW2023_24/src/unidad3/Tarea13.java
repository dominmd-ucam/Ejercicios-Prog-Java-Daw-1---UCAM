package unidad3;

import java.util.Scanner;

/* 
 * @author Domingo Martinez Diaz
 * Tarea 13
Realizar un programa que lea 5 notas de alumnos por teclado
y que al final me diga cuántos aprobados y cuántos suspensos hay.
 */
public class Tarea13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String notas_total = "", notas_aprobadas = "", notas_suspensas = "" ;
		
		int contador_notas = 1, contador_aprobadas = 0, contador_suspensas = 0, nota = 0;

		do {
			System.out.print("Indicame las notas de los 5 alumnos una a una:");
			nota = sc.nextInt();

			if (nota >= 5 && nota <= 10) {
				// Notas aprobadas
				contador_aprobadas++;
				notas_aprobadas = notas_aprobadas +", " + nota;

			} else if (nota < 5 && nota >= 0) {
				// Notas suspensas
				contador_suspensas++;
				notas_suspensas = notas_suspensas +", " + nota;
			} else {
				System.out.println("La nota introducida no es correcta.");
				contador_notas--;
			}

			notas_total = notas_total +"," +nota ;
			contador_notas++;
		} while (contador_notas <= 5);

		System.out.println("Las notas indicadas son:" + notas_total.substring(1));
		System.out.println("De las cuales hay " +contador_suspensas + " notas suspensas y sus notas son:" + notas_suspensas.substring(1));
		System.out.println("Y aprobadas hay " + contador_aprobadas + " aprobadas con las notas:" + notas_aprobadas.substring(1));

	}

}
