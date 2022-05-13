package ar.edu.unq.po2.tp7.poquer3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CartaTestCase {
	private ICarta reyDeCorazones = new Carta(13,"corazon");
	private ICarta cincoDeCorazones = new Carta(5, "corazon");
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void reyDeCorazonesEsMismoPaloQueCincoDeCorazones() {
		assertTrue(reyDeCorazones.mismoPalo(cincoDeCorazones));
	}
	
	@Test
	void reyDeCorazonesLeGanaACincoDeCorazones() {
		assertTrue(reyDeCorazones.leGanaA(cincoDeCorazones));
	}
	
	@Test
	void cincoDeCorazonesNoLeGanaAReyDeCorazones() {
		assertFalse(cincoDeCorazones.leGanaA(reyDeCorazones));
	}

}
