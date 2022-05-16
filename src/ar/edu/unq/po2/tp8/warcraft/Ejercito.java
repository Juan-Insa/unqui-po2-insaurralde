package ar.edu.unq.po2.tp8.warcraft;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {
    private List<Personaje> personajes = new ArrayList<Personaje>();
	
	@Override
	void caminar(Posicion posicion) {
		for (Personaje personaje : personajes) {
			personaje.caminar(posicion);
		}
	}
	
	/*
	 * agrega un personaje a la composición
	 */
	@Override
	void addPersonaje(Personaje personaje) {
		this.personajes.add(personaje);
	}

	/*
	 * borra un personaje de la composición
	 */
	@Override
	void removePersonaje(Personaje personaje) {
		this.personajes.remove(personaje);
	}

	@Override
	Personaje getPersonaje(int nro) {
		return personajes.get(nro - 1);
	}
    
}
