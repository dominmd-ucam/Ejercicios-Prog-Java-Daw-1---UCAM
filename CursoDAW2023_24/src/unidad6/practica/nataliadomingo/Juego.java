package unidad6.practica.nataliadomingo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Juego {


	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private  ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
	
	private static Juego juegoQuiz = new Juego();

	

	public Juego() {

	}

	public Juego(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public Juego(ArrayList<Jugador> jugadores, ArrayList<Pregunta> preguntas) {
		this.jugadores = jugadores;
		this.preguntas = preguntas;

	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	public static Juego getJuegoQuiz() {
		return juegoQuiz;
	}

	public static void setJuegoQuiz(Juego juegoQuiz) {
		Juego.juegoQuiz = juegoQuiz;
	}
	

	public static void jugar() {
		Scanner txt = new Scanner(System.in);
		String nombreJugador;
		String apellidoJugador;
		Random random = new Random();
		boolean encontrado = false;

		for (Jugador jugador : juegoQuiz.getJugadores()) {
			System.out.println(jugador);
		}
		System.out.print("Introduce el nombre del jugador que desea jugar: ");
		nombreJugador = txt.nextLine().toLowerCase().trim();
		System.out.print("Introduce el apellido del jugador que desea jugar: ");
		apellidoJugador = txt.nextLine().toLowerCase().trim();

		for (Jugador j : juegoQuiz.getJugadores()) {
			if (j.getNombre().equalsIgnoreCase(nombreJugador) && j.getApellido().equalsIgnoreCase(apellidoJugador)) {
				encontrado = true;
				for (int i = 0; i < 3; i++) {

					Pregunta pregunta = juegoQuiz.getPreguntas().get(random.nextInt(juegoQuiz.getPreguntas().size()));
					System.out.println(pregunta.getPregunta());
					for (String opcion : pregunta.getOpciones()) {
						System.out.println(opcion);
					}

					System.out.print("Respuesta 1 / 2 / 3: ");
					int respuesta = correccionErrores();
					if (respuesta == 1 || respuesta == 2 || respuesta == 3) {
						if (respuesta == pregunta.getRespuestaCorrecta()) {

							System.out.println("Respuesta correcta. +10 puntos");
							j.setPuntuacion(j.getPuntuacion() + 10);
						} else {
							System.out.println("Respuesta incorrecta. -5 puntos\nLa respuesta correcta era la opcion "
									+ pregunta.getRespuestaCorrecta());
							j.setPuntuacion(j.getPuntuacion() - 5);
						}
					} else {
						System.err.println("ERROR - No era ninguna de esas opciones.");

					}

				}

			}
		}

		if (!encontrado) {
			System.out.println("No se encontr� al jugador.");

		}

	}

	public static void mostrarPuntuaciones() {
		System.out.println("\nPuntuaciones:");
		for (Jugador jugador : juegoQuiz.getJugadores()) {
			System.out.println(
					jugador.getNombre().substring(0, 1).toUpperCase() + jugador.getNombre().substring(1).toLowerCase()
							+ " " + jugador.getApellido().substring(0, 1).toUpperCase()
							+ jugador.getApellido().substring(1).toLowerCase() + " : " + jugador.getPuntuacion());
		}
	}

	public static void nuevapregunta() {
		Scanner txt = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int correcta = 0;
		System.out.print("Introduzca el enunciado de la pregunta nueva: ");
		String enunciado = txt.nextLine().trim();
		System.out.println("Introduzca las 3 posibles soluciones de la pregunta nueva: ");
		String opciones[] = new String[3];
		for (int i = 0; i < opciones.length; i++) {
			System.out.print("Introduzca la opci�n " + (i + 1) + ": ");
			opciones[i] = sc.nextLine();
		}
		do {
			System.out.print("Introduzca el n�mero de la respuesta correcta (1, 2 o 3): ");
			correcta = correccionErrores();
			if (correcta == 1 || correcta == 2 || correcta == 3) {
				Pregunta nuevaPregunta = new Pregunta(enunciado, opciones, correcta);
				juegoQuiz.getPreguntas().add(nuevaPregunta);
				System.out.println("Nueva pregunta a�adida correctamente.");

			}
		} while (correcta != 1 && correcta != 2 && correcta != 3);
	}

	public void datosFicticios() {
		preguntas.add(new Pregunta("�Cu�l es la capital de Francia?",
				new String[] { "1 - Madrid", "2 - Par�s", "3 - Londres" }, 2));
		preguntas.add(new Pregunta("�Cu�ntos lados tiene un cuadrado?",
				new String[] { "1 - Tres lados", "2 - Cuatro lados", "3 - Cinco lados" }, 2));
		preguntas.add(new Pregunta("�Qui�n escribi� 'Don Quijote de la Mancha'?",
				new String[] { "1 - Miguel de Cervantes", "2 - Gabriel Garc�a M�rquez", "3 - Pablo Neruda" }, 1));
		preguntas.add(new Pregunta("�En qu� a�o comenz� la Segunda Guerra Mundial?",
				new String[] { "1 - 1939", "2 - 1941", "3 - 1945" }, 1));
		preguntas.add(new Pregunta("�Cu�l es el planeta m�s grande del sistema solar?",
				new String[] { "1 - J�piter", "2 - Saturno", "3 - Urano" }, 1));
		preguntas.add(new Pregunta("�Cu�l es el pa�s m�s poblado del mundo?",
				new String[] { "1 - China", "2 - India", "3 - Estados Unidos" }, 1));
		preguntas.add(new Pregunta("�Qui�n pint� la Mona Lisa?",
				new String[] { "1 - Leonardo da Vinci", "2 - Pablo Picasso", "3 - Vincent van Gogh" }, 1));
		preguntas.add(new Pregunta("�Cu�l es la monta�a m�s alta del mundo?",
				new String[] { "1 - Monte Everest", "2 - K2", "3 - Monte Kilimanjaro" }, 1));
		preguntas.add(new Pregunta("�Cu�l es el hueso m�s largo del cuerpo humano?",
				new String[] { "1 - F�mur", "2 - Tibia", "3 - Radio" }, 1));
		preguntas.add(new Pregunta("�Cu�l es el s�mbolo qu�mico del ox�geno?",
				new String[] { "1 - H", "2 - C", "3 - O" }, 3));
		preguntas.add(new Pregunta("�Cu�l es la f�rmula qu�mica del agua?",
				new String[] { "1 - H2O", "2 - CO2", "3 - CH4" }, 1));
		preguntas.add(new Pregunta("�Cu�l es el planeta m�s cercano al Sol?",
				new String[] { "1 - Marte", "2 - Venus", "3 - Mercurio" }, 3));
		preguntas.add(new Pregunta("�Qui�n escribi� la obra \"Romeo y Julieta\"?",
				new String[] { "1 - Charles Dickens", "2 - William Shakespeare", "3 - Jane Austen" }, 2));
		preguntas.add(new Pregunta("�Cu�l es el resultado de 5 + 3?",
				new String[] { "1 - Siete", "2 - Ocho", "3 - Seis" }, 2));
		jugadores.add(new Jugador("domingo", "martinez", 25));
		jugadores.add(new Jugador("natalia", "lara", 29));
		jugadores.add(new Jugador("elias", "pedrero", 19));
	}

	public static int correccionErrores() {
		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		int error = 0;
		do {
			try {
				error = sc.nextInt();
				valido = true;
			} catch (InputMismatchException ex) {
				System.err.print("ERROR -- Introduzca un n�mero: ");
				sc.next();
				error = 0;
			}
		} while (!valido);
		return error;
	}

	public static void ingresarJ() {
		Scanner sc = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		System.out.print("Introduzca el nombre del nuevo jugador: ");
		String nombre = txt.nextLine().toLowerCase().trim();
		System.out.print("Introduzca el apellido del nuevo jugador: ");
		String apellido = txt.nextLine().toLowerCase().trim();
		System.out.print("Introduzca su edad: ");
		int edad = Juego.correccionErrores();
		Juego.getJuegoQuiz().getJugadores().add(new Jugador(nombre, apellido, edad));
		
	}

	public static void eliminarJ() {
		Scanner txt = new Scanner(System.in);
		for (Jugador jugador : juegoQuiz.getJugadores()) {
			System.out.println(jugador);
		}
		System.out.print("Introduzca el nombre del jugador a eliminar: ");
		String nombreAEliminar = txt.nextLine().toLowerCase().trim();
		System.out.print("Introduzca el apellido del jugador a eliminar: ");
		String apellidoAEliminar = txt.nextLine().toLowerCase().trim();
		Jugador jugadorAEliminar = Jugador.buscarJugador(nombreAEliminar, apellidoAEliminar, juegoQuiz.getJugadores());

		if (jugadorAEliminar != null) {
			juegoQuiz.getJugadores().remove(jugadorAEliminar);
			System.out.println("Jugador '" + nombreAEliminar.toUpperCase() + " " + apellidoAEliminar.toUpperCase()
					+ "' eliminado correctamente.");
		} else {
			System.out.println("El jugador '" + nombreAEliminar + "' no existe en la lista de jugadores.");
		}

	}

}
