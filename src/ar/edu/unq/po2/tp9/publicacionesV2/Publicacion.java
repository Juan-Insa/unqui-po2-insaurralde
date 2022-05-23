package ar.edu.unq.po2.tp9.publicacionesV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
 * Esta version implementa un map con los investigadores junto sus intereses como suscriptores en vez de 
 * una lista. De este modo la publicación no tiene que enviar el mensaje getTemasDeInteres a cada suscriptor.
 * Solamente le manda mensaje al suscriptor para enviar el articulo nuevo que le interese.
 */

public class Publicacion implements Publicable{
    private List<IArticulo> articulos = new ArrayList<IArticulo>();
    private Map<InvestigadorObserver, List<String>> suscriptores = new HashMap<InvestigadorObserver, List<String>>();
    
	
    /*
     * envia las notificaciones sobre el articulo dado a los suscriptores que les interesa
     */
	@Override
	public void notificar(IArticulo articulo) {
	    this.suscriptores.forEach((investigador, intereses) -> this.notificarSiLeInteresa(investigador, intereses, articulo));
	}

	/*
	 * le envía el articulo al investigador dado si le es de interes
	 */
	private void notificarSiLeInteresa(InvestigadorObserver investigador, List<String> intereses, IArticulo articulo) {
		if (this.leInteresa(intereses, articulo)){
			investigador.agregarArticulo(articulo);
		}
	}
	
	/*
	 * indica si alguna de las palabras clave del articulo coincide con los temas de interes
	 * del investigador.
	 */
	@Override
	public boolean leInteresa(List<String> intereses, IArticulo articulo) {
		Stream<String> temasDeInteres = intereses.stream(); 
	
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
	public void agregarInvestigador(InvestigadorObserver investigador, List<String> temasDeInteres) {
		this.suscriptores.put(investigador, temasDeInteres);
	}

	@Override
	public void borrarInvestigador(InvestigadorObserver investigador) {
		this.suscriptores.remove(investigador);
	}

	Set<InvestigadorObserver> getSuscriptores() {
		return this.suscriptores.keySet();
	}
	
}
