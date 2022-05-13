package ar.edu.unq.po2.tp7.poquer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PokerStatus {
	
	
    public String verificar(String c1, String c2, String c3, String c4, String c5) {
	    List<String> mano = new ArrayList<String>();
	    mano.add(c1);
	    mano.add(c2);
	    mano.add(c3);
	    mano.add(c4);
	    mano.add(c5);
	
	    return this.jugada(mano);
	}

    String jugada(List<String> mano) {
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

	boolean esPoquer(List<String> mano) {
		List<String> valores = this.valoresDeCartas(mano);
		
    	int iteracionesC1 = Collections.frequency(valores, valores.get(0));
    	int iteracionesC2 = Collections.frequency(valores, valores.get(1));
    	
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}

    boolean esColor(List<String> mano) {
		List<String> colores = this.coloresDeCartas(mano);
		
		int iteracionesC1 = Collections.frequency(colores, colores.get(0));
    	int iteracionesC2 = Collections.frequency(colores, colores.get(1));
    	
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}
    
    boolean esTrio(List<String> mano) {
		List<String> valores = this.valoresDeCartas(mano);
		
		int iteracionesC1 = Collections.frequency(valores, valores.get(0));
    	int iteracionesC2 = Collections.frequency(valores, valores.get(1));
    	int iteracionesC3 = Collections.frequency(valores, valores.get(2));
    	
		return iteracionesC1 == 3 || iteracionesC2 == 3 || iteracionesC3 == 3;
	}

	List<String> coloresDeCartas(List<String> mano) {
        List<String> colores = new ArrayList<String>();
		for (String carta : mano) {
			colores.add(this.colorCarta(carta));
		}
		
		return colores;
	}
	
	String colorCarta(String carta) {
		if (carta.length() == 3) {
			return carta.substring(2);
		}
		else {
			return carta.substring(1);
		}
	}

	List<String> valoresDeCartas(List<String> mano) {
        List<String> valores = new ArrayList<String>();
		for (String carta : mano) {
			valores.add(this.valorCarta(carta));
		}
		
		return valores;
	}

	String valorCarta(String c1) {
		
		if (c1.length() >= 3) {
			return c1.substring(0, 2);
		}
		else {
			return c1.substring(0, 1);
		}
	}
    	
}

