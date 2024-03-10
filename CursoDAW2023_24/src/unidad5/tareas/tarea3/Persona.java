package unidad5.tareas.tarea3;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private Double peso;
	private Double altura;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
	}
	public Persona(String persona, int edad, String dni, Double peso, Double altura) {
	
		this.nombre = persona;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}
	public String getPersona() {
		return nombre;
	}
	public void setPersona(String persona) {
		this.nombre = persona;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public static Boolean esMayorDeEdad (int edad) {
		if (edad >= 18) {
			return true;
		}
		return false;
	}
	
	public Boolean esMayor () {
		if (this.edad >= 18) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}
	
	
	
}
