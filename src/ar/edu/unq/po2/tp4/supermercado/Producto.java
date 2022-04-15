package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	private String  nombre;
	protected double  precio;
	private boolean preciosCuidados;

	public Producto(String nombre, double precio, boolean preciosCuidados) {
		this.setNombre(nombre);
        this.setPrecio(precio);
        this.setPreciosCuidados(preciosCuidados);
	}

	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
        this.setPrecio(precio);
        this.setPreciosCuidados(false);
	}

	void aumentarPrecio(double aumento) {
        this.setPrecio(this.getPrecio() + aumento);
	}
	
	/**
	 * Accessors
	 * @param preciosCuidados
	 */
	void setPreciosCuidados(boolean preciosCuidados) {
		this.preciosCuidados = preciosCuidados;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void setPrecio(double precio) {
		this.precio = precio;
	}
	
	String getNombre() {
		return this.nombre;
	}

	double getPrecio() {
		return this.precio;
	}
	
	boolean esPrecioCuidado() {
		return preciosCuidados;
	}


}
