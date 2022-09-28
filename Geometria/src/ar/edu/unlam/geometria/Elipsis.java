package ar.edu.unlam.geometria;

public class Elipsis extends Figura {
	private Integer radio1;
	private Integer radio2;
	private Punto centro;
	
	
	
	
	public Elipsis( Integer radio1,	Integer radio2, Punto centro) {
		super(radio1,radio2,centro);
		this.radio1 = radio1;
		this.radio2 = radio2;
		this.centro = centro;
	}




	public Integer getRadio1() {
		return radio1;
	}




	public void setRadio1(Integer radio1) {
		this.radio1 = radio1;
	}




	public Integer getRadio2() {
		return radio2;
	}




	public void setRadio2(Integer radio2) {
		this.radio2 = radio2;
	}




	public Punto getCentro() {
		return centro;
	}




	public void setCentro(Punto centro) {
		this.centro = centro;
	}




	
	

}
