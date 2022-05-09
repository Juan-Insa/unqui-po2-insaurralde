package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudDeCredito implements Solicitables{
    private Double montoTotal;
    private int plazoEnMeses;
    private IClientes cliente;

	public SolicitudDeCredito(Double montoTotal, int plazoEnMeses, IClientes cliente) {
		super();
		this.setMontoTotal(montoTotal);
		this.setPlazoEnMeses(plazoEnMeses);
		this.cliente = cliente;
	}

	Double cuotaMensual() {
    	return this.getMontoTotal() / this.getPlazoEnMeses();
    }

	public Double getMontoTotal() {
		return this.montoTotal;
	}
	
	protected boolean noSuperaIngresosMensuales(Double i) {
		return ((this.getCliente().getSueldoNetoMensual() * i) / 100) > this.cuotaMensual() ;
	}
	
	public abstract boolean esAceptable();
	
	
	
    public IClientes getCliente() {
		return this.cliente;
	}

	void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

	int getPlazoEnMeses() {
		return this.plazoEnMeses;
	}

	void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
    
    
}
