package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public class Articulo implements IArticulo{
	private String titulo;
	private List<String> autores;
	private String filiacion;
	private String lugar;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autores, String filiacion, String lugar, List<String> palabrasClave) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.lugar = lugar;
		this.palabrasClave = palabrasClave;
	}

	public String getFiliacion() {
		return filiacion;
	}
	
	void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}
	
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
	
	
	

}
