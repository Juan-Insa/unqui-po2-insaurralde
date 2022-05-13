package ar.edu.unq.po2.tp7.poquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerStatus {

	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		
		List<String> valores = this.valoresDeCartas(c1,c2,c3,c4,c5);
		int iteracionesC1 = Collections.frequency(valores, valorCarta(c1));
		int iteracionesC2 = Collections.frequency(valores, valorCarta(c2));
		
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}


	private List<String> valoresDeCartas(String c1, String c2, String c3, String c4, String c5) {
		List<String> mano = new ArrayList<String>();
		
		mano.add(valorCarta(c1));
		mano.add(valorCarta(c2));
		mano.add(valorCarta(c3));
		mano.add(valorCarta(c4));
		mano.add(valorCarta(c5));

		return mano;
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
