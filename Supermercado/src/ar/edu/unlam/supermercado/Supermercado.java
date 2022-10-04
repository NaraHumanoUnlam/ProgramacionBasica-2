package ar.edu.unlam.supermercado;

import java.util.LinkedList;

public class Supermercado {

	private LinkedList<Cliente> fila = new LinkedList<Cliente>();
	private LinkedList<Cliente> filaRapida = new LinkedList<Cliente>();
	
	public Supermercado() {
	 
	}
	
	public LinkedList<Cliente> getFila() {
		return fila;
	}
	public void setFila(LinkedList<Cliente> fila) {
		this.fila = fila;
	}
	public LinkedList<Cliente> getFilaRapida() {
		return filaRapida;
	}
	public void setFilaRapida(LinkedList<Cliente> filaRapida) {
		this.filaRapida = filaRapida;
	}
	
	public void agregarFilaRapida() {
		int tamañoFila = fila.size();
		for (int i = tamañoFila; i > 0; i--) {
				if(fila.get(i-1).getCantidadProducto()<=5) {
				filaRapida.add(fila.get(i-1));				
				fila.remove(fila.get(i-1));
			}
		}
	}
	
	public void agregarClienteFilaComun(Integer cantidadProductos) {
		this.fila.add(new Cliente(cantidadProductos,fila.size()+1));
	}


	public Integer obtenerNumeroClientesFilaComun() {
		
		return fila.size();
	}
	
	
	
}
