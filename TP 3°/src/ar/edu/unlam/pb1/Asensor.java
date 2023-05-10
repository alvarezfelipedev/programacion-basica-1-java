package ar.edu.unlam.pb1;

public class Asensor {
	private final int PISO_MAXIMO = 15;
	private final int PISO_MINIMO = 1;
	private final double PESO_MAXIMO = 1000;
	private final int CAPACIDAD_MAXIMA = 8;
	private boolean puertaAbierta;
	private boolean sobrecarga;
	private static long pisoActual;
	private double pesoActual;
	private int capacidadActual;
	
	// Constructores
	public void Ascensor(int capacidadMaxima, double pesoMaximo) {
		this.CAPACIDAD_MAXIMA = capacidadMaxima;
		this.PESO_MAXIMO = pesoMaximo;
	}
}
