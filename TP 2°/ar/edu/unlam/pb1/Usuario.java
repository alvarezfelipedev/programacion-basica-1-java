package ar.edu.unlam.pb1;

public class Usuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int DNI;
	private int edad;
	
	// Constructor
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, int DNI, int edad) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.edad = edad;
	}
	
	
	// Metodos
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario)	{
		this.usuario = usuario;
	 }
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
		
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
