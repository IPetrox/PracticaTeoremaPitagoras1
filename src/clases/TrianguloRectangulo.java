package clases;

public class TrianguloRectangulo {
	
	private double a;
	private double b;
	private double c;
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c = this.hipotenusa();
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 */
	public TrianguloRectangulo(double a, double b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Los valores introducidos no son validos");
		} else {
			this.a = a;
			this.b = b;
			this.c = this.hipotenusa();
		}
	}
	
	/**
	 * 
	 * @return el area del triangulo
	 */
	public double area() {
		return ( (this.a * this.b) / 2);
	}
	
	/**
	 * 
	 * @return la hipotenusa del triangulo
	 */
	public double hipotenusa() {
		return Math.sqrt((Math.pow(this.a, 2)) + (Math.pow(this.b, 2)));
	}
	
	public double perimetro() {
		return this.a + this.b + this.c;
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public void setA(double newA) {
		this.a = newA;
	}
	
	public void setB(double newB) {
		this.b = newB;
	}
	
	public void setC(double newC) {
		this.c = newC;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	

}
