package unidad5.tareas.tarea6;

import java.util.ArrayList;

public class GrupoMusical {
	
	private String nombreGrupo ;
	private ArrayList<Musico> componentes;
	private String web;
	private int AnyoCreacion;
	
	
	public GrupoMusical() {
		
	}
	
	public GrupoMusical(String nombreGrupo, ArrayList<Musico> componentes, String web, int anyoCreacion) {
		
		this.nombreGrupo = nombreGrupo;
		this.componentes = componentes;
		this.web = web;
		AnyoCreacion = anyoCreacion;
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public ArrayList<Musico> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Musico> componentes) {
		this.componentes = componentes;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public int getAnyoCreacion() {
		return AnyoCreacion;
	}
	public void setAnyoCreacion(int anyoCreacion) {
		AnyoCreacion = anyoCreacion;
	}

	@Override
	public String toString() {
		int i=1;
		return "GrupoMusical "+i +"- Nombre del Grupo: " + nombreGrupo + ",\n - Artistas: " + componentes + ",\n - Pagina Web: "
				+ web + ",\n - Fecha de Creacion: " + AnyoCreacion + "";
	}
	
	
	
	
	
}
