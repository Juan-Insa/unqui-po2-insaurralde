package ar.edu.unq.po2.tp5.personas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaYMascotaTestCase {
	
	Persona david = new Persona("david bowie", LocalDate.of(1947, 1, 8));
	Persona bruce = new Persona("bruce dickinson", LocalDate.of(1958, 8, 7));
	Mascota m1 = new Mascota("paola", "calle");
	Mascota m2 = new Mascota("kumi", "rottweiler");
	
	static List<Nombrables> lista = new ArrayList<Nombrables>();


	@BeforeEach
	void setUp() throws Exception {
		lista.add(bruce);
		lista.add(david);
		lista.add(m1);
		lista.add(m2);
	}
	
	@Test
	    void testEdad() {
		    assertEquals(david.edad(), 75);
	}

}
