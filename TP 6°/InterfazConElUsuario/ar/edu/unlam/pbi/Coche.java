package ar.edu.unlam.pb1;

public class Coche {
	private double velocidadInicial;
	private double aceleracion;

	// CONSTRUCTORES
	public Coche(double velocidadInicial, double aceleracion) {
		this.velocidadInicial = velocidadInicial;
		this.aceleracion = aceleracion;
	}

	// METODOS
	public double alcanzarVelocidadMaxima(double velocidadMaxima) {
		double tiempo = 0;
		double velocidad = velocidadInicial;

		while (velocidad < velocidadMaxima) {
			tiempo++;
			velocidad = velocidadInicial + aceleracion * tiempo;
		}
		return tiempo;
	}

}
