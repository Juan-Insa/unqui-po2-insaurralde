package ar.edu.unq.po2.tp5.mercado2;

public class Impuestos implements Registrable {
    private Double tasa;

	public Impuestos(Double tasa) {
		this.setTasa(tasa);
	}

	@Override
	public Double registrar() {
		return tasa;
	}
	
	void setTasa(Double tasa) {
		this.tasa = tasa;
	}
    
    
}
