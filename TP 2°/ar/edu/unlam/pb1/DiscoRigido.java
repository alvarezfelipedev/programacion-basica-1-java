package ar.edu.unlam.pb1;

public class DiscoRigido {
	private double tamanio;
	private final double tamanioDVDenTB = 0.0045;
	private final double tamanioBlueRayenTB = 0.015;
	
	// Metodos
	
	public double conversoraDVD(int valor) {
		double resultado = 00.0F;
		double cantidadDeDvds = valor / this.tamanioDVDenTB;
		resultado = Math.ceil(cantidadDeDvds);
		return resultado;
	}
	
	public double conversoraBlueRay(int valor) {
		double resultado = 00.0F;
		double cantidadDeBlueRays = valor / this.tamanioBlueRayenTB;
		resultado = Math.ceil(cantidadDeBlueRays);
		return resultado;
	}
}
