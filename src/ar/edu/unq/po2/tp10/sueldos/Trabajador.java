package ar.edu.unq.po2.tp10.sueldos;

public abstract class Trabajador {
	private Double sueldoRecibido;

	protected void recibirSueldo(Object sueldo) {
		this.sueldoRecibido = this.sueldo();
	}
	
	Double getSueldoRecibido() {
		return sueldoRecibido;
	}

	Double sueldo() {
		return (this.sueldoBruto() - this.descuento());
	}

	Double descuento() {	
		return this.sueldoBruto() * 0.87d;
	}

	Double sueldoBruto() {
		return this.getSueldoBasico() + this.sueldoPorHora() + this.plus();
	}

	protected abstract Double getSueldoBasico();
	protected abstract Double plus();
	protected abstract Double sueldoPorHora();  	
}
