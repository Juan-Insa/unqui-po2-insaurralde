package ar.edu.unq.po2.tp7.poquer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerStatus {

    public String verificar(ICarta c1, ICarta c2, ICarta c3, ICarta c4, ICarta c5) {
	    List<ICarta> mano = new ArrayList<ICarta>();
	    mano.add(c1);
	    mano.add(c2);
	    mano.add(c3);
	    mano.add(c4);
	    mano.add(c5);
	
	    return this.jugada(mano);
	}

    String jugada(List<ICarta> mano) {
		if (this.esPoquer(mano)) {
			return "Poquer";
		}
		else if (this.esColor(mano)) {
			return "Color";
		}
		else if (this.esTrio(mano)) {
			return "Trio";
		}
		else {
			return "Nada";
		}
	}

	boolean esPoquer(List<ICarta> mano) {
		List<Integer> valores = this.valoresDeCartas(mano);
		
    	int iteracionesC1 = Collections.frequency(valores, valores.get(0));
    	int iteracionesC2 = Collections.frequency(valores, valores.get(1));
    	
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}

    boolean esColor(List<ICarta> mano) {
		List<String> colores = this.coloresDeCartas(mano);
		
		int iteracionesC1 = Collections.frequency(colores, colores.get(0));
    	
		return iteracionesC1 == 5;
	}
    
    boolean esTrio(List<ICarta> mano) {
		List<Integer> valores = this.valoresDeCartas(mano);
		
		int iteracionesC1 = Collections.frequency(valores, valores.get(0));
    	int iteracionesC2 = Collections.frequency(valores, valores.get(1));
    	int iteracionesC3 = Collections.frequency(valores, valores.get(2));
    	
		return iteracionesC1 == 3 || iteracionesC2 == 3 || iteracionesC3 == 3;
	}

	List<String> coloresDeCartas(List<ICarta> mano) {
        List<String> colores = new ArrayList<String>();
		for (ICarta carta : mano) {
			colores.add(carta.getPalo());
		}
		return colores;
	}

	List<Integer> valoresDeCartas(List<ICarta> mano) {
        List<Integer> valores = new ArrayList<Integer>();
		for (ICarta carta : mano) {
			valores.add(carta.getValor());
		}
		return valores;
	}
    	
}

