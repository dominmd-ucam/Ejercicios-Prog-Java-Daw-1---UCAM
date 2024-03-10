package unidad5.tareas.tarea4_V2;

import java.util.ArrayList;

public class Pelicula {
	private String  titulo;
	private Persona director;
	private int anyo;
	private ArrayList <Persona> actores;
	
	
	
	public Pelicula() {
		
	}
	
	
	
	public Pelicula(ArrayList<Persona> actores) {
		
		this.actores = new ArrayList<Persona>();
	}



	public Pelicula(String titulo, Persona director, int anyo, ArrayList<Persona> actores) {
		
		this.titulo = titulo;
		this.director = director;
		this.anyo = anyo;
		this.actores = actores;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Persona getDirector() {
		return director;
	}
	public void setDirector(Persona director) {
		this.director = director;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public ArrayList<Persona> getActores() {
		return actores;
	}
	public void setActores(ArrayList<Persona> actores) {
		this.actores = actores;
	}
	
	
 
}
