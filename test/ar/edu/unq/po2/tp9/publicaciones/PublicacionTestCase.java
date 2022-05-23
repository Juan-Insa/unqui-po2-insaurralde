package ar.edu.unq.po2.tp9.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PublicacionTestCase {
	private Publicacion publicacion;
	private InvestigadorObserver investigador1;
	private InvestigadorObserver investigador2;
	private IArticulo articuloMedicina;
	private IArticulo articuloInformatica;
	

	@BeforeEach
	void setUp() throws Exception {
	    
	    investigador1 = mock(Investigador.class);
	    investigador2 = mock(Investigador.class);
	    
	    articuloMedicina = mock(Articulo.class);
	    articuloInformatica = mock(Articulo.class);
	    
	    /*
	     * publicación con investigador1 y 2 como suscriptores.
	     */
	    publicacion = new Publicacion();
	    
	    publicacion.agregarInvestigador(investigador1);
	    publicacion.agregarInvestigador(investigador2);
	    
	    /*
	     * lista de palabras clave del articulo de medicina (vacunacion, medicina, salud)
	     */
	    List<String> palabrasClave1 = new ArrayList<String>();
	    palabrasClave1.add("vacunacion"); palabrasClave1.add("medicina"); palabrasClave1.add("salud");
	    when(articuloMedicina.getPalabrasClave()).thenReturn(palabrasClave1);  // si le manda el mensaje getPalabrasClave devuelve la lista
	    
	    /*
	     * lista de palabras clave del articulo de informatica (microprocesador, amd, informatica)
	     */
	    List<String> palabrasClave2 = new ArrayList<String>();
	    palabrasClave2.add("microprocesador"); palabrasClave2.add("amd"); palabrasClave2.add("informatica");
	    when(articuloInformatica.getPalabrasClave()).thenReturn(palabrasClave2);  // si le manda el mensaje getPalabrasClave devuelve la lista
	    
	    /*
	     * lista de temas de interes del investigador 1
	     */
	    List<String> interesesInv1 = new ArrayList<String>();
	    interesesInv1.add("medicina");interesesInv1.add("politica");
        when(investigador1.temasDeInteres()).thenReturn(interesesInv1);
        
        /*
	     * lista de temas de interes del investigador 2
	     *
	     */
        List<String> interesesInv2 = new ArrayList<String>();
	    interesesInv2.add("mineria");interesesInv2.add("informatica");
        when(investigador2.temasDeInteres()).thenReturn(interesesInv2);
	    
	}

	@Test
	void agregaInvestigadores() {
		publicacion.agregarArticulo(articuloMedicina);
		
	    assertEquals(2, publicacion.getSuscriptores().size());
	}
	
	@Test
	void seAgregaElArticuloDeMedicinaALaPublicacionYSoloLoRecibeElInvestigador1() {
		publicacion.agregarArticulo(articuloMedicina);
		
	    verify(investigador1, atMost(1)).agregarArticulo(articuloMedicina);
		verify(investigador2, never()).agregarArticulo(articuloMedicina);
	}
	
	@Test
	void seAgregaElArticuloDeInformaticaALaPublicacionYSoloLoRecibeElInvestigador2() {
		publicacion.agregarArticulo(articuloInformatica);
		
	    verify(investigador1, never()).agregarArticulo(articuloMedicina);
		verify(investigador2, atMost(1)).agregarArticulo(articuloMedicina);
	}

}
