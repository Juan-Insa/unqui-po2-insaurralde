package ar.edu.unq.po2.tp5.mercado;

import java.util.ArrayList;
import java.util.List;

public class Caja {
    private List<Double> registrados = new ArrayList<Double>();

	void registrar(Producto p) {
		this.registrados.add(p.registrar());
	}
	
	Double montoTotal() {
		Double total = 0d;
		for (Double producto : registrados) {
			total += producto;
		}
		return total;  
	}

	List<Double> getRegistrados() {
		return registrados;
	}
      
}
