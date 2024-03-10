	 /**
	 * @author Domingo Martinez Diaz
	 * Crear un proyecto “Quiz” que sea una aplicación que implemente un juego con preguntas cortas.
	 * 
	 */

package unidad6.practica.quiz;

public class Principal {

	public static void main(String[] args) {
		
		//Iniciamos el juego y las preguntas
		Juego.iniciarJugadores();
		Juego.iniciarPreguntas();
		
		//System.out.println(Juego.seleccionarJugador());
		//Guardamos seleccionar jugador para usarlo mas adelante.
		
		Jugador jugador = Juego.seleccionarJugador();
		
		Juego.jugar(jugador);
		
	}
	

}
