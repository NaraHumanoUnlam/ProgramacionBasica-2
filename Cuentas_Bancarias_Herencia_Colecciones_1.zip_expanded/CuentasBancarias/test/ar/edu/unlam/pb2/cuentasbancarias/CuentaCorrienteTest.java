package ar.edu.unlam.pb2.cuentasbancarias;

import org.junit.Test;

public class CuentaCorrienteTest {
	@Test
	public void quePermitaEstablecerCantidadDeDineroAGirarEnDescubierto() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente(0.0);
		extraerDinero(miCuentaCorriente,100.0);
		
	}

	private void extraerDinero(CuentaCorriente miCuentaCorriente, Double num) {
		miCuentaCorriente.extraer(num);
		
	}
}
