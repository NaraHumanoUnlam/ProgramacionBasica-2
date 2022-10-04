package ar.edu.unlam.geometria;

public class Rectangulo extends Figura{
	private Integer ladoMayor;
	private Integer ladoMenor;
	private Punto vertice;
	
	public Rectangulo(Integer lado1, Integer lado2,	Punto vertice) {
		super(lado1, lado2, vertice);
		this.ladoMayor = lado1;
		this.ladoMenor = lado2;
		this.vertice = vertice;
	}
	public Integer getLado1() {
		return ladoMayor;
	}
	public void setLado1(Integer lado1) {
		this.ladoMayor = lado1;
	}
	public Integer getLado2() {
		return ladoMenor;
	}
	public void setLado2(Integer lado2) {
		this.ladoMenor = lado2;
	}
	public Punto getVertice() {
		return vertice;
	}
	public void setVertice(Punto vertice) {
		this.vertice = vertice;
	}
	
	public Integer calcularArea(Integer lado1,Integer lado2) {
		Integer area;
		area = (lado1*lado2);
		
		return area;
	}
	
	
	

}
