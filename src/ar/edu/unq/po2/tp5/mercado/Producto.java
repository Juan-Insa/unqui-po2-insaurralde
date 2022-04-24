package ar.edu.unq.po2.tp5.mercado;

public abstract class Producto {
    private Double precio;
    private Integer stock;
    
	public Producto(Double precio, Integer stock) {
		super();
		this.setPrecio(precio);
		this.setStock(stock);
	}

	Double registrar() {
		this.stock -= 1;
		return this.precioFinal();
	}
	
	abstract Double precioFinal();

	Double getPrecio() {
	    return this.precio;
	}
	
	Integer getStock() {
	    return this.stock;
	}
	
	private void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	private void setStock(Integer stock) {
		this.stock = stock;
	}
	
    
    
}
