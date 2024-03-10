package unidad3;

import java.util.Scanner;

/**
 * @author Domingo Martinez Diaz Tarea 19 Hacer un programa que solicite 5
 *         nombres de frutas y componga una contraseña utilizando los dos
 *         primeros caracteres de cada fruta insertada.
 * 
 */

public class Tarea19 {

	public static void main(String[] args) {
		Scanner scString = new Scanner(System.in);
		String nombreFruta = " ";
		String contrasena = " ";

		System.out.println("Introduce 5 nombres de frutas para generar una contraseña: ");

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.print("Indique la fruta nº " + i + ": ");
				nombreFruta = scString.next().trim();

				contrasena = contrasena + nombreFruta.substring(0, 2);
			} catch (StringIndexOutOfBoundsException ex) {
				System.err.println("Tienes que indicar una fruta con minimo 2 caracteres.");
				--i;

			} catch (Exception ex) {
				System.err.println("ERROR. PRUEBA DE NUEVO");
				--i;
			}
		}

		System.out.println("La contrasena generada es: " + contrasena);
		System.out.println("FIN DEL PROGRAMA.");
	}

}