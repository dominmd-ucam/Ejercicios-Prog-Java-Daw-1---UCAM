package unidad3;

import java.util.Scanner;

public class EjemploIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scNum = new Scanner(System.in);
		Scanner scApell = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca su edad:");
		int edad = sc.nextInt();
		
		System.out.println("Introduzca su apellido:");
		String apellido = scApell.nextLine();
		
	//	int edad = 10;
			
		if (edad <= 16) {
			System.out.println("Eres menor de edad.");
		}else if (edad == 17) {
			System.out.println("Te queda poquito para ser mayor de edad.");
		} else if (edad >= 18 && edad <= 65){
				System.out.println("Esta en edad de trabajar.");
			} else {
				System.out.println("Disfruta de la vida");
			}
		
		System.out.println("FIN.");

	}

}
