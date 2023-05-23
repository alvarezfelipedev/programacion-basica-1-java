package ar.edu.unlam.pb1;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	// CONSTRUCTOR
	public Persona(String nombre, String genero, long dni, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		edad = 0;
		viva = true;
	}
	
	// METODOS:
	public void alimentar(double kilos) {
		peso += kilos;
	}
	
	public void crecer(double metros) {
		altura += metros;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void cumplirAnios() {
		edad ++;
	}
	
	public void morir() {
		viva = false;
	}
	
	public double pesar() {
		return peso;
	}
	
	public double medir() {
		return altura;
	}
	
}
