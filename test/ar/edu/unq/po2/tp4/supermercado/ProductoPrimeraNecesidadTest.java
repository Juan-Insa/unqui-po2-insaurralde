package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 11);
		arroz = new ProductoPrimeraNecesidad("arroz", 18.9d, false, 8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.12d, leche.getPrecio());
		assertEquals(17.38d, arroz.getPrecio(), 0.008d);
	}
}
