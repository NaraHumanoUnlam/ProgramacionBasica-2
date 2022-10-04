package ar.edu.unlam.supermercado;


import org.junit.*;

public class SupermercadoTest {

	@Test 
	public void siSeCreaSupermercado() {
		Supermercado nuevo = seCreaSupermercado();
		Assert.assertNotNull(nuevo);
	}
	
	@Test
	public void siSeCreaFilaComun() {
		Supermercado nuevo = seCreaSupermercado();
		seAgregaClientesAFilaComun(nuevo);
		Integer vo = nuevo.obtenerNumeroClientesFilaComun();
		Integer ve = 4;
		Assert.assertEquals(vo, ve);
	}
	
	@Test
	public void siSeTieneCajaRapida() {
		Supermercado nuevo = seCreaSupermercado();
		seAgregaClientesAFilaComun(nuevo);
		Boolean seAsignoClientes = siSePasaClienteAFilaRapida(nuevo);
		Assert.assertTrue(seAsignoClientes);
	}

	private void seAgregaClientesAFilaComun(Supermercado nuevo) {
		nuevo.agregarClienteFilaComun(4);
		nuevo.agregarClienteFilaComun(6);
		nuevo.agregarClienteFilaComun(5);
		nuevo.agregarClienteFilaComun(3);
	}

	private Boolean siSePasaClienteAFilaRapida(Supermercado nuevo) {

		
		Boolean seAgrego = false;
		nuevo.agregarFilaRapida();

		if(nuevo.getFilaRapida()!=null) {
			seAgrego = true;
		}
		

		System.out.println(nuevo.getFilaRapida().toString());
		return seAgrego;
	}


	private Supermercado seCreaSupermercado() {
		Supermercado nuevo = new Supermercado();
		return nuevo;
	}
	
	

}
