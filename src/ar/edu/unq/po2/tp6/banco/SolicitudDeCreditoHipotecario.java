package ar.edu.unq.po2.tp6.banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	private Garantia propiedad;
	
	public SolicitudDeCreditoHipotecario(Double montoTotal, int plazoEnMeses, IClientes cliente, Garantia propiedad) {
		super(montoTotal, plazoEnMeses, cliente);
		this.setPropiedad(propiedad);
	}
	
	@Override
	public boolean esAceptable() {
		return noSuperaIngresosMensuales(50d) && 
			   noSuperaValorFiscal(70d) &&
			   noEsMayorDe(65);
	}
	
	private boolean noEsMayorDe(int i) {
		return this.getCliente().edad() < 65;
	}

	private boolean noSuperaValorFiscal(double d) {
		Double valorFiscal = this.propiedad.getValorFiscal();
		return valorFiscal > (this.getMontoTotal() * d) / 100;
	}

	Garantia getPropiedad() {
		return propiedad;
	}

	void setPropiedad(Garantia propiedad) {
		this.propiedad = propiedad;
	}

	

	

}
