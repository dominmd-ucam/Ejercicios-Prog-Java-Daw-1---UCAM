package unidad4;

import java.util.Scanner;

/**
 * @author Manre
 * 
 *         U4 - Tarea 5 El c�lculo de la letra del Documento Nacional de
 *         Identidad (DNI) es un proceso matem�tico sencillo que se basa en
 *         obtener el resto de la divisi�n entera del n�mero de DNI y el n�mero
 *         23. A partir del resto de la divisi�n, se obtiene la letra
 *         seleccion�ndola dentro de un array de letras.
 * 
 *         El array de letras es:
 * 
 *         char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
 *         'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E',
 *         'T'};
 * 
 *         Por tanto si el resto de la divisi�n es 0, la letra del DNI es la T y
 *         si el resto es 3 la letra es la A. Con estos datos, elaborar un
 *         peque�o script que:
 * 
 *         Almacene en una variable el n�mero de DNI indicado por el usuario y
 *         en otra variable la letra del DNI que se ha indicado.
 * 
 *         En primer lugar se debe comprobar si el n�mero es menor que 0 o mayor
 *         que 99999999. Si ese es el caso, se muestra un mensaje al usuario
 *         indicando que el n�mero proporcionado no es v�lido y el programa no
 *         muestra m�s mensajes.
 * 
 *         Si el n�mero es v�lido, se calcula la letra que le corresponde seg�n
 *         el m�todo explicado anteriormente.
 * 
 *         Una vez calculada la letra, se debe comparar con la letra indicada
 *         por el usuario. Si no coinciden, se muestra un mensaje al usuario
 *         dici�ndole que la letra que ha indicado no es correcta. En otro caso,
 *         se muestra un mensaje indicando que el n�mero y la letra de DNI son
 *         correctos.
 ** 
 *         Crear un m�todo calcularLetra que pas�ndole por par�metro de entrada
 *         el n�mero del dni te devuelva la letra que corresponder�a a ese
 *         n�mero.
 */
public class Tarea5V2 {

	public static char calcularLetra(int dni) {
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E', 'T' };
		int resultado = 0;

		if (dni < 0 || dni > 99999999) {
			System.out.println("El n�mero proporcionado no es v�lido.");
		} else {
			resultado = dni % 23;
		}

		return letras[resultado];
	}

	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		char letraDNI = 'a';
		int recogerDNI = 0;

		do {
			try {
				System.out.println("Introduce tu DNI: ");
				recogerDNI = scNum.nextInt();
			} catch (java.util.InputMismatchException ex) {
				System.out.println("Error: No se pueden introducir letras, solo 8 digitos");
				scNum.nextLine();
				continue;
			}
			String numeroStr = Integer.toString(recogerDNI);
			if (numeroStr.length() == 8) {
				System.out.println("Introduce la letra de tu DNI: ");
				letraDNI = sc.nextLine().toUpperCase().charAt(0);

				if (letraDNI == calcularLetra(recogerDNI)) {
					System.out.println("Es correcto");
					valido = true;
				} else {
					System.out.println("No es correcto");
					valido = false;
				}
			} else {
				System.out.println("Error:Tienes que introducir 8 digitos");
			}

		} while (!valido);

	}

}
