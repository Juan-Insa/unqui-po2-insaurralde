package ar.edu.unq.po2.tp5.personas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

public class Imprimir {
	static Persona david = new Persona("david bowie", LocalDate.of(1947, 1, 8));
	static Persona bruce = new Persona("bruce dickinson", LocalDate.of(1958, 8, 7));
	static Mascota m1 = new Mascota("paola", "calle");
	static Mascota m2 = new Mascota("kumi", "rottweiler");
	
	static List<Nombrables> lista = new ArrayList<Nombrables>();

	@BeforeEach
	void setUp(){
		lista.add(bruce);
		lista.add(david);
		lista.add(m1);
		lista.add(m2);
	}
    
	public static void main(String[] args) {
		lista.add(bruce);
		lista.add(david);
		lista.add(m1);
		lista.add(m2);
		for(Nombrables x : lista) {
			System.out.println(x.getNombre());
		}
	}

}


