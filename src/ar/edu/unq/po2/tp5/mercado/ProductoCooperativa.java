package ar.edu.unq.po2.tp5.mercado;

public class ProductoCooperativa extends Producto{
    private Double descuento;
    
    public ProductoCooperativa(Double precio, Integer stock, Double descuento) {
		super(precio, stock);
		this.descuento = descuento;
	}
    
    @Override
    Double precioFinal() {
	    return this.getPrecio() - this.descuento();
	}
    
	Double descuento() {
		return (this.getPrecio() * this.descuento) / 100;
	}
	
	void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

}	
    
    