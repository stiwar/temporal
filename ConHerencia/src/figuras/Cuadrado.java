package figuras;

public class Cuadrado extends Figura{
	
	private float lado;
	
	public Cuadrado(float lado) {
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularPerimetro() {
		super.setPerimetro(4*lado);
	}

	@Override
	public void calcularArea() {
		super.setArea((float) Math.pow(lado, 2));
	}

}
