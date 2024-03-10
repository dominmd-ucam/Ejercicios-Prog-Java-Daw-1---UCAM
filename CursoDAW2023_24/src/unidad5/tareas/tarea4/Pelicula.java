package unidad5.tareas.tarea4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pelicula {
	
	private String titulo;
	private String director;
	private int anyo;
	private ArrayList<String> actores;
	
	private static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
	
	public Pelicula(String titulo, String director, int anyo) {
		this.titulo = titulo;
		this.director = director;
		this.anyo = anyo;
		this.actores = new ArrayList<>();
	}
	
	public Pelicula() {
		
	}
	
	

	public ArrayList<String> getActores() {
		return actores;
	}

	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public static ArrayList<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public static void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
		Pelicula.listaPeliculas = listaPeliculas;
	}

	public static Pelicula crearPelicula () {
		Scanner sc = new Scanner (System.in);
		Scanner scNum = new Scanner (System.in);
		
		System.out.println("Introduzca el titulo de la pelicula: ");
		String titulo= sc.nextLine();
		
		System.out.println("Introduzca el director de  la película: ");
		String director = sc.nextLine();
		
		int anyo = 0;
		do {
			System.out.println("Introduzca el año de la pelicula: ");
			try {
				anyo = scNum.nextInt();
			}catch(InputMismatchException ex) {
				scNum.next();
				System.err.println("Error: Introduzca un numero en  el año");
			}
		}while(anyo <= 0);
		
		
		
		Pelicula pelicula = new Pelicula (titulo, director, anyo);
		
		return pelicula;
	}
	
	public void modificarPelicula () {
		Scanner sc = new Scanner (System.in);
		Scanner scNum = new Scanner (System.in);
		
		System.out.println("Introduzca el titulo de la pelicula: ");
		this.titulo = sc.nextLine();
		
		System.out.println("Introduzca el director de  la película: ");
		this.director = sc.nextLine();
		
		System.out.println("Introduzca el año de la pelicula: ");
		this.anyo = scNum.nextInt();
		
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", anyo=" + anyo + ", actores=" + actores
				+ "]";
	}
	
	
}
