package ar.edu.unq.po2.tp7.poquer4;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.poquer3.ICarta;
import ar.edu.unq.po2.tp7.poquer3.PokerStatus;

class PokerStatusTestCase {
	private PokerStatus ps;
	private ICarta reyDeCorazones  ;
	private ICarta reyDePicas      ;
	private ICarta reyDeTrebol     ;
	private ICarta reyDeDiamantes  ;
	private ICarta diezDeCorazones ;
	private ICarta cincoDeCorazones;
	private ICarta tresDeCorazones ;
	private ICarta asDePicas       ;
	private ICarta asDeCorazones   ;
	private ICarta asDeTrebol      ;
	private ICarta asDeDiamantes   ;
	private ICarta dosDeDiamantes  ;
	private ICarta tresDeDiamantes ;
	private ICarta cincoDeDiamantes;
	
	// Con la nueva implemetación voy a tener q crear un mock por cada Mano (ni ganas ya estoy muy estresado).
	 
	@BeforeEach
	void setUp() throws Exception {
		reyDeCorazones   = mock(ICarta.class);
		reyDePicas       = mock(ICarta.class);
		reyDeTrebol      = mock(ICarta.class);
		reyDeDiamantes   = mock(ICarta.class);
		asDePicas        = mock(ICarta.class);
		asDeCorazones    = mock(ICarta.class);
		asDeDiamantes    = mock(ICarta.class);
		asDeTrebol       = mock(ICarta.class);
		tresDeCorazones  = mock(ICarta.class);
		cincoDeDiamantes = mock(ICarta.class);
		
		ps = new PokerStatus();
	
        when(reyDeCorazones.getValor()).thenReturn(13);
        when(reyDePicas.getValor()).thenReturn(13);
        when(reyDeTrebol.getValor()).thenReturn(13);
        when(reyDeDiamantes.getValor()).thenReturn(13);
        when(cincoDeCorazones.getValor()).thenReturn(5);
        when(diezDeCorazones.getValor()).thenReturn(10);
        when(asDePicas.getValor()).thenReturn(14);
        when(asDeCorazones.getValor()).thenReturn(14);
        when(asDeDiamantes.getValor()).thenReturn(14);
        when(asDeTrebol.getValor()).thenReturn(14);
        when(tresDeCorazones.getValor()).thenReturn(3);
        when(cincoDeDiamantes.getValor()).thenReturn(5);
        
        when(reyDeCorazones.getPalo()).thenReturn("corazon");
        when(reyDePicas.getPalo()).thenReturn("pica");
        when(reyDeTrebol.getPalo()).thenReturn("trebol");
        when(reyDeDiamantes.getPalo()).thenReturn("diamante");
        when(cincoDeCorazones.getPalo()).thenReturn("corazon");
        when(diezDeCorazones.getPalo()).thenReturn("corazon");
        when(asDePicas.getPalo()).thenReturn("pica");
        when(asDeCorazones.getPalo()).thenReturn("corazon");
        when(asDeDiamantes.getPalo()).thenReturn("diamante");
        when(asDeTrebol.getPalo()).thenReturn("trebol");
        when(tresDeCorazones.getPalo()).thenReturn("corazon");
        when(cincoDeDiamantes.getPalo()).thenReturn("diamante");
        
	
	}

	@Test
	void seJuegaPoquerDeReyesVsPoquerDeReyesYGanaElDeReyes(){
        List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(asDePicas); mano1.add(reyDeCorazones); mano1.add(reyDePicas); mano1.add(reyDeTrebol); mano1.add(reyDeDiamantes); 
		mano2.add(asDePicas); mano2.add(asDeCorazones); mano2.add(asDeDiamantes); mano2.add(asDeTrebol); mano2.add(cincoDeDiamantes);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano2, ganador);
	}
	
	@Test
	void seJuegaPoquerDeAsesVsColorDeDiamentesYGanaPoquer() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(asDePicas); mano1.add(reyDeCorazones); mano1.add(reyDePicas); mano1.add(reyDeTrebol); mano1.add(reyDeDiamantes); 
		mano2.add(cincoDeDiamantes); mano2.add(cincoDeDiamantes); mano2.add(cincoDeDiamantes); mano2.add(cincoDeDiamantes); mano2.add(cincoDeDiamantes);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaPoquerDeAsesVsTrioDeReyesYGanaPoquer() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
		mano1.add(asDePicas); mano2.add(asDeCorazones); mano2.add(asDeDiamantes); mano2.add(asDeTrebol); mano2.add(cincoDeDiamantes);
        mano2.add(asDePicas); mano1.add(reyDeCorazones); mano1.add(reyDePicas); mano1.add(asDeTrebol); mano1.add(reyDeDiamantes); 
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaColorDeDiamantesVsTrioYGanaColor() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); 
		mano2.add(asDePicas); mano2.add(asDeCorazones); mano2.add(asDeDiamantes); mano2.add(cincoDeDiamantes); mano2.add(cincoDeDiamantes);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaColorDeDiamantesVsColorDeCorazonesYGanaDeDiamantesPorTenerValoresMasGrandes() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); 
		mano2.add(tresDeCorazones); mano2.add(tresDeCorazones); mano2.add(tresDeCorazones); mano2.add(tresDeCorazones); mano2.add(tresDeCorazones);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaTrioDeAsesYTrioDeReyesYGanaElDeAses() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(asDePicas); mano1.add(asDeDiamantes); mano1.add(asDeTrebol); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); 
		mano2.add(reyDeCorazones); mano2.add(reyDeTrebol); mano2.add(reyDePicas); mano2.add(tresDeCorazones); mano2.add(tresDeCorazones);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaNadaVsNadaYGanaLaPrimerManoPorMayorValor() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(asDePicas); mano1.add(asDeDiamantes); mano1.add(reyDeTrebol); mano1.add(reyDeDiamantes); mano1.add(cincoDeDiamantes); 
		mano2.add(cincoDeCorazones); mano2.add(cincoDeDiamantes); mano2.add(asDePicas); mano2.add(tresDeCorazones); mano2.add(reyDePicas);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaPoquerVsNadaYGanaPoquer() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(asDePicas); mano1.add(reyDeCorazones); mano1.add(reyDePicas); mano1.add(reyDeTrebol); mano1.add(reyDeDiamantes); 
		mano2.add(cincoDeCorazones); mano2.add(cincoDeDiamantes); mano2.add(asDePicas); mano2.add(tresDeCorazones); mano2.add(reyDePicas);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaColorVsNadaYGanaPoquer() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes);  
		mano2.add(cincoDeCorazones); mano2.add(cincoDeDiamantes); mano2.add(asDePicas); mano2.add(tresDeCorazones); mano2.add(reyDePicas);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	@Test
	void seJuegaTrioVsNadaYGanaPoquer() {
		List<ICarta> mano1 = new ArrayList<ICarta>(); 
        List<ICarta> mano2 = new ArrayList<ICarta>(); 
        
        mano1.add(asDePicas); mano1.add(asDeDiamantes); mano1.add(asDeTrebol); mano1.add(cincoDeDiamantes); mano1.add(cincoDeDiamantes); 
		mano2.add(cincoDeCorazones); mano2.add(cincoDeDiamantes); mano2.add(asDePicas); mano2.add(tresDeCorazones); mano2.add(reyDePicas);
        
		String ganador = ps.manoGanadora(mano1, mano2);		
        assertEquals(mano1, ganador);
	}
	
	
}
