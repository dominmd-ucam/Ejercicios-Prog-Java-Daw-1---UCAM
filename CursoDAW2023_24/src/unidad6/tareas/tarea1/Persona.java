package unidad6.tareas.tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

	private String dni;
	private String nombre;

	private static ArrayList <Persona> personas = new ArrayList();
	
	public Persona() {

	}
	
	public Persona(String dni, String nombre) {

		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<Persona> getPersonas() {
		return personas;
	}

	public static void setPersonas(ArrayList<Persona> personas) {
		Persona.personas = personas;
	}
	
	public static Persona crearPersona() {
		Scanner scString = new Scanner(System.in);
		System.out.println("Dime tu nombre y DNI para reservar sitio.");
		System.out.print("Nombre:");
		String nombre = scString.nextLine().trim();
		System.out.print("DNI:");
		String dni = scString.nextLine().trim();
		Persona persona = new Persona(nombre, dni);
		return persona;
	}
	

	

	
}
