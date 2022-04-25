package ar.edu.unq.po2.tp5.personas;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrables{
    private String nombre;
    private LocalDate fecNac;
           
	public Persona(String nombre, LocalDate fecNac) {
		super();
		this.setNombre(nombre);
		this.setFecNac(fecNac);
	}
	
	int edad() {
		Period edad = Period.between(fecNac, LocalDate.now());
		return edad.getYears();
	}
	
	boolean esMayorA(Persona p) {
		return this.edad() > p.edad();
	}

	public String getNombre() {
		return this.nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	LocalDate getFecNac() {
		return fecNac;
	}
	void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}
    
    
	
}
