package negocio;

import figuras.Cuadrado;
import figuras.Rectangulo;

public class GestorFigura {
	
	public float obtenerAreaCuadrado(Cuadrado cuadrado) {
		cuadrado.calcularArea();
		return cuadrado.getArea();
	}
	
	public float obtenerAreaRectangulo(Rectangulo rectangulo) {
		rectangulo.calcularArea();
		return rectangulo.getArea();
	}
	
	public float obtenerPerimetroCuadrado(Cuadrado cuadrado) {
		cuadrado.calcularPerimetro();
		return cuadrado.getPerimetro();
	}
	

	//Principio de responsabilidad �nica (Single responsibility principle)
	//violaci�n principio solid, m�todo demasiado largo,
	
	
	//qu� pasa si queremos agregar una tercer figura?, 
	//tendr�amos que modificar este c�digo (cambios en m�s de una capa si estamos hablando de una aplicaci�n multinivel) 
	// sino nuestra aplicaci�n dejar�a de funcionar
	//estar�amos violando la O del principio SOLID:
	//Principio abierto-cerrado
	/*
	 * �Entidades de Software (classes, m�dulos, funciones, etc.) han de estar abiertas para extensiones, 
	 * pero cerradas para modificaciones�
       Aqu� la idea es que una entidad permita que el comportamiento se extienda 
       pero nunca modificando el c�digo de fuente. 
       Cualquier clase (o cualquier cosa que escribas) 
       debe de estar escrito de un manera que puede utilizarse por lo que es. 
       Puede ser extensible, si se necesita, pero nunca modificado.
	 * */
	public float obtenerAreaFigura(Object figura) {

		if (figura instanceof Cuadrado) {
			Cuadrado cuadrado = (Cuadrado) figura;
			cuadrado.calcularArea();
			return cuadrado.getArea();
		}

		if (figura instanceof Rectangulo) {
			Rectangulo rectangulo = (Rectangulo) figura;
			rectangulo.calcularArea();
			return rectangulo.getArea();
		}
		
		return 0;

	}

}
