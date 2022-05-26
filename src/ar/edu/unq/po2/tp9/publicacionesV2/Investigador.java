package ar.edu.unq.po2.tp9.publicacionesV2;

import java.util.List;

public class Investigador implements InvestigadorObserver {
    private List<String> temasDeInteres;
    private List<IArticulo> articulos;
   
	@Override
	public void agregarArticulo(IArticulo articulo) {
		articulos.add(articulo);	
	}

	@Override
	public void publicarArticulo(IArticulo articulo, Publicable publicacion) {
		publicacion.agregarArticulo(articulo);
	}

	@Override
	public List<String> temasDeInteres() {
	    return this.temasDeInteres;
	}

	@Override
	public void suscribirse(Publicable publicacion, List<String> temasDeInteres) {
		publicacion.agregarInvestigador(this, this.temasDeInteres);
		
	}
    
}
