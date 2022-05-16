package ar.edu.unq.po2.tp8.warcraft;

public abstract class Personaje {
    private Posicion posicionActual;
	
    /*
     * mueve a un personaje de una posición a otra.
     */
	void caminar(Posicion posicion) {
		this.setPosicionActual(posicion);
	}
	
	/*
	 * devuelve la posicion actual del jugador.
	 */
	Posicion getPosicionActual() {
		return this.posicionActual;
	}
	
	void setPosicionActual(Posicion nuevaPosicion) {
		this.posicionActual = nuevaPosicion;
	}
	
	abstract void addPersonaje(Personaje personaje);
	abstract void removePersonaje(Personaje personaje);
	abstract Personaje getPersonaje(int nro);
	
}
