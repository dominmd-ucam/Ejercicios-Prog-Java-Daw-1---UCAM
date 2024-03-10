package unidad5.tareas.tarea4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static int obtenerNumero (String msn, int max) {
		Scanner scNum= new Scanner (System.in);
		int num = 0;
		do {
			System.out.println(msn);
			try {
				num = scNum.nextInt();
			}catch(InputMismatchException ex) {
				scNum.next();
				System.out.println("Error: Introduzca un numero");	
		}
		
	}while(num <= max);
		return num;
	}

	public static void main(String[] args) {
		Scanner scString = new Scanner (System.in);
		Scanner scChar = new Scanner(System.in);
		
		/*
		 * Scanner scString = new Scanner (System.in); Scanner scInt = new Scanner
		 * (System.in);
		 * 
		 * ArrayList<Pelicula> listaPeliculas= new ArrayList<>();
		 * 
		 * System.out.println("Introduzca el numero de peliculas a introducir:"); int
		 * numeroPeliculas = scInt.nextInt();
		 * 
		 * for (int i=0; i<=numeroPeliculas; i++) {
		 * System.out.println("Introduce el titulo de la pelicula: "); String pelicula =
		 * scInt.nextLine().trim(); Pelicula nuevaPelicula = new Pelicula();
		 * listaPeliculas.add(nuevaPelicula);
		 * 
		 * } for (Pelicula pelicula : listaPeliculas) {
		 * System.out.println(pelicula.toString()); }
		 */
		
		/*
		 * Pelicula p2 = new Pelicula ();
		 * 
		 * p2.modificarPelicula();
		 */

		// ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
		String buscarPeli = "";
		String nuevoActor = "";
		
		int numPelis = obtenerNumero("¿Cuantas peliculas quieres insertar?", 0);
		
		for(int i=1; i<=numPelis; i++) {
			Pelicula p = Pelicula.crearPelicula();
			Pelicula.getListaPeliculas().add(p);
		}
		
		
		for (Pelicula pelicula : Pelicula.getListaPeliculas()) {
			System.out.println(pelicula.toString());
		}
		
		
		System.out.println("Quieres añadir un actor a alguna pelicula?Y/N: ");
		String respuesta = scChar.nextLine().toUpperCase().trim();
		
		if(respuesta.equalsIgnoreCase("Y") ) {
			
			System.out.println("Nombre del actor que desea añadir: ");
			nuevoActor = scString.nextLine().trim();
			
			System.out.println("A que pelicula quieres añadir ese actor?");
			buscarPeli = scString.nextLine().trim();
			
		}else if(respuesta.equalsIgnoreCase("N")) {
			System.out.println("Has seleccionado la opcion NO añadir actor.");
		}
		
		for (Pelicula pelicula : Pelicula.getListaPeliculas()) {
			if(pelicula.getTitulo().equalsIgnoreCase(buscarPeli)) {
				pelicula.getActores().add(nuevoActor);
				
				
			}
		}
		
		System.out.println(Pelicula.getListaPeliculas().toString());
	}

}
