package ar.edu.unlam.pb2.cuentasbancarias;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Cuenta {

	protected Double saldo = 0.0;
	protected List<Transaccion> transacciones = new LinkedList<Transaccion>();

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {

		return this.saldo;
	}

	public void depositar(Double monto) {
		if (monto >= 0) {
			this.saldo = this.saldo + monto;
			this.transacciones.add(new Transaccion(TipoTransaccion.DEPOSITO, monto, new Date()));
		}
	}

	public void extraer(Double monto) {
		if (this.saldo >= monto && monto > 0) {
			this.saldo = this.saldo - monto;
			this.transacciones.add(new Transaccion(TipoTransaccion.EXTRACCION, monto, new Date()));
		}

	}

	public void tranferir(Cuenta cuentaDestino, Double monto) {
		if (monto >= 0 && monto <= this.saldo) {
			this.saldo = this.saldo - monto;
			cuentaDestino.depositar(monto);
			this.transacciones.add(new Transaccion(TipoTransaccion.TRANSFERENCIA, monto, new Date()));
		}
	}

	public List<Transaccion> getTransacciones() {
		return this.transacciones;
	}

	public List<Transaccion> getDepositos() {
		List<Transaccion> depositos = new LinkedList<Transaccion>();
		for (Transaccion transaccion : this.transacciones) {
			if (transaccion.getMotivo().equals(TipoTransaccion.DEPOSITO)) {
				depositos.add(transaccion);
			}
		}

		return depositos;
	}

}
