package unidad2;
/**
 * @author Domingo Martinez Diaz
 * Tarea 5 - Operadores lógicos
X, Y y Z son variables de tipo boolean.
Los valores que toman las variables son:

X = false, 
Y = true, 
Z = true 

Determina el valor de las siguientes expresiones lógicas:
1.(X && Y) || (X && Z)
2.(X && Y) || (X && Z)
3.(X || !Y) && (!X || Z)
4. X || Y && Z
Muestra la operación con los resultados por consola.
 * 
 */

public class Tarea5 {

	public static void main(String[] args) {
		
		boolean x = false, y = true, z = true;
		boolean resultado1, resultado2, resultado3, resultado4;
		
		resultado1 =(x&&y)||(x&&z);
		resultado2 =(x&&y)||(x&&z);
		resultado3 =(x||!y)&&(!x||z);
		resultado4 = x || y && z;
		
		System.out.println("Siendo x=false / y=true / z=true");
		System.out.println("El resultado de (x&&y)||(x&&z) es: "+resultado1);
		System.out.println("El resultado de (x&&y)||(x&&z) es: "+resultado2);
		System.out.println("El resultado de (x||!y)&&(!x||z) es: "+resultado3);
		System.out.println("El resultado de x || y && z es: "+resultado4);
		

	}

}
