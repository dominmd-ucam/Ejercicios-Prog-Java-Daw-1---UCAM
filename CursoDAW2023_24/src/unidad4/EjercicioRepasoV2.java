package unidad4;
/**
 * @author 
 * 
 * EJERCICIO REPASO
 * 
Crear un m�todo �calcularPrecio� que le pase por par�metro un String con el tipo y un double con el precio y devuelva un double con el precio calculado con iva. La l�gica del m�todo ser�:

�       si el tipo pasado por par�metro es alimentaci�n se le aplicar� el IVA del 4%,

�       si el tipo es ropa el del 10%

�       y si el tipo es electrodom�stico el del 21%

Se aplicar� ese iva sobre el precio pasado por par�metro.

El m�todo devolver� el resultado de aplicar el porcentaje sobre el precio pasado por par�metro. El valor devuelto debe ser un double con dos decimales.

 

Para los posibles valores del iva declarar una constante con el nombre �IVA_21� que tenga el valor 21, otra constante �IVA_10� que tenga el valor 10 y otra constante �IVA_4� que tenga el valor 4.

Solicitar por teclado el nombre de un producto, tipo y su precio sin iva. Recoger el nombre y tipo en variables de tipo String y el precio en una variable de tipo double.

 

Llamar al m�todo �calcularPrecio� declarado anteriormente para calcular el precio del producto con iva. Recogeremos el valor devuelto del m�todo y mostraremos por consola el nombre del producto y el precio con y sin iva.

 

Controlar para que se pueda introducir m�s de un producto.
 */
import java.util.Scanner;

public class EjercicioRepasoV2 {
		
		public static double calcularPrecio(String tipo, double precio) {
			Scanner sc = new Scanner(System.in);
			final double IVA_21 = 1.21;
			final double IVA_10 = 1.10;
			final double IVA_4 = 1.04;
			double precioConIva = 0; 
			
			switch (tipo.toLowerCase()) {
			case "alimentacion":
				precioConIva = precio * IVA_4; // es 1.04 porque nos pide la suma del iva mas el precio del producto
				break;
			case "ropa":
				precioConIva = precio * IVA_10; // es 1.10 porque nos pide la suma del iva mas el precio del producto
				break;
			case "electrodomestico":
				precioConIva = precio * IVA_21; // es 1.21 porque nos pide la suma del iva mas el precio del producto
				break;

			default:
				System.out.println("No lo has introducido correctamente");
				sc.nextLine();  // revisar algo esta mal
				break;
			}
			
			return precioConIva;
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Scanner scNum = new Scanner(System.in);
			String recogerNombre = "";
			String recogerTipo = "";
			double precioProducto = 0;
			

			System.out.println("Introduzca el nombre del producto comprado: ");
			recogerNombre = sc.nextLine();
			System.out.println("Introduzca que tipo de producto de los siguientes es (alimentacion, ropa, electrodomestico): ");
			recogerTipo = sc.nextLine();
			System.out.println("Introduzca el precio del producto sin IVA: ");
			precioProducto = scNum.nextDouble();
			
			System.out.println("El nombre del producto es: " + recogerNombre + "\nEl precio del producto sin iva es: " + precioProducto + 
								"\ny el precio con IVA es: " + (calcularPrecio(recogerTipo, precioProducto)));
			


	}

}
