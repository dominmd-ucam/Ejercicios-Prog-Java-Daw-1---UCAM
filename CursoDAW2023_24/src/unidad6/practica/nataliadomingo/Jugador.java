package unidad6.practica.nataliadomingo;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private String apellido;
	private int edad;
	private double puntuacion;

	public Jugador() {

	}

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public Jugador(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Jugador(String nombre, String apellido, int edad, double puntuacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	

	public static Jugador buscarJugador(String nombreAEliminar,String apellidoAEliminar, ArrayList<Jugador> jugadores) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(nombreAEliminar) && jugador.getApellido().equalsIgnoreCase(apellidoAEliminar)) {
				return jugador;
			}
		}
		return null;
	}


	@Override
	public String toString() {
		return " [ Jugador Nombre = " + nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase()
				+ ", Apellido = " + apellido.substring(0, 1).toUpperCase() + apellido.substring(1).toLowerCase()
				+ ", Edad = " + edad + ", Puntuacion = " + puntuacion + " ]";
	}

}
