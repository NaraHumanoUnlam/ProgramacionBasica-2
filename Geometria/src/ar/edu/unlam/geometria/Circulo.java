package ar.edu.unlam.geometria;

public class Circulo extends Elipsis {

	private Integer radio;
	private Punto centroCircular;
	
	public Circulo(Integer radio, Punto centroCircular) {
		super(radio, radio, centroCircular);
		this.radio = radio;
		this.centroCircular = centroCircular;
	}

	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

	public Punto getCentro() {
		return centroCircular;
	}

	public void setCentro(Punto centro) {
		this.centroCircular = centro;
	}
	
	
	
}
