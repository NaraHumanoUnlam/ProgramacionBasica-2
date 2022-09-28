package ar.edu.unlam.geometria;

import org.junit.*;

public class PuntoTest {
	
	@Test
	public void siExistePunto() {
		verificarPunto(2,3);
	}
	
	private void verificarPunto(Integer x, Integer y) {
		Punto nuevo = seCreaPunto(x, y);
		Integer ve1 = x;
		Integer ve2 = y;
		Integer vo1= nuevo.getX();
		Integer vo2 = nuevo.getY();
		Assert.assertEquals(ve1, vo1);
		Assert.assertEquals(ve2,vo2);
		
	}

	private Punto seCreaPunto(Integer x, Integer y) {
		Punto miPunto = new Punto(x,y);
		return miPunto;
	}

}
