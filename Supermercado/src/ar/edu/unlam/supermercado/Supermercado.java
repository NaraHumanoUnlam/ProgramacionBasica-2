package ar.edu.unlam.supermercado;

import java.util.LinkedList;

public class Supermercado {

	private LinkedList<Cliente> fila;
	private LinkedList<Cliente> filaRapida;
	
	public Supermercado() {
		this.fila = new LinkedList<Cliente>();
		this.filaRapida =  new LinkedList<Cliente>();
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
		for (Cliente cliente : fila) {
			if(cliente.cantidadProductoMayor5()) {
				filaRapida.add(cliente);
				fila.remove(cliente);
			}
		}
	}
	
	
	
}
