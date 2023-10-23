package Objetos;

import java.text.SimpleDateFormat;

public class Cliente {
		
	private String dni;
	private String usuario;
	private String contraseña;
	private SimpleDateFormat fechaNacimiento = new SimpleDateFormat("dd-MM-yyyy");
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public SimpleDateFormat getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(SimpleDateFormat fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @param dni
	 * @param usuario
	 * @param contraseña
	 * @param fechaNacimiento
	 */
	public Cliente(String dni, String usuario, String contraseña, SimpleDateFormat fechaNacimiento) {
		super();
		this.dni = dni;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", usuario=" + usuario + ", contraseña=" + contraseña + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
	
	
	
		

}
