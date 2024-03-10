package unidad6.tareas.tarea2_V2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocinero {
	
	private String nombre;
	private int num_estrellas;
	private String restaurante;
	
	private static ArrayList<Cocinero> listacocineros = new ArrayList();
	
	
	
	
	public Cocinero() {
		
	}
	public Cocinero(String nombre, int num_estrellas, String restaurante) {
		
		this.nombre = nombre;
		this.num_estrellas = num_estrellas;
		this.restaurante = restaurante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNum_estrellas() {
		return num_estrellas;
	}
	public void setNum_estrellas(int num_estrellas) {
		this.num_estrellas = num_estrellas;
	}
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
	
	public static ArrayList<Cocinero> getListacocineros() {
		return listacocineros;
	}
	public static void setListacocineros(ArrayList<Cocinero> listacocineros) {
		Cocinero.listacocineros = listacocineros;
	}
	@Override
	public String toString() {
		return "Cocinero [nombre=" + nombre + ", num_estrellas=" + num_estrellas + ", restaurante=" + restaurante + "]";
	}
	
	public static Cocinero crearCocinero() {
		Scanner scString = new Scanner (System.in);
		Scanner scInt = new Scanner (System.in);
		
		System.out.print("Introduzca el nombre del cocinero que desee Añadir:");
		String nombre = scString.nextLine().trim();
		
		System.out.print("Cuantas estrellas tiene?:");
		int num_estrellas = Principal.corrInt();
		
		System.out.print("Introduzca el nombre de su Restaurante:");
		String restaurante = scString.nextLine().trim();
		
		Cocinero nuevoCocinero = new Cocinero(nombre, num_estrellas, restaurante);
		
		listacocineros.add(nuevoCocinero);
		
		return nuevoCocinero;
	}
	
	public static void buscarCocinero() {
		Scanner scString = new Scanner (System.in);
		
		boolean encontrado = false;
		
		System.out.println("Dime el nombre del cocinero a buscar: ");
		String nombre_cocinero = scString.nextLine().trim();
		
		for (Cocinero cocinero : listacocineros) {
			
			if(cocinero.getNombre().equalsIgnoreCase(nombre_cocinero)) {
				encontrado = true;
				cocinero.toString();
			}
			
			if(!encontrado) {
				System.out.println("No se ha encontrado ningun concinero con el nombre "+nombre_cocinero);
			}
		}
		
	}
	
	public static Cocinero comprobarCocinero(String nombreCocinero) {
		boolean encontrado = false;
		for (Cocinero cocinero : listacocineros) {
			if(cocinero.getNombre().equalsIgnoreCase(nombreCocinero)) {
				encontrado=true;
				return cocinero;
			}
			
			if (!encontrado) {
				System.out.println("No se ha encontrado un cocinero con ese nombre. Crealo para la base de datos.");
				return Cocinero.crearCocinero();
			}
		}
		
		return null;
	}
	
	public static void mostrarCocineros () {
		
		for (Cocinero cocinero : listacocineros) {
			cocinero.getNombre().toString();
		}
		
		
	}
	
	/* COMO PODRIA HACER ESTE METODO EN COCINERO Y LLAMARLO DESDE EL METODO RECETAEJEMPLOS Y QUE SE ME AÑADAN A LAS RECETAS ???
	 * public static void cocinerosEjemplo() {
	 * 
	 * Cocinero cocinero1 = new Cocinero ("Jordi",2,"Casa Jordi");
	 * listacocineros.add(cocinero1); Cocinero cocinero2 = new Cocinero
	 * ("Pepe",5,"Casa PEPE"); listacocineros.add(cocinero2); Cocinero cocinero3 =
	 * new Cocinero ("Joan Roca",10,"Abacos"); listacocineros.add(cocinero3);
	 * 
	 * 
	 * }
	 */
	
	
	
	
}
