package ar.edu.unq.po2.tp8.cultivos;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta extends Parcela{
	List<Parcela> parcelas = new ArrayList<Parcela>();

	
	/*
	 * describe la ganancia anual de todas las parcelas que la componen.
	 */
	@Override
	double getGananciaAnual() {
		double total = 0d;
		for (Parcela parcela : parcelas) {
			total += parcela.getGananciaAnual();
		}
		return total;
	}
    
	/*
	 * agrega una parcela a la composición
	 */
	@Override
	void addParcela(Parcela parcela) {
		this.parcelas.add(parcela);
	}

	/*
	 * elimina una parcela de la composición
	 */
	@Override
	void removeParcela(Parcela parcela) {
		this.parcelas.remove(parcela);
	}
    
	/*
	 * obtiene la parcela de la posición dada
	 */
	@Override
	Parcela getParcela(int nro) {
		return parcelas.get(nro - 1);
	}

	@Override
	void setGananciaAnual(double ganancia) {}

}
