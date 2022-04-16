package ar.edu.unq.po2.tp4.impuesto;

public class Ingreso {
	private String mes;
	private String concepto;
	private double monto;

	public Ingreso(String mes, String concepto, double monto) {
		this.setIngreso(mes, concepto, monto);
	}
	
	private void setIngreso(String mes2, String concepto2, double monto2) {
		this.setConcepto(concepto2);
		this.setMes(mes2);
		this.setMonto(monto2);
	}
	
	boolean esExcento() {
		return false;
	}

	/**
	 * accessors
	 * @return
	 */
	
	String getMes() {
		return mes;
	}

	void setMes(String mes) {
		this.mes = mes;
	}

	String getConcepto() {
		return concepto;
	}

	void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	double getMonto() {
		return monto;
	}

	void setMonto(double monto) {
		this.monto = monto;
	}

}
