import figuras.Cuadrado;
import figuras.Figura;
import negocio.GestorFigura;

public class Principal {

	public static void main(String[] args) {
		//cliente
		Figura figura = new Cuadrado(8);
		
		//punto de entrada al servicio
		GestorFigura gestorFigura = new GestorFigura();
		float areaFigura = gestorFigura.obtenerAreaFigura(figura);
		float perimetroFigura = gestorFigura.obtenerPerimetroFigura(figura);
		
		System.out.println("area figura: " + areaFigura);
		System.out.println("perímetro figura: " + perimetroFigura);
		
	}

}
