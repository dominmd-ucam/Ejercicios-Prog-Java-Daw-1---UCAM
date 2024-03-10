package unidad2;

public class OperadoresEjercicio3 {

	public static void main(String[] args) {

		int numero = 2;
		double resultado;
		
		//numero = numero + 10;
		numero += 10;
		
		System.out.println("Numero + 10 = " + numero);
		
		//numero = numero + 1;
		numero++;
		
		System.out.println("Numero++ --> " + numero);
		
		//numero = numero / 2;
		numero /= 2;
		
		System.out.println("Numero /= 2 --> "+numero);
		
		System.out.println(Math.PI);
		
		resultado = Math.pow(2, 3);
		
		System.out.println(resultado);
		
		int result = (int)resultado;
		
		System.out.println(result);
		
		result = (int)Math.PI;
		
		System.out.println(result);
		
	}

}
