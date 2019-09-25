package figuras;

public abstract class Figura {
	
	/*
	 las clases abstractas pueden tener constructores, pero SOLAMENTE para ser usados desde los constructores de las clases hijas 
	 */
	
	private float perimetro;
	private float area;
	
	public float getPerimetro() {
		return perimetro;
	}
	
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
	public float getArea() {
		return area;
	}
	
	public void setArea(float area) {
		this.area = area;
	}
	
	public abstract void calcularPerimetro();
	
	public abstract void calcularArea();
	

}
