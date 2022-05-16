package ar.edu.unq.po2.tp7.poquer4;

import ar.edu.unq.po2.tp7.poquer3.ICarta;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {

    public String verificar(ICarta c1, ICarta c2, ICarta c3, ICarta c4, ICarta c5) {
	    List<ICarta> cartas = new ArrayList<ICarta>();
	    cartas.add(c1); cartas.add(c2); cartas.add(c3); cartas.add(c4); cartas.add(c5);
	    
	    Mano mano = new Mano(cartas); 
	
	    return mano.getJugada();
	}

	Mano manoGanadora(Mano mano1, Mano mano2) {	
		if (mano1.getJugada() == mano2.getJugada()) {
			return this.desempatar(mano1,mano2);
		}
		else if (ganaJugadaDeA(mano1, mano2)) {
			return mano1;
		}
		else {
			return mano2;
		}
	}

	boolean ganaJugadaDeA(Mano mano1, Mano mano2) {
		return mano1.valorDeJugada() > mano2.valorDeJugada();
	}

	Mano desempatar(Mano mano1, Mano mano2) {
		if (valorTotal(mano1.valoresDeCartas()) > valorTotal(mano2.valoresDeCartas())) {
			return mano1;
		}
		else {
			return mano2;
		}
	}

	private int valorTotal(List<Integer> valoresDeCartas) {
		int total = 0;
		for (Integer valor : valoresDeCartas) {
			total += valor;
		}
		return total;
	}
	
	
	

    	
}