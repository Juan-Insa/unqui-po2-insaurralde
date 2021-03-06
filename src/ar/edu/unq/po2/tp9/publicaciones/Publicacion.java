package ar.edu.unq.po2.tp9.publicaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Publicacion implements Publicable{
    private List<IArticulo> articulos = new ArrayList<IArticulo>();
    private List<InvestigadorObserver> suscriptores = new ArrayList<InvestigadorObserver>();
    
	
    /*
     * envia las notificaciones sobre el articulo dado a los suscriptores que les interesa
     */
	@Override
	public void notificar(IArticulo articulo) {
	    for (InvestigadorObserver investigador : this.getSuscriptores()) {
			this.notificarSiLeInteresa(investigador, articulo);
		}
	}

	/*
	 * le envía el articulo al investigador dado si le es de interes
	 */
	private void notificarSiLeInteresa(InvestigadorObserver investigador, IArticulo articulo) {
		if (this.leInteresa(articulo, investigador)){
			investigador.agregarArticulo(articulo);
		}
	}
	
	/*
	 * indica si alguna de las palabras clave del articulo coincide con los temas de interes
	 * del investigador.
	 */
	@Override
	public boolean leInteresa(IArticulo articulo, InvestigadorObserver investigador) {
		Stream<String> temasDeInteres = investigador.temasDeInteres().stream(); 
	
		return temasDeInteres.anyMatch(articulo.getPalabrasClave()::contains);
	}

	/*
	 * cuando se agrega un articulo se notifica a los suscriptores.
	 */
	@Override
	public void agregarArticulo(IArticulo articulo) {
		this.articulos.add(articulo);
		this.notificar(articulo);
		
	}
	
	@Override
	public void agregarInvestigador(InvestigadorObserver investigador) {
		this.suscriptores.add(investigador);
	}

	@Override
	public void borrarInvestigador(InvestigadorObserver investigador) {
		this.suscriptores.remove(investigador);
	}

	List<InvestigadorObserver> getSuscriptores() {
		return suscriptores;
	}
	
}
