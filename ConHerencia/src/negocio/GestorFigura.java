package negocio;

import figuras.Figura;

public class GestorFigura {

	public float obtenerAreaFigura(Figura figura) {
		figura.calcularArea();
		return figura.getArea();
	}

	public float obtenerPerimetroFigura(Figura figura) {
		figura.calcularPerimetro();
		return figura.getPerimetro();
	}

}
