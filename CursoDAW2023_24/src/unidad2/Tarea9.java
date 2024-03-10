package unidad2;
/**
 * @author Domingo Martínez Díaz
 * 
 * Tarea 9
Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, 
dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por pantalla:
El valor de cada variable.

La suma  X + Y
La diferencia  X – Y
El producto  X * Y
El cociente  X / Y
El resto  X % Y
La suma  N + M
La diferencia  N – M
El producto  N * M
El cociente  N / M
El resto  N % M
La suma X + N
El cociente Y / M
El resto Y % M
El doble de cada variable
La suma de todas las variables
El producto de todas las variables

 */

public class Tarea9 {

	public static void main(String[] args) {
		
		
		int x=6,y=2;
		double n=8.6,m=4.2;
		double suma=0, diferencia=0, producto=0, cociente=0, resto=0, doble=0;
		double sumatotal1 = 0, sumatotal2 =0, suma_Variables = 0, productototal1 = 0, productototal2 = 0, producto_Variables = 0;
		
		
		suma = x+y;
		System.out.println("La suma de "+x +" + " +y +" es: "+(int)suma);
		doble = suma * 2;
		System.out.println("El doble de "+(int)suma +" es: "+(int)doble);
		System.out.println();
		
		diferencia = x-y;
		System.out.println("La diferencia de "+x +" - " +y +" es: "+(int)diferencia);
		doble = diferencia * 2;
		System.out.println("El doble de "+(int)diferencia +" es: "+(int)doble);
		System.out.println();
		
		producto = x*y;
		System.out.println("El producto de "+x +" * " +y +" es: "+(int)producto);
		doble = producto * 2;
		System.out.println("El doble de "+(int)producto +" es: "+(int)doble);
		System.out.println();
		
		cociente = x/y;
		System.out.println("El cociente de "+x +" / " +y +" es: "+(int)cociente);
		doble = cociente * 2;
		System.out.println("El doble de "+(int)cociente +" es: "+(int)doble);
		System.out.println();
		
		resto = x%y;
		System.out.println("El resto de "+x +" % " +y +" es: "+(int)resto);
		doble = resto * 2;
		System.out.println("El doble de "+(int)resto +" es: "+(int)doble);
		System.out.println();
		
		sumatotal1 = suma+diferencia+producto+cociente+resto;
		productototal1 = suma*diferencia*producto*cociente*resto;
		
		
		System.out.println("---------------------------------------");
		
		
		suma = n+m;
		System.out.println("La suma de "+n +" + " +m +" es: "+(float)suma);
		doble = suma * 2;
		System.out.println("El doble de "+(float)suma +" es: "+(float)doble);
		System.out.println();
		
		diferencia = n-m;
		System.out.println("La diferencia de "+n +" - " +m +" es: "+(float)diferencia);
		doble = diferencia * 2;
		System.out.println("El doble de "+(float)diferencia +" es: "+(float)doble);
		System.out.println();
		
		producto = n*m;
		System.out.println("El producto de "+n +" * " +m +" es: "+(float)producto);
		doble = producto * 2;
		System.out.println("El doble de "+(float)producto +" es: "+(float)doble);
		System.out.println();
		
		cociente = n/m;
		System.out.println("El cociente de "+n +" / " +m +" es: "+(float)cociente);
		doble = cociente * 2;
		System.out.println("El doble de "+(float)cociente +" es: "+(float)doble);
		System.out.println();
		
		resto = n%m;
		System.out.println("El resto de "+n +" % " +m +" es: "+(float)resto);
		doble = resto * 2;
		System.out.println("El doble de "+(float)resto +" es: "+(float)doble);
		System.out.println();
		
		sumatotal2 = suma+diferencia+producto+cociente+resto;
		productototal2 = suma*diferencia*producto*cociente*resto;
		
		System.out.println("---------------------------------------");
		
		suma_Variables = sumatotal1 + sumatotal2;
		System.out.println("La suma de todas las variables es: "+(float)suma_Variables);
		
		producto_Variables = productototal1*productototal2;
		System.out.println("El producto de todas las  variables es: "+producto_Variables);
		

	}

}
