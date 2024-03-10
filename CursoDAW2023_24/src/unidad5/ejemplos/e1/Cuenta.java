package unidad5.ejemplos.e1;

public class Cuenta {

	private String titular;
	private double saldo;
	
	//GET Y SET METODOS ASOCIADOS PARA PEDIR DATOS
	
	public Cuenta(String titular) { //constructor por defecto
			this.titular = titular;
			this.saldo = 10;
	}

	public Cuenta(String titular, double saldo) { //constructor con click derecho source

		this.titular = titular;
		this.saldo = saldo;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
