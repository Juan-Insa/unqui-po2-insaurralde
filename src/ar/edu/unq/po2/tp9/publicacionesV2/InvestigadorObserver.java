package ar.edu.unq.po2.tp9.publicacionesV2;

import java.util.List;

public interface InvestigadorObserver {
    public void agregarArticulo(IArticulo articulo);
    public void publicarArticulo(IArticulo articulo, Publicable publicacion);
    public List<String> temasDeInteres();
	public void suscribirse(Publicable publicacion, List<String> temasDeInteres);
}
