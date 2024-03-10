package unidad3;

public class EjemploWhileDoWhile {

	public static void main(String[] args) {

		int x = 0;
		
		System.out.println("--------- bucle do..while -----------------------------");
		do {
			
			System.out.println(x);
			x++;
			
		} while( x < 10); 
		
		System.out.println("--------- bucle while -----------------------");
		
		x=0;
		while (x<10) {
			x++;
			System.out.println(x);
		}

	}

}
