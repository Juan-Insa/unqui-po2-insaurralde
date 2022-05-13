package ar.edu.unq.po2.tp7.poquer2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	private PokerStatus ps = new PokerStatus();    // setup    
	List<String> mano = new ArrayList<String>();
	
	@BeforeEach
	void setUp() throws Exception {
	
	}
	
	@Test 
	void esPoquer(){
		mano.add("10D");
	    mano.add("10C");
	    mano.add("7T");
	    mano.add("10T");
	    mano.add("10P");
	    
        assertTrue(ps.esPoquer(mano));
	}

	@Test
	void verificarQueLaManoEsTrioDe10() {
        String jugada = ps.verificar("10D", "5C", "8P", "10C", "10T");		
        assertEquals("Trio", jugada);
	}
	
	@Test
	void verificarQueLaManoEsColor() {
		String jugada = ps.verificar("10D", "5D", "8D", "10D", "10D");
		assertEquals("Color", jugada);
	}
	
	@Test
	void verificarQueLaManoEsPoquerDeQ() {
		String jugada = ps.verificar("QD", "QC", "QP", "10C", "QT");
		assertEquals("Poquer", jugada);
	}
	
	@Test
	void verificarQueLaManoEsNada() {
		String jugada = ps.verificar("3D", "10C", "8T", "QC", "KT");
		assertEquals("Nada", jugada);
	}

}
