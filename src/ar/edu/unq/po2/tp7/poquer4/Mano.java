package ar.edu.unq.po2.tp7.poquer4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.edu.unq.po2.tp7.poquer3.ICarta;

public class Mano {
    private List<ICarta> cartas = new ArrayList<ICarta>();
    private String jugada;

	
    public Mano(List<ICarta> cartas) {
		super();
		this.cartas = cartas;
		this.jugada = this.jugada();
	}

	String jugada() {
		if (this.esPoquer()) {
			return "Poquer";
		}
		else if (this.esColor()) {
			return "Color";
		}
		else if (this.esTrio()) {
			return "Trio";
		}
		else {
			return "Nada";
		}
	}
    
	int valorDeJugada() {
		if (this.jugada == "poquer") {
			return 4;
		}
		else if (this.jugada == "color") {
			return 3;
		}
		else if (this.jugada == "Trio") {
			return 2;
		}
		else {
			return 1;
		}
	}
    
	boolean esPoquer() {
    	int iteracionesC1 = Collections.frequency(cartas, cartas.get(0));
    	int iteracionesC2 = Collections.frequency(cartas, cartas.get(1));
    	
		return iteracionesC1 == 4 || iteracionesC2 == 4;
	}

    boolean esColor() {
		int iteracionesC1 = Collections.frequency(cartas, cartas.get(0));
    	
		return iteracionesC1 == 5;
	}
    
    boolean esTrio() {
		int iteracionesC1 = Collections.frequency(cartas, cartas.get(0));
    	int iteracionesC2 = Collections.frequency(cartas, cartas.get(1));
    	int iteracionesC3 = Collections.frequency(cartas, cartas.get(2));
    	
		return iteracionesC1 == 3 || iteracionesC2 == 3 || iteracionesC3 == 3;
	}

	List<String> coloresDeCartas() {
        List<String> colores = new ArrayList<String>();
		for (ICarta carta : this.cartas) {
			colores.add(carta.getPalo());
		}
		return colores;
	}

	List<Integer> valoresDeCartas() {
        List<Integer> valores = new ArrayList<Integer>();
		for (ICarta carta : this.cartas) {
			valores.add(carta.getValor());
		}
		return valores;
	}
    
	List<ICarta> getCartas() {
		return cartas;
	}
	
	void setCartas(List<ICarta> cartas) {
		this.cartas = cartas;
	}
	
	String getJugada() {
		return jugada;
	}
	
	void setJugada(String jugada) {
		this.jugada = jugada;
	}
    
    
}
