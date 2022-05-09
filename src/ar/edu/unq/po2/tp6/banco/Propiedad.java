package ar.edu.unq.po2.tp6.banco;

public class Propiedad implements Garantia {
    private String descripcion;
    private String direccion;
    private Double valorFiscal;
    
	public Propiedad(String descripcion, String direccion, Double valorFiscal) {
		super();
		this.setDescripcion(descripcion);
		this.setValorFiscal(valorFiscal);
		this.setDireccion(direccion);
	}

	@Override
	public Double getValorFiscal() {
		return this.valorFiscal;
	}

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	String getDireccion() {
		return direccion;
	}

	void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	void setValorFiscal(Double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

}
