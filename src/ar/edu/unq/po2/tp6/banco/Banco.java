package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<IClientes> clientes = new ArrayList<IClientes>() ;
    
    void addCliente(IClientes cliente) {
    	this.clientes.add(cliente);
    }
    
    void dropCliente(IClientes cliente) {
    	this.clientes.remove(cliente);
    }
}
