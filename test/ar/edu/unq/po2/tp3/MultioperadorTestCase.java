package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	List<Integer> numeros = new ArrayList<Integer>();
	Multioperador multiop = new Multioperador();
	@BeforeEach
	void setUp() throws Exception {
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
	}

	@Test
	void testSumarTodos() {
		int amount = multiop.sumarTodos(numeros);
		assertEquals(amount, 15);
	}
	
	@Test
	void testrestarTodos() {
		int amount = multiop.restarTodos(numeros);
		assertEquals(amount, (-15));
	}
	
	@Test
	void testMultiplicarTodos() {
		int amount = multiop.multiplicarTodos(numeros);
		assertEquals(amount, 120);
	}

}
