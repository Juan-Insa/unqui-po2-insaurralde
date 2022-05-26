package ar.edu.unq.po2.tp10.sueldos;

public class Planta extends Trabajador{
	private Double sueldoBasico;
	private int cantHijos;
	private Double plus;
	
	public Planta(Double sueldoBasico, int cantHijos, Double plus) {
		super();
		this.sueldoBasico = sueldoBasico;
		this.cantHijos = cantHijos;
		this.plus = plus;
	}

	@Override
	protected Double getSueldoBasico() {
		return this.sueldoBasico;
	}

	@Override
	protected Double plus() {
		return this.plus * this.cantHijos;
	}

	@Override
	protected Double sueldoPorHora() {
		return 0d;
	}
	
	void setSueldoBasico(Double nuevoSueldo) {
		this.sueldoBasico = nuevoSueldo;
	}
	
	void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	int getCantHijos() {
		return this.cantHijos;
	}
	
	Double getPlus() {
		return this.plus;
	}
    
}
