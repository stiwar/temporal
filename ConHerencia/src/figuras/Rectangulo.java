package figuras;

public class Rectangulo extends Figura {

	private float base;
	private float altura;
	
	//private static final float TOTAL_BASES_RECTANGULO = 2;
	//private static final float TOTAL_ALTURAS_RECTANGULO = 2;

	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void calcularPerimetro() {
		super.setPerimetro(2*base + 2*altura);
	}

	@Override
	public void calcularArea() {
		super.setArea(base*altura);
	}

}
