package ar.edu.unq.po2.tp8.warcraft;

public class Caballero  extends Personaje{

	@Override
	void caminar(Posicion posicion) {
		super.caminar(posicion);
		this.vigilar();
	}
	
	@Override
	void addPersonaje(Personaje personaje) {}

	@Override
	void removePersonaje(Personaje personaje) {}

	@Override
	Personaje getPersonaje(int nro) {return null;}

}
