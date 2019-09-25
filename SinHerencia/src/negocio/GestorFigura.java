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
	

	//Principio de responsabilidad única (Single responsibility principle)
	//violación principio solid, método demasiado largo,
	
	
	//qué pasa si queremos agregar una tercer figura?, 
	//tendríamos que modificar este código (cambios en más de una capa si estamos hablando de una aplicación multinivel) 
	// sino nuestra aplicación dejaría de funcionar
	//estaríamos violando la O del principio SOLID:
	//Principio abierto-cerrado
	/*
	 * “Entidades de Software (classes, módulos, funciones, etc.) han de estar abiertas para extensiones, 
	 * pero cerradas para modificaciones”
       Aquí la idea es que una entidad permita que el comportamiento se extienda 
       pero nunca modificando el código de fuente. 
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
