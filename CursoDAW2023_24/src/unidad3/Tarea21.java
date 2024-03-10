/*
 * Tarea 21
	Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.

** Importante control de errores.

** Resolver creando un método.
 */

package unidad3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea21 {

	public static void main(String[] args) {
		Boolean esHora = false;

		Scanner scInt = new Scanner(System.in);

		System.out.println("Indicame la hora en formato, Hora/Minutos/Segundos.");
		System.out.print("Indica la Hora: ");
		esHora = true;
		int hora = correccionErr(esHora);

		System.out.print("Indica los Minutos: ");
		esHora = false;
		int minutos = correccionErr(esHora);

		System.out.print("Indica los segundos: ");
		esHora = false;
		int segundos = correccionErr(esHora);
		
		System.out.println("Hora:"+hora+"Minutos:"+minutos+"Segundos"+segundos);
		
		System.out.println("La hora establecida + 1 segundo es: ");
		segundos = segundos+1;
			if(segundos>59){
				segundos = 0;
				minutos = minutos+1;
			}
			if(minutos>59) {
				minutos = 0;
				hora = hora+1;
			}
			if(hora>23) {
				hora = 00;
				minutos = 00;
				segundos=00;
			}
		System.out.println("Hora:"+hora+"Minutos:"+minutos+"Segundos"+segundos);
	}

	public static int correccionErr(Boolean esHora) {
		int numero=0;
		Boolean valido = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			if(esHora == true){
				try {
					numero = sc.nextInt();
					if(numero>= 00 && numero <= 23){
						valido = true;
					}else {
						valido=false;
					}
					}catch(InputMismatchException ex) {
						sc.next();
						System.err.print("error. indique un valor numerico legible para Horas: ");
					}
				
			}else if (esHora == false){
				try {
					numero = sc.nextInt();
					if (numero >= 00 && numero <= 59){
						valido = true;
					}else {
						valido = false;
					}
					
				}catch(InputMismatchException ex) {
					sc.next();
					System.err.print("error. indique un valor numerico legible para Minutos y Segundos: ");
					
				}
				
			}else {
				System.err.println("ERROR.");
			}
			}while(valido == false);

	return numero;
}

}
