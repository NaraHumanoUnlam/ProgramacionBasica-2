package ar.edu.unlam.progra2.empresa;

public class Empleado {

	protected Double sueldo;

	public Empleado(Double sueldo) {
		this.sueldo = sueldo;
	}

	protected Double getSueldo() {
		return this.sueldo;
	}

	protected void setSueldo(Double sueldoInicial) {
		if(sueldoInicial>=0) {
			this.sueldo = sueldoInicial;
		}
		
		
		
	}
	
}
