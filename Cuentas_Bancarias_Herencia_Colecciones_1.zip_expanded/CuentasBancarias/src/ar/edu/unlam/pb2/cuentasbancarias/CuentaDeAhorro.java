package ar.edu.unlam.pb2.cuentasbancarias;

public class CuentaDeAhorro extends Cuenta {
	private final Double ADICIONAL = 6.0;
	private Double reserva = 0.0;

	public CuentaDeAhorro(Double reserva) {
		/*
		 * Se invoca explicitamente el contructor del padre porque no tiene un
		 * contructor vac�o.
		 */
		super(0.0);
		this.reserva = reserva;
	}

	public void reservar(Double monto) {
		this.reserva = monto;
		this.saldo = this.saldo - monto;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	/*
	 * Cuando deseo invocar el comportamiento del m�todo sobreescrito.
	 */
	@Override
	public void extraer(Double monto) {
		Integer cont = 0;
		Transaccion tipo = null;
		for (Transaccion transaccion : transacciones) {
			if(transaccion.getMotivo().equals(tipo.getMotivo().EXTRACCION)){
				cont+=1;
			}
		}
		
		if(cont>=5) {
			this.saldo = saldo-monto-ADICIONAL;
		}
	}
	@Override
	public void depositar(Double monto) {
		this.saldo = this.saldo + monto;

	}

}
