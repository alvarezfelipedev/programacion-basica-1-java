package ar.edu.unlam.pb1;

public class ManejoAscensor {
	private final int PISO_MAXIMO = 15;
	private final int PISO_MINIMO = 1;
	private double PESO_MAXIMO;
	private int CAPACIDAD_MAXIMA;
	private boolean puertaAbierta;
	private boolean sobrecarga;
	private static long pisoActual;
	private double pesoActual;
	private int capacidadActual;
	
	// Constructores
	public ManejoAscensor(int capacidadMaxima, double pesoMaximo) {
		this.CAPACIDAD_MAXIMA = capacidadMaxima;
		this.PESO_MAXIMO = pesoMaximo;
	}
	
	// Metodos
	public boolean abrirPuerta() {
		puertaAbierta = true;
		return puertaAbierta;
	}
	
	public boolean cerrarPuerta() {
		puertaAbierta = false;
		return puertaAbierta;
	}
	
	public void subir() {
		pisoActual ++;
	}
	
	public boolean bajar() {
		boolean bajar = false;
		if(pisoActual != (int)PISO_MINIMO) {
			bajar = true;
			pisoActual--;
		}
		return bajar;
	}
	
	public int getPisoActual() {
		return (int)pisoActual;
	}
}
