package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;
import java.util.stream.Stream;

public class Publicacion implements Publicable{
    private List<IArticulo> articulos;
    private List<InvestigadorObserver> suscriptores;
    
	@Override
	public void agregarInvestigador(InvestigadorObserver investigador) {
		this.suscriptores.add(investigador);
	}

	@Override
	public void borrarInvestigador(InvestigadorObserver investigador) {
		this.suscriptores.remove(investigador);
	}

	@Override
	public boolean leInteresa(IArticulo articulo, InvestigadorObserver investigador) {
		Stream<String> temasDeInteres = investigador.temasDeInteres().stream(); 
	
		return temasDeInteres.anyMatch(articulo.getPalabrasClave()::contains);
	}

	@Override
	public void notificar(IArticulo articulo) {
	    for (InvestigadorObserver investigador : this.suscriptores) {
			this.notificarSiLeInteresa(investigador, articulo);
		}
	}

	private void notificarSiLeInteresa(InvestigadorObserver investigador, IArticulo articulo) {
		if (this.leInteresa(articulo, investigador)){
			investigador.agregarArticulo(articulo);
		}
	}

	@Override
	public void agregarArticulo(IArticulo articulo) {
		this.articulos.add(articulo);
		this.notificar(articulo);
		
	}
}
