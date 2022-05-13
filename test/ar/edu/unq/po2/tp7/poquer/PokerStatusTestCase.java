package ar.edu.unq.po2.tp7.poquer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase { 
	private PokerStatus ps = new PokerStatus();                        // setup
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@Test
	void valorDe10DiamantesEs10() {
        String valor = ps.valorCarta("10D");
		assertEquals(valor,"10");                                      // verify
	}
	
	@Test
	void valorDeReyDiamantesEsK() {
        String valor = ps.valorCarta("KD");
		assertEquals(valor,"K");                                      // verify
	}
	

	@Test
	void verificarQueEsPoquerDeReyes() {
		boolean esPoker = ps.verificar("KD", "KP", "10D", "KC", "KT"); // exercise
		assertTrue(esPoker);                                           // verify
	}
	
	@Test
	void verificarQueNOEsPoquerDeReyes() {
		boolean esPoker = ps.verificar("KD", "KP", "10D", "7C", "KT");  // exercise
		assertFalse(esPoker);                                           // verify  
	}
	
	@Test
	void verificarQueEsPoquerDeNumeros() {
		boolean esPoker = ps.verificar("5D", "5P", "10D", "5C", "5T");  // exercise
		assertTrue(esPoker);                                            // verify  
	}
	
	@Test
	void verificarQueNOEsPoquerDeNumeros() {
		boolean esPoker = ps.verificar("5D", "9P", "10D", "3C", "5T");  // exercise
		assertFalse(esPoker);                                            // verify  
	}

}
