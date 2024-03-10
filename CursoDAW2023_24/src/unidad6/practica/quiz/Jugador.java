package unidad6.practica.quiz;

public class Jugador {
	
	private String nombre;
	private int edad;
	private int puntuacion;
	
	public Jugador(String nombre, int edad, int puntuacion) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = puntuacion;
	}
	
	public Jugador(Jugador jugador) {
		// Este metodo es para seleccionar un jugador
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
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", puntuacion=" + puntuacion + "]";
	}
	

}