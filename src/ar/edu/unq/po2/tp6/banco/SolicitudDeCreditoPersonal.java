package ar.edu.unq.po2.tp6.banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(Double montoTotal, int plazoEnMeses, IClientes cliente) {
		super(montoTotal, plazoEnMeses, cliente);
	}

	@Override
	public boolean esAceptable() {
		return this.getCliente().sueldoAnual() > 15000 && this.noSuperaIngresosMensuales(70d);
	}
    
}
