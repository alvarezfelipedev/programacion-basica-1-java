package ar.edu.unlam.pb1.parcial.dominio;

public class Ingrediente {
	
	private String nombre;
	private double precio;
	private Origen origen;

	// Constructor
	public Ingrediente(String nombre, double precio, Origen origen) {
		this.nombre = nombre;
		this.precio = precio;
		this.origen = origen;
	}
	
	// Metodos
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public Origen getOrigen() {
		return this.origen;
	}
	
	
}
