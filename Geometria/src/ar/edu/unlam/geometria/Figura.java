package ar.edu.unlam.geometria;



public class Figura extends Punto{
	private Integer ladoMayor;
	private Integer ladoMenor;
	private Punto posicion;

	
	
	public Figura( Integer ladoMayor, Integer ladoMenor, Punto posicion) {
		super(posicion.getX(), posicion.getY());
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}

	

	public Integer getLadoMayor() {
		return ladoMayor;
	}



	public void setLadoMayor(Integer ladoMayor) {
		this.ladoMayor = ladoMayor;
	}



	public Integer getLadoMenor() {
		return ladoMenor;
	}



	public void setLadoMenor(Integer ladoMenor) {
		this.ladoMenor = ladoMenor;
	}



	public Punto getPosicion() {
		return posicion;
	}



	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	

}
