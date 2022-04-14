package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	Point puntoInicio = new Point(2,8);
    Rectangulo rectangulo = new Rectangulo(puntoInicio, 4, 6);
    
    
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testConsistenciaRectangulo() {
		// puntoSupIzquierdo = (2,8)
		// puntoInfIzquierdo = (2,4)
		// puntoSupDerecho   = (8,8)
		// puntoInfDerecho   = (8,4)
		assertEquals(rectangulo.getPuntoInfIzquierdo().getY(),4);
		assertEquals(rectangulo.getPuntoInfDerecho().getX(), 8);
		assertEquals(rectangulo.getPuntoInfDerecho().getY(),4 );
		assertEquals(rectangulo.getPuntoSupDerecho().getY(),8 );
		assertEquals(rectangulo.getPuntoSupDerecho().getX(),8);
	}
	
	@Test
	void testArea() {
		assertEquals(rectangulo.area(),24);
	}
	
	@Test
	void testPerimetro() {
		assertEquals(rectangulo.perimetro(),20);
	}
	
	@Test
	void testEsHorizontal() {
		assertEquals(rectangulo.esHorizontal(),true);
	}
	
	@Test
	void testEsVertical() {
		assertEquals(rectangulo.esVertical(),false);
	}

}
