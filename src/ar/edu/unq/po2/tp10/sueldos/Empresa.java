package ar.edu.unq.po2.tp10.sueldos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Trabajador> trabajadores = new ArrayList<Trabajador>();

    void pagarSueldos() {
    	for (Trabajador empleado : trabajadores) {
    		empleado.recibirSueldo(empleado.sueldo());
		}
    }
    
    void agregarEmpleado(Trabajador empleado) {
    	this.trabajadores.add(empleado);
    }
    
    void sacarEmpleado(Trabajador empleado) {
    	this.trabajadores.remove(empleado);
    }
    
    
}
