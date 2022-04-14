package ar.edu.unq.po2.tp3;

public class Rectangulo {
    Point puntoDeInicioSupIzquierdo;
    Point puntoInfIzquierdo;
    Point puntoInfDerecho;
    Point puntoSupDerecho;
    int altura;
    int largo;
    
	public Rectangulo(Point puntoInicio, int altura, int largo) {
		super();
		this.puntoDeInicioSupIzquierdo = puntoInicio;
		this.altura = altura;
		this.largo = largo;
		this.puntoInfIzquierdo = new Point(puntoInicio.getX(), puntoInicio.getY() - altura);
		this.puntoInfDerecho = new Point(puntoInicio.getX() + largo, puntoInicio.getY() - altura);
		this.puntoSupDerecho = new Point(puntoInicio.getX() + largo, puntoInicio.getY());
	}
	
	public int area() {
    	return this.altura * this.largo; 	
    }
	
	public int perimetro() {
		return (this.altura + this.largo) * 2;
	}
	
	public boolean esHorizontal() {
		return this.altura < this.largo;
	}
	
	public boolean esVertical() {
		return this.altura > this.largo;
	}
	
	
	Point getPuntoInfIzquierdo() {
		return puntoInfIzquierdo;
	}

	Point getPuntoInfDerecho() {
		return puntoInfDerecho;
	}

	Point getPuntoSupDerecho() {
		return puntoSupDerecho;
	}

	Point getPuntoDeInicioSupIzquierdo() {
		return puntoDeInicioSupIzquierdo;
	}
	void setPuntoDeInicioSupIzquierdo(Point punto) {
		this.puntoDeInicioSupIzquierdo = punto;
	}
	int getAltura() {
		return altura;
	}
	void setAltura(int altura) {
		this.altura = altura;
	}
	int getLargo() {
		return largo;
	}
	void setLargo(int largo) {
		this.largo = largo;
	}
    
    
}
