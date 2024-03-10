package unidad3;

import java.util.Scanner;

public class EjemploReturn {

	public static void main(String[] args) {
		
		String txt = "Esto es una prueba";
		System.out.println(txt);

		//tieneCoche();
		String respuesta = tieneCoche();
		
		System.out.println("Usted tiene coche = "+respuesta);
		

	}
	
	
	public static String tieneCoche() {
		
		Scanner sc = new Scanner(System.in);
		
		String respuesta = "";
		
		System.out.println("¿Tiene coche? Responda si o no");
		
		do {
			respuesta = sc.nextLine();
		}
		while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
		
		return respuesta;
	}

}
