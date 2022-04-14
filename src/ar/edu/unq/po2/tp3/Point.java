package ar.edu.unq.po2.tp3;

public class Point {
    private Integer x;
    private Integer y;
    
    public Point(Integer x, Integer y) {
    	this.setXY(x,y);
    }
    
    public Point() {
    	this.setXY(0, 0);
    }

	Integer getX() {
		return x;
	}

	Integer getY() {
		return y;
	}

	private void setXY(int x2, int y2) {
		this.x = x2;
		this.y = y2;
	}
	
    void moverXY(Integer x, Integer y) {
		this.setXY(x, y);
	}
    
    Point sumarPunto(Point punto) {
    	int nuevoX = this.getX() + punto.getX();
    	int nuevoY = this.getY() + punto.getY();
    	Point nuevoPunto = new Point(nuevoX, nuevoY);
    	return nuevoPunto; 
    }
}
