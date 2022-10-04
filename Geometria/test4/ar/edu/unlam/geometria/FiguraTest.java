package ar.edu.unlam.geometria;

import org.junit.Assert;
import org.junit.Test;

public class FiguraTest {

	@Test
	public void siExisteFigura() {
		Figura miFigura = cuandoCreoFigura();
		siExisteFigura(miFigura);
	}

	private void siExisteFigura(Figura miFigura) {
		Assert.assertNotEquals(miFigura, null);
		
	}

	private Figura cuandoCreoFigura() {
		Figura nueva = new Figura(0,0,new Punto(0,0));
		return nueva;
	}
}
