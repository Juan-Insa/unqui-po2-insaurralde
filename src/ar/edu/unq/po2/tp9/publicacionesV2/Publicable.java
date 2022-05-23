package ar.edu.unq.po2.tp9.publicacionesV2;

import java.util.List;

public interface Publicable {
	public void borrarInvestigador(InvestigadorObserver investigador);
	public void agregarArticulo(IArticulo articulo);
	public void notificar(IArticulo articulo);
	void agregarInvestigador(InvestigadorObserver investigador, List<String> temasDeInteres);
	boolean leInteresa(List<String> intereses, IArticulo articulo);
	
}
