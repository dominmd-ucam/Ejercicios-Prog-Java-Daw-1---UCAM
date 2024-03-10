package repaso;

public class MetodosRepasoTotal {
	
	public static int suma(int num1, int num2) {
		int resultado = 0;
		
		resultado = num1 + num2;
		
		
		return resultado;
	}

	public static void main(String[] args) {
		
		
		// Un metodo es una accion JUGAR, SUMAR, ETC
		
			// TIPOS : INT STRING BOOLEAN CHAR DOUBLE      VOID
		
				// RETURN

		String frase = "HOLA";
		int num1=2;
		int num2=5;
		
		
		int resultadototal = suma(num1,num2);
		System.out.println(resultadototal);
		
		metodoVoid();

	}

	public static void metodoVoid() {
		
		System.out.println("ESTO ES DEL METODO VOID");
		
		
	}

}
