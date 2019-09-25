package figuras;

public class Cuadrado {

	private float lado;
	private float perimetro;
	private float area;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void calcularPerimetro() {
		this.perimetro = 4*lado;
	}

	public float getArea() {
		return area;
	}

	public void calcularArea() {
		area = (float) Math.pow(lado, 2);
	}

}
