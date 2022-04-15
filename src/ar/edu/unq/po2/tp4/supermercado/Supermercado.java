package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
        this.setSupermercado(nombre, direccion);
	}

	private void setSupermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}

	void agregarProducto(Producto prod) {
		this.productos.add(prod);
	}

	Integer getCantidadDeProductos() {
		return productos.size();
	}

	double getPrecioTotal() {
		double amount = 0.0;
		for (Producto producto : productos) {
			amount += producto.getPrecio();
		}
		return amount;
	}
	
	/**
	 * Accessors
	 */
	
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getDireccion() {
		return direccion;
	}

	void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
