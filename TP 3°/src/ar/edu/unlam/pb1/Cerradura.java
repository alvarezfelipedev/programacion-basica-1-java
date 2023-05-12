package ar.edu.unlam.pb1;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallos;
	private boolean estaAbierta;
	private final int CANTIDAD_MAXIMA_INTENTOS = 3;
	
	// Constructores
	public Cerradura(int claveDeApertura, int cantidadDeFallos) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallos = cantidadDeFallos;
	}
	
	// Metodos
	public boolean abrir(int clave) {
		if(claveDeApertura == clave) {
			this.estaAbierta = true;
			return estaAbierta;
		} 
		return estaAbierta;
	}
	
	public void cerrar() {
		this.estaAbierta = false;
	}
	
	public boolean estaAbierta() {
		return this.estaAbierta;
	}
	
	public boolean fueBloqueada() {
		boolean fueBloqueada = false;
		if (cantidadDeFallos > CANTIDAD_MAXIMA_INTENTOS) {
			fueBloqueada = true;
			return fueBloqueada;
		}
		return fueBloqueada;
	}
}
