package unidad5.ejemplos.e1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int numero = 5;
		
		ArrayList<String> nombres = new ArrayList<>();
		
		Cuenta cuentaElias = new Cuenta("Elias", 10000);
		Cuenta cuentaNatalia = new Cuenta("Natalia", 1000000);
		
		System.out.println(cuentaElias.getSaldo());
		
		cuentaElias.setTitular("PEPITO");
		
		System.out.println("Modificado: "+cuentaElias.getTitular());
				
		Scanner sc = new Scanner(System.in);
		
	}

}
