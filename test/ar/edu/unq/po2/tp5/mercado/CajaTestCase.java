package ar.edu.unq.po2.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	Caja caja = new Caja();
	Producto leche = new ProductoCooperativa(150d, 20, 10d);
	Producto chocolate = new ProductoTradicional(200d, 10);
	Producto arroz = new ProductoTradicional(240d, 10);

	@BeforeEach
	void setUp() throws Exception {
		caja.registrar(chocolate);
		caja.registrar(leche);
		caja.registrar(arroz);
	}

	@Test
	void testRegistrar() {
		assertEquals(caja.getRegistrados().size(), 3);
		caja.registrar(arroz);
		caja.registrar(arroz);
		assertEquals(caja.getRegistrados().size(), 5);
	}
	
	@Test
	void testMontoTotal() {
		assertEquals(caja.montoTotal(), 575.0d);
	}
	
	

}
