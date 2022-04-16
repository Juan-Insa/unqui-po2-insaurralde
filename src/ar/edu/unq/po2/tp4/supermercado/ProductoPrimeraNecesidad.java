package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
    private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean preciosCuidados, double descuento) {
		super(nombre, precio, preciosCuidados);
		this.setDescuento(descuento);
	}

	@Override
	double getPrecio() {
		return this.precio - ((this.getDescuento() * this.precio) / 100);
	}
	
	double getDescuento() {
		return descuento;
	}

	void setDescuento(double descuento) {
		this.descuento = descuento;
	}

}
