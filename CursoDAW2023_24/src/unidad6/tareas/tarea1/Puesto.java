package unidad6.tareas.tarea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Puesto {
	
	private String codigo_PC;
	private boolean reservado;
	private ArrayList <Persona> persona;
	
	private static ArrayList <Puesto> listapuestos = new ArrayList ();

	public Puesto() {
		
	}

	public Puesto(String codigo_PC, Boolean reservado, Persona persona) {
		
		this.codigo_PC = codigo_PC;
		this.reservado = reservado;
		this.persona = new ArrayList <Persona>();
	}
	
	public String getCodigo_PC() {
		return codigo_PC;
	}
	public void setCodigo_PC(String codigo_PC) {
		this.codigo_PC = codigo_PC;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(Boolean reservado) {
		this.reservado = reservado;
	}
	public ArrayList<Persona> getPersona() {
		return persona;
	}
	public void setPersona(ArrayList<Persona> persona) {
		this.persona = persona;
	}
	
	
	
	
	public static ArrayList<Puesto> getListapuestos() {
		return listapuestos;
	}

	public static void setListapuestos(ArrayList<Puesto> listapuestos) {
		Puesto.listapuestos = listapuestos;
	}


	@Override
	public String toString() {
		
		return "Puesto [codigo_PC=" + codigo_PC + ", reservado=" + reservado + ", persona=" + persona + "]\n";

	}
	
	public static Puesto crearPuesto() {
		Scanner scString = new Scanner (System.in);
		System.out.println("Has seleccionado la opcion \"Crear un puesto\"");
		boolean encontrado = false;
		Puesto nuevoPuesto = null;
		do {
		
			System.out.print("Codigo del PC: ");
		String nuevoCodigoPC = scString.nextLine().trim();
		
		for (Puesto puesto : listapuestos) {
			if(nuevoCodigoPC.equalsIgnoreCase(puesto.getCodigo_PC())) {
				encontrado = true;
				System.out.println("ERROR: el codigo ya existe.");
			}
		}
		if(!encontrado) {
			nuevoPuesto = new Puesto (nuevoCodigoPC, false, null);
			listapuestos.add(nuevoPuesto);
		}
		}while(encontrado);
		
		
		
		/*
		 * Se entiende que al crear un puesto este está vacio y por lo cual sin ninguna
		 * Persona en el.
		 */
		return nuevoPuesto;
	}
	public static void mostrarPuestosLibres() {
		System.out.println("Esta es la lista de todos los ordenadores disponibles:");
		for (Puesto puesto : Puesto.getListapuestos()) {
			if (!puesto.isReservado()) {
				System.out.println(puesto.toString());
			}
		}
	}
	
	public static void mostrarPuestosReservados() {
		System.out.println("Esta es la lista de todos los ordenadores Reservados:");
		for (Puesto puesto : Puesto.getListapuestos()) {
			if (puesto.isReservado()) {
				System.out.println(puesto.toString());
			}
		}
		
	}
	
	public static void mostrarPuestos(String txt, boolean reservado) {
		System.out.println(txt);
		for (Puesto puesto : Puesto.getListapuestos()) {
			if (puesto.isReservado() == reservado) {
				System.out.println(puesto.toString());
			}
		}
		
	}
	
	public static Puesto buscarPuesto() {
		Scanner scString = new Scanner (System.in);

		String codigoPC = scString.nextLine().trim();
		Puesto encontrado = null;
		for (Puesto puesto : Puesto.getListapuestos()) {
			if(puesto.getCodigo_PC().equalsIgnoreCase(codigoPC)) {
				
				encontrado = puesto;
			}
		}
		return encontrado;
	}
}
