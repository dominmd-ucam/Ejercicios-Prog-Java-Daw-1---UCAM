package unidad4;

public class EjemploArray {

	public static void main(String[] args) {
		
		int[] numeros = new int[11];
		
		/*
		numeros [0] = 2;
		numeros [4] = 5;
		numeros [9] = 6;
		*/
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("El numero "+i+" x 2 es: ");
			numeros[i] = i*2;
			System.out.println(numeros[i]);
		}
		
	}

}
