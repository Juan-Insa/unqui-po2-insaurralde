package ar.edu.unq.po2.tp8.cultivos;

public class Soja extends Parcela{
    private double gananciaAnual = 500d;
	
	@Override
	double getGananciaAnual() {
		return this.gananciaAnual;
	}

	@Override
	void setGananciaAnual(double ganancia) {
		this.gananciaAnual = ganancia;
	}

	@Override
	void addParcela(Parcela parcela) {}

	@Override
	void removeParcela(Parcela parcela) {}

	@Override
	Parcela getParcela(int nro) {return null;}

}
