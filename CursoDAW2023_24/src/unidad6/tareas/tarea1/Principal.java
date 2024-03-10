package unidad6.tareas.tarea1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static void menu() {
		System.out.println("1) Crear un puesto."
				+ "\n2) Eliminar un puesto."
				+ "\n3) Reservar un puesto."
				+ "\n4) Listar los ordenadores reservados."
				+ "\n5) Listar los ordenadores disponibles."
				+ "\n6) Salir.");
		
		System.out.print("Seleccione la opcion que desee realizar: ");
		
	}
	
	public static int recoger_int() {
		Scanner scInt = new Scanner (System.in);
		int num = 0;
		boolean valido = false;
		
		do {
			try {
				num = scInt.nextInt();
				if(num>0) {
				valido = true;
				}else {
					System.err.println("No puede ser un numero negativo o un \"0\".");
					System.out.print("Introduzca un nuevo numero: ");
					valido = false; //Creo que esta linea se puede borrar directamente.
				}
			}catch(InputMismatchException ex) {
				System.err.print("ERROR. Introduzca un numero valido: ");
				scInt.next();
				valido = false; //Creo que esta linea se puede borrar directamente.
			}
		}while (!valido);
		
		return num;
	}
	
	public static void crearDatos() {
		Persona pers1 = new Persona ("49248504F", "Domingo");
		Persona pers2 = new Persona ("12345678A", "Nuria");
		Persona.getPersonas().add(pers1);
		Persona.getPersonas().add(pers2);
		
		
		Puesto puesto1 = new Puesto ("001",true,pers1);
		Puesto puesto2 = new Puesto ("002",false,null);
		Puesto.getListapuestos().add(puesto1);
		Puesto.getListapuestos().add(puesto2);
		
	}

	public static void main(String[] args) {
		//Creamos los datos falsos para utilizar el programa.
		crearDatos();
		
		Scanner scString = new Scanner (System.in);
		int opcion;
		String codigoPC = "";
		
		System.out.println("--- Bienvenido al programa ---");
		
		do {
			menu();
			opcion = recoger_int(); //Podria ahorrarme la variable "opcion" y utilizar solo "recoger_int()" ??
			switch (opcion) {
			case 1: 
				
				System.out.println("Se ha creado el puesto: "+Puesto.crearPuesto());
				break;
			case 2:
				/*
				 * Hay un error en el programa donde solo se borra el primer puesto 001 no se
				 * borra el 002
				 */
				/*
				 * Los comentarios son codigo para intentar solucionar el error de 002 con lo ultimo
				 * visto en clase de la posicion del objeto o algo asi
				 */
				
				Puesto quitar = null;
				
				System.out.println("Has seleccionado la opcion \"Eliminar un puesto\"");
				System.out.println(Puesto.getListapuestos().toString());
				System.out.print("Escriba el Codigo de PC del puesto que desea eliminar: ");
				
				
				  codigoPC = scString.nextLine().trim();
				  
				  for (Puesto puesto : Puesto.getListapuestos()) {
					  if(puesto.getCodigo_PC().equalsIgnoreCase(codigoPC)) {
						  //Puesto.getListapuestos().remove(puesto); 
						  quitar = puesto;
						  //break;
					  } 
					  
				  }
				  Puesto.getListapuestos().remove(quitar);
				 		
				///////////////////////////
				//Puesto.getListapuestos().remove(Puesto.buscarPuesto());
				System.out.println("Asi queda ahora la lista de puestos.");
				System.out.println(Puesto.getListapuestos().toString());
				break;
				
			case 3:
				System.out.println("Has seleccionado la opcion de Reservar un puesto.");
				Puesto.mostrarPuestosLibres();
				System.out.println("Escribe el codigo del PC del sitio que quieres reservar: ");
				codigoPC = scString.nextLine().trim();
				Persona pnew = Persona.crearPersona();
				
				for (Puesto puesto : Puesto.getListapuestos()) {
					if (puesto.getCodigo_PC().equalsIgnoreCase(codigoPC) && !puesto.isReservado()) {
						puesto.setReservado(true);
						puesto.getPersona().add(pnew);
						
						System.out.println("Su sitio se ha reservado en el PC "+puesto.getCodigo_PC());
						System.out.println(puesto.toString());
					}
				}
				
				break;
				
			case 4:
				//Puesto.mostrarPuestosReservados(); 
				Puesto.mostrarPuestos("*** PUESTOS RESERVADOS ***", true);
				break;
				
			case 5:
				//Puesto.mostrarPuestosLibres();
				Puesto.mostrarPuestos("*** PUESTOS NO RESERVADOS ***", false);
				break;
				
			case 6:
				System.out.println("FIN DEL PROGRAMA");
				break;
			default:
				System.out.println("FIN DEL PROGRAMA, GRACIAS.");
				break;
				
			}
		}while(opcion != 6);
		

	}

}
