package ar.edu.unq.po2.tp4.impuesto;

public class IngresoHorasExtra extends Ingreso{
	private int horasExtra;

	public IngresoHorasExtra(String mes, String concepto, double monto, int horasExtra) {
		super(mes, concepto, monto);
		this.setHorasExtra(horasExtra);
	}
	
	@Override
	boolean esExcento() {
		return true;
	}
	
	int getHorasExtra() {
		return horasExtra;
	}

	void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

}
