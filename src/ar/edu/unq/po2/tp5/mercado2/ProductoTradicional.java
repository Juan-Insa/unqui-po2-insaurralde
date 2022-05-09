package ar.edu.unq.po2.tp5.mercado2;

public class ProductoTradicional extends Producto implements Registrable{

	public ProductoTradicional(Double precio, Integer stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	@Override
	Double precioFinal() {
		return this.getPrecio();
	}
    
}
