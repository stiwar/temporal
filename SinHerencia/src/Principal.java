import figuras.Cuadrado;
import negocio.GestorFigura;

public class Principal {

	public static void main(String[] args) {
		
		GestorFigura gestorFigura = new GestorFigura();
		float areaFigura = gestorFigura.obtenerAreaFigura(new Cuadrado(5));
		System.out.println("el area de la figura es: " + areaFigura);
		
		System.out.println("ahora el área es: " + gestorFigura.obtenerAreaCuadrado(new Cuadrado(3)));
		
		float perimetroCuadrado = gestorFigura.obtenerPerimetroCuadrado(new Cuadrado(4));
		System.out.println("perimetro cuadrado: " + perimetroCuadrado);
	}

}
