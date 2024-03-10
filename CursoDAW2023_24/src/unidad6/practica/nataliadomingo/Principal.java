package unidad6.practica.nataliadomingo;

public class Principal {

	public static void main(String[] args) {

		Juego.getJuegoQuiz().datosFicticios();

		int opcion = 0;
		
		String menu = ("\tMENU\n1) Insertar nuevos jugadores\n" + "2) Eliminar jugadores\n" + "3) Jugar\n"
				+ "4) Mostrar puntuaciones\n" + "5) Insertar nuevas preguntas\n" + "6) Salir\n"
				+ "Introduzca una opcion 1/2/3/4/5/6 : ");
		do {
			System.out.print(menu);
			opcion = Juego.correccionErrores();
			switch (opcion) {
			case 1:
				Juego.ingresarJ();
				break;

			case 2:
				Juego.eliminarJ();
				
				break;

			case 3:
				
				Juego.jugar();

				break;

			case 4:

				Juego.mostrarPuntuaciones();

				break;
			case 5:
				Juego.nuevapregunta();
				

				break;
			case 6:

				System.out.println("\u001B[32mHa salido con �XITO del programa\n\t---!ADIOS!---");
				break;

			default:
				System.out.println("Opci�n inv�lida.");
				break;
			}
		} while (opcion != 6);
	}

}