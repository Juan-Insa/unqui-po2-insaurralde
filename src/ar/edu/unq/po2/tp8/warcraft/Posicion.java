package ar.edu.unq.po2.tp8.warcraft;

import java.lang.Math;

public class Posicion {
    // acá iría alguna implementación de posiciones en el mapa, por ahora es simplemente por int
	private boolean hayLaja = false;
    private int coordenada;
    
    int distanciaCon(Posicion posicion) {
        return Math.abs(this.coordenada - posicion.getCoordenada());
    }
    
    int getCoordenada() {
    	return this.coordenada;
    }
    
    void ponerLaja(){
    	this.hayLaja = true;
    }
    
    void sacarLaja() {
    	this.hayLaja = false;
    }
    
    boolean hayLaja() {
    	return this.hayLaja;
    }
}
