package ar.edu.unq.po2.tp4.impuesto;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}

	double getTotalPercibido() {
		return this.getMontoImponible() - this.getImpuestoAPagar();
	}

	double getMontoImponible() {
		double amount = 0d;
		for (Ingreso ingreso : ingresos) {
			amount += ingreso.getMonto();
		}
		return amount;
	}

	double getImpuestoAPagar() {
		double amount = 0d;
		for (Ingreso ingreso : ingresos) {
			if (!ingreso.esExcento()) {
				amount += ingreso.getMonto();
			}
		}
		return amount * 0.02;
	}

	List<Ingreso> getIngresos() {
		return ingresos;
	}

	
	

}
