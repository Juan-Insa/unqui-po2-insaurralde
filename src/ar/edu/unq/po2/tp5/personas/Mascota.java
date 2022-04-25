package ar.edu.unq.po2.tp5.personas;

public class Mascota implements Nombrables{
    private String nombre;
    private String raza;
    
	public Mascota(String nombre, String raza) {
		super();
		this.setNombre(nombre);
		this.setRaza(raza);
	}

	public String getNombre() {
		return this.nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getRaza() {
		return raza;
	}

	void setRaza(String raza) {
		this.raza = raza;
	}
    
    
}
