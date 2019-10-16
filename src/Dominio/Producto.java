package Dominio;

public class Producto {
	private String nombre;
	private Integer codigo;
	private Puntos valorEnPuntos;
	private Double precio;
	
	public Producto(String nombre, Integer codigo, Puntos valorEnPuntos, Double precio) {
		this.nombre=nombre;
		this.codigo=codigo;
		this.valorEnPuntos=valorEnPuntos;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Puntos getValorEnPuntos() {
		return valorEnPuntos;
	}

	public void setValorEnPuntos(Puntos valorEnPuntos) {
		this.valorEnPuntos = valorEnPuntos;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	

}
