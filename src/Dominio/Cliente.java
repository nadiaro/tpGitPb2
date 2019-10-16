package Dominio;

public class Cliente extends Persona {

	private String idCliente;
	private Puntos puntos;
	
	public Cliente(String mail, String password, String nombre, String apellido, 
					String idCliente, Puntos puntos) {
		
		super(mail, password, nombre, apellido);
		this.idCliente=idCliente;
		this.puntos=puntos;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public Puntos getPuntos() {
		return puntos;
	}

	public void setPuntos(Puntos puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", puntos=" + puntos + "]";
	}
	
	
}
