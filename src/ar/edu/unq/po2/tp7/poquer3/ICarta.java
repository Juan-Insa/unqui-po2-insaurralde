package ar.edu.unq.po2.tp7.poquer3;

public interface ICarta {
	public int getValor();
	public String getPalo();
	public boolean leGanaA(ICarta carta);
	public boolean mismoPalo(ICarta carta);
	
}
