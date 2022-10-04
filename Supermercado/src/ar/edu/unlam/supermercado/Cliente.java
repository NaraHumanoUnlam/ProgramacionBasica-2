package ar.edu.unlam.supermercado;

public class Cliente {
	private Integer cantidadProducto;
	private Integer ubicacion;
	
	public Cliente(Integer cantidadProducto, Integer ubicacion) {
		this.cantidadProducto = cantidadProducto;
		this.ubicacion = ubicacion;
	}

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Integer getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Integer ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Boolean cantidadProductoMayor5() {
		Boolean tieneMasProducto = false;
		if(this.cantidadProducto>5) {
			 tieneMasProducto = true;
		}
		
		return tieneMasProducto;
	}
	
	public String toString() {
		return "Cantidad de productos: "+cantidadProducto + " ubicacion: " + ubicacion;
	}
	
}
