package unidad5.tareas.tarea3;

import java.util.ArrayList;

public class Principal {
	public static Boolean esMayorDeEdad2(int edad) {
		if (edad >= 18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<>();

		Persona p1 = new Persona("Domingo", 24);
		listaPersonas.add(p1);
		Persona p2 = new Persona("Natalia", 29);
		listaPersonas.add(p2);
		Persona p3 = new Persona("Roberto", 23);
		listaPersonas.add(p3);
		Persona p4 = new Persona("Antonio", 29);
		listaPersonas.add(p4);
		Persona p5 = new Persona("Elias", 16);
		listaPersonas.add(p5);

		for (Persona persona : listaPersonas) {
			if (Persona.esMayorDeEdad(persona.getEdad())) {
				System.out.println(persona.toString());
			}
		}

	}

}
