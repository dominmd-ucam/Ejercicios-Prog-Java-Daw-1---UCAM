package unidad5.tareas.tarea2;

public class Coche {
	
	private String matricula;
	private String color;
	private int alerones;
	private String marca;
	private String modelo;
	private Boolean alquilado;
	
	public Coche() {
		
	}
	public Coche(String matricula, String color, int alerones, String marca, String modelo, Boolean alquilado) {
		
		this.matricula = matricula;
		this.color = color;
		this.alerones = alerones;
		this.marca = marca;
		this.modelo = modelo;
		this.alquilado = alquilado;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAlerones() {
		return alerones;
	}
	public void setAlerones(int alerones) {
		this.alerones = alerones;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Boolean getAlquilado() {
		return alquilado;
	}
	public void setAlquilado(Boolean alquilado) {
		this.alquilado = alquilado;
	}
	public void getVercoches() {
		
		System.out.println(
		"Matricula: "+this.matricula
		+"\nColor: "+this.color
		+"\nAlerones: "+this.alerones
		+"\nMarca: "+this.marca
		+"\nModelo: "+this.modelo
		+"\nAlquilado: "+this.alquilado
						);
	}
}