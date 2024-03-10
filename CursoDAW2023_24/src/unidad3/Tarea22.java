package unidad3;

import java.util.Scanner;

public class Tarea22 {

	public static String pedirGenero() {

		Scanner sc = new Scanner(System.in);
		char sexo;
		String genero = "";
		Boolean valido = false;

		System.out.print("Indiqueme su sexo, siendo (M)Masculino / (F)Femenino: ");
		sexo = sc.nextLine().trim().toUpperCase().charAt(0);

		do {

			try {
				if (sexo == 'M') {
					genero = "Masculino";
					valido = true;
				} else if (sexo == 'F') {
					genero = "Femenino";
					valido = true;
				}else {
					System.err.println("ERROR");
					System.out.print("Indique nuevamente el genero: ");
					sexo = sc.nextLine().trim().toUpperCase().charAt(0);
					
				}
			} catch (Exception ex) {
				System.out.println("ERROR. Indique un genero valido:");
				sc.next();
			}
		} while (valido == false);

		return genero;

	}

	public static void main(String[] args) {
		
		System.out.println("El genero indicado es: "+pedirGenero());

	}

}
