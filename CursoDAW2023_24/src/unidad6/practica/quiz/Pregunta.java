package unidad6.practica.quiz;

public class Pregunta {

	private static int id;
	private String pregunta;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	
	private boolean respuesta1_correcta;
	private boolean respuesta2_correcta;
	private boolean respuesta3_correcta;
	
	
	public Pregunta(int id, String pregunta, String respuesta1, String respuesta2, String respuesta3,
			boolean respuesta1_correcta, boolean respuesta2_correcta, boolean respuesta3_correcta) {
		
		this.id = id;
		this.pregunta = pregunta;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.respuesta1_correcta = respuesta1_correcta;
		this.respuesta2_correcta = respuesta2_correcta;
		this.respuesta3_correcta = respuesta3_correcta;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta1() {
		return respuesta1;
	}
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public String getRespuesta2() {
		return respuesta2;
	}
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public String getRespuesta3() {
		return respuesta3;
	}
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public boolean isRespuesta1_correcta() {
		return respuesta1_correcta;
	}
	public void setRespuesta1_correcta(boolean respuesta1_correcta) {
		this.respuesta1_correcta = respuesta1_correcta;
	}
	public boolean isRespuesta2_correcta() {
		return respuesta2_correcta;
	}
	public void setRespuesta2_correcta(boolean respuesta2_correcta) {
		this.respuesta2_correcta = respuesta2_correcta;
	}
	public boolean isRespuesta3_correcta() {
		return respuesta3_correcta;
	}
	public void setRespuesta3_correcta(boolean respuesta3_correcta) {
		this.respuesta3_correcta = respuesta3_correcta;
	}
	
	
	
}
