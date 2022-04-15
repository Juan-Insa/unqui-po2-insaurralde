package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean preciosCuidados) {
		super(nombre, precio, preciosCuidados);
	}

	@Override
	double getPrecio() {
		return this.precio * 0.9;
	}

}
