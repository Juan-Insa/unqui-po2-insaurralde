package ar.edu.unq.po2.tp5.mercado2;

public class Servicio implements Registrable{
    private Double costoUnitario;
    private Integer cantUnidades;
	
    
    
    public Servicio(Double costoUnitario, Integer cantUnidades) {
		super();
		this.setCantUnidades(cantUnidades);
		this.setCostoUnitario(costoUnitario);
	}

	@Override
	public Double registrar() {
		return costoUnitario * cantUnidades;
	}

	void setCostoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	void setCantUnidades(Integer cantUnidades) {
		this.cantUnidades = cantUnidades;
	}
    
    
}
