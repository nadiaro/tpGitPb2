package Dominio;

public abstract class Puntos {
	private Integer valorPuntos;
	
	public Puntos(Integer valorPuntos){
		this.valorPuntos=valorPuntos;
	}

	public Integer getValorPuntos() {
		return valorPuntos;
	}

	public void setValorPuntos(Integer valorPuntos) {
		this.valorPuntos = valorPuntos;
	}

	
}
