package Dominio;

public class Usuario {
	private String mail;
	private String password;
	
	public Usuario(String mail, String password) {
		this.mail=mail;
		this.password=password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [mail=" + mail + ", password=" + password + "]";
	}

	

}
