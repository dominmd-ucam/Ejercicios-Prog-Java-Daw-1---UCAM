package unidad6.practica.nataliadomingo;

import java.util.Arrays;

public class Pregunta {

	private String pregunta;
	private String[] opciones;
	private int respuestaCorrecta;

	public Pregunta() {
	}

	public Pregunta(String pregunta, String[] opciones, int respuestaCorrecta) {
		this.pregunta = pregunta;
		this.opciones = opciones;
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}

	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}


	@Override
	public String toString() {
		return "Pregunta [pregunta=" + pregunta + ", opciones=" + Arrays.toString(opciones) + ", respuestaCorrecta="
				+ respuestaCorrecta + "]";
	}

}
