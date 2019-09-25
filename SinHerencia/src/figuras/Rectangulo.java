package figuras;

public class Rectangulo {

	private float base;
	private float altura;
	private float perimetro;
	private float area;

	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void calcularPerimetro() {
		perimetro = 2 * base + 2 * altura;
	}

	public float getArea() {
		return area;
	}

	public void calcularArea() {
		area = base * altura;
	}

}
