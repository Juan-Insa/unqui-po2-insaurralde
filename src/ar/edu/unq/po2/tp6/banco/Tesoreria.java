package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;

public class Tesoreria {
    private List<Solicitables> solicitudes = new ArrayList<Solicitables>();
    
    void addSolicitud(Solicitables solicitud) {
    	solicitudes.add(solicitud);
    }
    
    void dropSolicitud(Solicitables solicitud) {
    	solicitudes.remove(solicitud);
    }
}
