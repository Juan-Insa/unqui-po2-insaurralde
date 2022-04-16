package ar.edu.unq.po2.tp4.impuesto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
    Trabajador trabajador;
    Ingreso ing1;
    Ingreso ing2;
    IngresoHorasExtra ing3;
    
	@BeforeEach
	void setUp() throws Exception {
		ing1 = new Ingreso("enero", "lala", 65000d);
		ing2 = new Ingreso("febrero", "lala", 70000d);
		ing3 = new IngresoHorasExtra("enero", "lala", 10000d, 12);
		
		trabajador = new Trabajador();
		
		trabajador.agregarIngreso(ing1);
		trabajador.agregarIngreso(ing2);
		trabajador.agregarIngreso(ing3);
	}
	
	@Test
	void testCantIngresos() {
		assertEquals(trabajador.getIngresos().size(), 3);
	}

	@Test
	void testTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 142300);
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(trabajador.getMontoImponible(), 145000);
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(trabajador.getImpuestoAPagar(), 2700);
	}

}
