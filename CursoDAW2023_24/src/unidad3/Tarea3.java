package unidad3;

import java.util.Scanner;


/**
 * @author Domingo Martinez Diaz
 * 
 * Tarea 3
Solicitar por teclado la estación del año favorita del usuario (primavera, verano, otoño o invierno).

Una vez que el usuario introduzca la estación mostrar un mensaje por consola indicando algo característico que se realiza 
en esa estación del año.

Si la estación del año favorita es verano además deberás preguntar al usuario si veranea en la playa y en caso de que responda 
que sí mostrarle los nombres de algunas playas de Murcia.


 */

public class Tarea3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Siendo Primavera o \"P\" / Verano o \"V\"/ Otono o \"O\" / Invierno = \"I\"");
		System.out.print("Cual es su estacion favorita del año? ");
		
		String estacion = sc.nextLine().toUpperCase().substring(0,1).trim();
		
	//	System.out.println("Has seleccionado: "+estacion); (Para comprobar si estacion es correcto)
		
		switch (estacion) {
		case "P":
			System.out.println("Has seleccionado la estacion Primavera.");
			break;
			
		case "V":
			System.out.println("Has seleccionado la estacion Verano.");
			System.out.println("Que calor !!");
			System.out.println("Veraneas en la  playa? Indiquelo con \"SI\" o \"NO\"");

			String respuesta = sc.nextLine().trim();
			
			if(respuesta.equalsIgnoreCase("si")) {
				
				System.out.println("Deberias de visitar Bahia, Bolnuevo o Playa Grande. ");
				
			}else if(respuesta.equalsIgnoreCase("no")) {
				System.out.println("En verano no veraneas.");
				
			}else {
				System.out.println("ERROR");
			}
			
			break;
			
		case "O":
			System.out.println("Has seleccionado la estacion Otoño.");
			break;
			
		case "I":
			System.out.println("Has seleccionado la estacion Invierno.");
			break;

		default:
			System.out.println("ERROR. Selecciona una estacion correcta.");
			break;
		}
		

	}

}
