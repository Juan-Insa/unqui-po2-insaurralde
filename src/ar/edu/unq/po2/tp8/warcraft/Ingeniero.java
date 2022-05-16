package ar.edu.unq.po2.tp8.warcraft;

public class Ingeniero extends Personaje{
    private int lajas;
    
    /*
     * por cada valor de distancia entre la posición actual y la de destino va dejando lajas si corresponde
     * en realidad falta implementar dejar la laja en las posiciones que va recorriendo pero no es la idea del tp.
     */
    @Override
    void caminar(Posicion posicion) {
    	super.caminar(posicion);
    	int distancia = this.getPosicionActual().distanciaCon(posicion);
    	for (int i = 0; i < distancia; i++) {
    		this.dejarLaja();
    	}
    }
	
	@Override
	void addPersonaje(Personaje personaje) {}

	@Override
	void removePersonaje(Personaje personaje) {}

	@Override
	Personaje getPersonaje(int nro) {return null;}
	
	void agregarLajas(int cantidad) {
		this.lajas += cantidad;
	}
	
	void dejarLaja() {
		if (! this.getPosicionActual().hayLaja() && this.quedanLajas()) {
			this.lajas--;
		}
	}
	
	boolean quedanLajas() {
		return this.lajas > 0;
	}

}
