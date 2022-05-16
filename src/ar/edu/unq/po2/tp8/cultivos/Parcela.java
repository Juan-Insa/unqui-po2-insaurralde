package ar.edu.unq.po2.tp8.cultivos;

public abstract class Parcela {
    abstract double getGananciaAnual();
    abstract void setGananciaAnual(double ganancia);
    abstract void addParcela(Parcela parcela);
    abstract void removeParcela(Parcela parcela);
    abstract Parcela getParcela(int nro);
}
