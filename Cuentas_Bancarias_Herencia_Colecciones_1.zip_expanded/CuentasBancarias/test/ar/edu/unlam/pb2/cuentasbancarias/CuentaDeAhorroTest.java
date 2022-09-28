package ar.edu.unlam.pb2.cuentasbancarias;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CuentaDeAhorroTest {
	@Test
	public void quePermiteReservarSaldo() {
		CuentaDeAhorro cuenta = dadoQueExisteCuenta();
		dadoQueDeposito(cuenta, 100.00);
		cuandoReservoSaldo(cuenta, 50.00);
		entoncesSuSaldoEs(cuenta, 50.00);
	}

	private void dadoQueDeposito(CuentaDeAhorro cuenta, Double monto) {
		cuenta.depositar(monto);
	}

	private void entoncesSuSaldoEs(CuentaDeAhorro cuenta, Double monto) {
		Assert.assertEquals(cuenta.getSaldo(), monto);
	}

	private CuentaDeAhorro dadoQueExisteCuenta() {
		return new CuentaDeAhorro(0.0);
	}

	private void cuandoReservoSaldo(CuentaDeAhorro cuenta, Double monto) {
		cuenta.reservar(monto);
	}
}
