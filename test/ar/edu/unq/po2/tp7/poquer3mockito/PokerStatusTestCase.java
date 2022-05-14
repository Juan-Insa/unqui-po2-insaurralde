package ar.edu.unq.po2.tp7.poquer3mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
	private ICarta cincoDeDiamantes;
	private ICarta diezDeDiamantes ;
	private ICarta dosDeDiamantes  ;
	private ICarta seisDeDiamantes ;
	private ICarta asDePicas       ;
	
	@BeforeEach
	void setUp() throws Exception {
		reyDeCorazones   = mock(ICarta.class);
		reyDePicas       = mock(ICarta.class);
		reyDeTrebol      = mock(ICarta.class);
		reyDeDiamantes   = mock(ICarta.class);
		cincoDeDiamantes = mock(ICarta.class);
		diezDeDiamantes  = mock(ICarta.class);
		dosDeDiamantes   = mock(ICarta.class);
		seisDeDiamantes  = mock(ICarta.class);
		asDePicas        = mock(ICarta.class);
		
		ps = new PokerStatus();
	
        when(reyDeCorazones.getValor()).thenReturn(13);
        when(reyDePicas.getValor()).thenReturn(13);
        when(reyDeTrebol.getValor()).thenReturn(13);
        when(reyDeDiamantes.getValor()).thenReturn(13);
        when(cincoDeDiamantes.getValor()).thenReturn(5);
        when(diezDeDiamantes.getValor()).thenReturn(10);
        when(dosDeDiamantes.getValor()).thenReturn(2);
        when(seisDeDiamantes.getValor()).thenReturn(6);
        when(asDePicas.getValor()).thenReturn(14);
        
        when(reyDeCorazones.getPalo()).thenReturn("corazon");
        when(reyDePicas.getPalo()).thenReturn("pica");
        when(reyDeTrebol.getPalo()).thenReturn("trebol");
        when(reyDeDiamantes.getPalo()).thenReturn("diamante");
        when(cincoDeDiamantes.getPalo()).thenReturn("diamante");
        when(diezDeDiamantes.getPalo()).thenReturn("diamante");
        when(dosDeDiamantes.getPalo()).thenReturn("diamante");
        when(seisDeDiamantes.getPalo()).thenReturn("diamante");
        when(asDePicas.getPalo()).thenReturn("pica");
	
	}

	@Test
	void verificarQueLaManoEsTrioDeReyes() {
        String jugada = ps.verificar(reyDeCorazones, diezDeDiamantes, reyDePicas, reyDeDiamantes, cincoDeDiamantes);		
        assertEquals("Trio", jugada);
	}
	
	@Test
	void verificarQueLaManoEsColor() {
		String jugada = ps.verificar(cincoDeDiamantes, diezDeDiamantes, dosDeDiamantes, reyDeDiamantes, seisDeDiamantes);
		assertEquals("Color", jugada);
	}
	
	@Test
	void verificarQueLaManoEsPoquerDeReyes() {
		String jugada = ps.verificar(reyDeCorazones, diezDeDiamantes, reyDePicas, reyDeDiamantes, reyDeTrebol);
		assertEquals("Poquer", jugada);
	}
	
	@Test
	void verificarQueLaManoEsNada() {
		String jugada = ps.verificar(reyDeTrebol, diezDeDiamantes, reyDePicas, asDePicas, dosDeDiamantes);
		assertEquals("Nada", jugada);
	}
}
