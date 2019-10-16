package Dominio;

public class Admin extends Persona {
	private String legajo;
	
	public Admin(String mail, String password, String nombre, String apellido, String legajo) {
		super(mail, password, nombre, apellido);
		this.legajo=legajo;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "Admin [legajo=" + legajo + "]";
	}

	
}
