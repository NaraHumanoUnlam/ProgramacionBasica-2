package ar.edu.unlam.progra2.empresa;

public class Gerente extends Empleado {
	private String departamento; 
	public Gerente(Double sueldo) {
		super(sueldo);
		this.departamento = null;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	@Override
	public void setSueldo(Double num) {
		this.setSueldo(num*1.2);
	}
	public void setDepartamente(String d) { 
		this.departamento = d;
	}
}
