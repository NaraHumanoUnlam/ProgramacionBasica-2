package ar.edu.unlam.progra2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void queElEmpleadoTengaSueldoInicial() {
		Empleado actual = seCreaEmpleado();
		Double sueldoActual = cuandoConsultoSueldo(actual, 2000.0);
		entoncesSueldoEs(actual,sueldoActual);
	}
	
	@Test
	public void queElEmpleadoTengaSueldoEnCero() {
		dadoQueExisteEmpleado();
	}
	
	/*@Test
	public void */
	
	@Test
	public void empleadoNoPuedeTenerSueldoNegativo() {
		Empleado emp = seCreaEmpleado();
		cuandoConsultoSueldo(emp, -200.0);
		entoncesSueldoEs(emp,0.0);
	}
	
	private Empleado seCreaEmpleado() {
		Empleado nuevoEmpleado = new Empleado(0.0);
		return nuevoEmpleado;
	}
	
	private void entoncesSueldoEs(Empleado emp, Double num) {
		Double ve = num;
		Double vo = emp.getSueldo();
		assertEquals(ve, vo);
	}

	private Double cuandoConsultoSueldo(Empleado emp, Double sueldoInicial) {
		emp.setSueldo(sueldoInicial);
		Double vo = emp.getSueldo();
		return vo;
		
	}

	private void dadoQueExisteEmpleado() {
		Empleado nuevoEmpleado = new Empleado(0.0);
		Double ve = 0.0;
		Double vo = nuevoEmpleado.getSueldo();
		assertEquals(ve, vo);
	}
	
	

}
