package ar.edu.unq.po2.tp7.poquer3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	private PokerStatus ps = new PokerStatus();
	private ICarta reyDeCorazones = new Carta(13,"corazon");
	private ICarta reyDePicas = new Carta(13, "picas");
	private ICarta reyDeTrebol = new Carta(13, "trebol");
	private ICarta reyDeDiamantes = new Carta(13, "diamante");
	private ICarta cincoDeDiamantes = new Carta(5, "diamante");
	private ICarta diezDeDiamantes = new Carta(10, "diamante");
	private ICarta dosDeDiamantes = new Carta(2, "diamante");
	private ICarta seisDeDiamantes = new Carta(6, "diamante");
	private ICarta asDePicas = new Carta(14, "picas");
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
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
