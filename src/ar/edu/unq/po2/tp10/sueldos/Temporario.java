package ar.edu.unq.po2.tp10.sueldos;

public class Temporario extends Planta{
	private boolean esCasado; 

	public Temporario(Double sueldoBasico, int cantHijos, Double plus, boolean esCasado) {
		super(sueldoBasico, cantHijos, plus);
		this.esCasado = esCasado;
	}

	@Override
	protected Double plus() {
		if (this.esCasado || this.getCantHijos() > 0) {
			return this.getPlus();
		} 
		else {
			return 0d;
		}
	}
}
