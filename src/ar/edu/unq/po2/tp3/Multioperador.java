package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
    
    public Integer sumarTodos(List<Integer> nros) {
		int resultado = 0; 
    	for (Integer nro : nros) {
			resultado += nro;
		}
    	return resultado;
	}
    
    public Integer restarTodos(List<Integer> nros) {
		int resultado = 0; 
    	for (Integer nro : nros) {
			resultado -= nro;
		}
    	return resultado;
	}
    
    public Integer multiplicarTodos(List<Integer> nros) {
		int resultado = 1; 
    	for (Integer nro : nros) {
			resultado *= nro;
		}
    	return resultado;
	}
}
