package ar.edu.unq.po2.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTestCase {
	Producto leche = new ProductoCooperativa(150d, 20, 10d);
	Producto arroz = new ProductoCooperativa(200d, 10, 50d);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testRegistrarYPrecioFinal() {
		assertEquals(leche.registrar(), 135d);
		assertEquals(arroz.registrar(), 100d);
		assertEquals(leche.getStock(), 19);
		assertEquals(arroz.getStock(), 9);
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(leche.precioFinal(), 135d);
		assertEquals(arroz.precioFinal(), 100d);
	}

}
