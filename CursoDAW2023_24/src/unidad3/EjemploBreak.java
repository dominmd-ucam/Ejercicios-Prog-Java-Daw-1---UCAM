package unidad3;

public class EjemploBreak {

	public static void main(String[] args) {
		
		System.out.println("i - j");
		
		for(int i =  0; i<3; i++) {
			for (int j = 0;j<5;j++) {
				if(j==2) {
					continue ;
				}
				System.out.println(i+" - "+j);
			}
		}

	}

}
