package Dominio;

public class Compra {
	private Cliente cliente;
	private Producto producto;
	
	public Compra(Cliente cliente, Producto producto) {
		this.cliente=cliente;
		this.producto=producto;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Compra [cliente=" + cliente + ", producto=" + producto + "]";
	}
	
	
	
}
