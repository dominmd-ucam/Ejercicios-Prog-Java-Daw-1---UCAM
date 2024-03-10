package repaso;

public class RepasoArrays3 {

	public static void main(String[] args) {
		
		String[] nombres = {"Alejandro", "Maria", "Lucia", "Juan", "Narcisa", "Luis", "Roberto"};
		
		for(int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		// ES LO MISMO QUE:
		
		for(String i: nombres) {
			System.out.println("Nombre: "+ i);
		}
		
	}

}
