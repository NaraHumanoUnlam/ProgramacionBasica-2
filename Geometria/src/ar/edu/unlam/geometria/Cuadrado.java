package ar.edu.unlam.geometria;

public class Cuadrado extends Rectangulo{
	private Integer lado;
	private Punto posicion;
	
	
	public Cuadrado(Integer lado, Punto posicion) {
		super(lado,lado,posicion);
		this.lado = lado;
		this.posicion = posicion;
	}
	public Integer getLado1() {
		return lado;
	}
	public void setLado1(Integer lado) {
		this.lado = lado;
	}
	public Integer getLado2() {
		return lado;
	}
	public void setLado2(Integer lado) {
		this.lado = lado;
	}
	public Punto getPosicion() {
		return posicion;
	}
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	

}
