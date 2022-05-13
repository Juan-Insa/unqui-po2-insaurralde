package ar.edu.unq.po2.tp7.poquer3;

public class Carta implements ICarta{
	private int valor;
	private String palo;
	
	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}
	
	@Override
	public boolean leGanaA(ICarta carta) {
		return this.valor > carta.getValor();
	}

	@Override
	public boolean mismoPalo(ICarta carta) {
		return this.palo == carta.getPalo();
	}
	
	@Override
	public int getValor() {
		return valor;
	}
	
	@Override
	public String getPalo() {
		return palo;
	}

	
	

	

}
