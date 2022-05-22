package ar.edu.unq.po2.tp9.publicaciones;

import java.util.List;

public interface InvestigadorObserver {
    public void agregarArticulo(IArticulo articulo);
    public void publicarArticulo(IArticulo articulo, Publicable publicacion);
    public List<String> temasDeInteres();
}
