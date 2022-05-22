package ar.edu.unq.po2.tp9.publicaciones;

public interface Publicable {
	public void agregarInvestigador(InvestigadorObserver investigador);
	public void borrarInvestigador(InvestigadorObserver investigador);
	public void agregarArticulo(IArticulo articulo);
	public boolean leInteresa(IArticulo articulo, InvestigadorObserver investigador);
	public void notificar(IArticulo articulo);
	
}
