package unidad2;

/**
 * @author 49248504 Domingo Martinez Diaz
 * 
 * Realizar un programa en Java que calcule el área del cuadrado y el del círculo. Mostrar los resultados por consola.

              Area cuadrado = lado * lado = lado^2

              Area círculo = PI * r2

** Utilizar la función POW.
 * 
 */

public class Tarea2 {

	public static void main(String[] args) {
		
		double area_Cuadrado=0, Area_Circulo=0, lado=0, radio=0, diametro=0;
		
		lado = 5;
		
		area_Cuadrado = lado * lado;
		
		System.out.println("El Area del Cuadrado es: "+(int)area_Cuadrado + " donde el lado es "+(int)lado);
		
		diametro = 4;
		
		radio = diametro / 2;
		
		Area_Circulo = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El Area del Circulo es: "+Area_Circulo);
		
	}

}
