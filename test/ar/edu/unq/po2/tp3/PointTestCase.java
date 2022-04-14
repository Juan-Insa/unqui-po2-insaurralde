package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
    Point punto1 = new Point();
    Point punto2 = new Point(2,5);
    Point punto3 = new Point(4,1);
    
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSumarPuntos() {
		Point punto = punto2.sumarPunto(punto3);
		assertEquals(punto.getX(), 6);
		assertEquals(punto.getY(), 6);
	}

}
