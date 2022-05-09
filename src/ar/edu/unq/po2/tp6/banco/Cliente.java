package ar.edu.unq.po2.tp6.banco;

import java.time.LocalDate;
import java.time.Period;

public class Cliente implements IClientes{
    private String nombre; 
    private String apellido;
    private String direccion;
    private LocalDate fecNac;
    private Double sueldoNetoMensual;
    
    public Cliente(String nombre, String apellido, String direccion, LocalDate fecNac, Double sueldoNetoMensual) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDireccion(direccion);
		this.setSueldoNetoMensual(sueldoNetoMensual);
		this.fecNac = fecNac;
	}
	
	@Override
	public Double sueldoAnual() {
		return this.sueldoNetoMensual * 12;
	}

	@Override
	public Double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	@Override
	public int edad() {
		Period edad = Period.between(fecNac, LocalDate.now());
		return edad.getYears();
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	void setApellido(String apellido) {
		this.apellido = apellido;
	}

	String getDireccion() {
		return direccion;
	}

	void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	String getNombre() {
		return nombre;
	}

	String getApellido() {
		return apellido;
	}

	
    
}
