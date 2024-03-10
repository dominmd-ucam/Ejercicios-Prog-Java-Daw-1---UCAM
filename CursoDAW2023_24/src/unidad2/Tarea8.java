package unidad2;

/**
 * @author Domingo Martínez Díaz
 * 
 * Tarea 8
Crear varias variables con las notas de un alumno. 

Mostrar el promedio de todas las notas por consola. 
 */

public class Tarea8 {

	public static void main(String[] args) {
		
		int nota_Alumno1 = 4, nota_Alumno2 = 6, nota_Alumno3 = 7, nota_Alumno4 = 8,  nota_Alumno5 = 7, promedio = 0, notas_total = 0;
		
		notas_total =  nota_Alumno1+nota_Alumno2+nota_Alumno3+nota_Alumno4+nota_Alumno5;

		promedio = notas_total / 5; //Se puede hacer asi "manualmente o con una funcion Math. que no he encontrado.
		
		System.out.println("El promedio de todas las notas es: "+promedio);
	}

}
