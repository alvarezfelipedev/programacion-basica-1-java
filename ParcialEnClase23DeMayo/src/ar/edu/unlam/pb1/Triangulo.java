package ar.edu.unlam.pb1;

public class Triangulo {
	
	private int lado1;
	private int lado2;
	private int lado3;
	
	// Constructor
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	// Metodos
	public boolean equilatero() {
		boolean resultado = false;
		if(lado1 == lado2 && lado2 == lado3) {
			resultado = true;
			return resultado;
		}
		return resultado;
	}
	
	public boolean isosceles() {
		boolean resultado = false;
		if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			resultado = true;
			return resultado;
		}
		return resultado;
	}
	
	public boolean escaleno() {
		boolean resultado = false;
		if((lado1 != lado2 && lado2 != lado3 && lado1 != lado3) || !equilatero() || !isosceles()) {
			resultado = true;
			return resultado;
		}
		return resultado;
	}
	
}
